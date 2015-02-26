package net.sf.psstools.lang.ui.views;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.StyledTextContent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.impl.AbstractElementImpl;
import org.eclipse.xtext.impl.AlternativesImpl;
import org.eclipse.xtext.impl.AssignmentImpl;
import org.eclipse.xtext.impl.CrossReferenceImpl;
import org.eclipse.xtext.impl.GroupImpl;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.impl.TypeRefImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.XtextParser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xtext.GrammarResource;

import com.google.inject.Injector;

public class EBnfView extends ViewPart implements IPartListener, IDocumentListener {
	private StyledText				fText;
	private IXtextDocument			fLastDoc;
	private List<ILeafNode>			fLeafNodes = new ArrayList<>();
	private int						fLeafNodeIdx;
	private Font					fHeaderFont;

	@Override
	public void createPartControl(Composite parent) {
		fText = new StyledText(parent, SWT.WRAP+SWT.V_SCROLL);
		getSite().getWorkbenchWindow().getPartService().addPartListener(this);
		fHeaderFont = JFaceResources.getHeaderFont();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		if (part instanceof XtextEditor) {
			XtextEditor xed = (XtextEditor)part;
			final IXtextDocument xd = xed.getDocument();
	
//			Injector guiceInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
//			IParser parser = guiceInjector.getInstance(XtextParser.class);
//			StringInputStream in = new StringInputStream(
//					xed.getDocumentProvider().getDocument(xed.getEditorInput()).get());
//			InputStreamReader rdr = new InputStreamReader(in);
//			IParseResult result = parser.parse(rdr);
//			EObject root = result.getRootASTElement();
//			recurse("", root);
			
			if (xd != fLastDoc) {
				if (fLastDoc != null) {
					fLastDoc.removeDocumentListener(this);;
				}
				xd.addDocumentListener(this);
				fLastDoc = xd;
			}
			
			updateView(xd);
		} else if (part instanceof IEditorPart) {
			// Selected a different editor
			if (fLastDoc != null) {
				fLastDoc.removeDocumentListener(this);
				fLastDoc = null;
				fText.setText("");
			}
		}
	}
	
	private void updateView(final IXtextDocument xd) {
		xd.readOnly(new IUnitOfWork.Void<XtextResource>() {
			public void process(XtextResource resource) throws Exception {
				if (resource instanceof GrammarResource) {
					TextPresentationStringBuilder sb = new TextPresentationStringBuilder();
					
					ICompositeNode node = NodeModelUtils.getNode(resource.getContents().get(0));
					fLeafNodes.clear();
					for (ILeafNode ln : node.getLeafNodes()) {
						fLeafNodes.add(ln);
					}
					fLeafNodeIdx = 0;
					
					try {
					traverse(sb, "", resource.getContents().get(0));
//					traverse(sb, "", root);
					} catch (Exception e) {
						e.printStackTrace();
					}
					fText.setText(sb.toString());
					TextPresentation.applyTextPresentation(
							sb.presentation(), fText);
				}
			}
		});		
	}
	
	

	@Override
	public void documentAboutToBeChanged(DocumentEvent event) { }

	@Override
	public void documentChanged(DocumentEvent event) {
		updateView(fLastDoc);
	}

	private void recurse(String ind, EObject obj) {
		System.out.println(ind + obj.toString());
		for (EObject eo : obj.eContents()) {
			recurse(ind + "  ", eo);
		}
	}
	
	private void traverse(
			TextPresentationStringBuilder sb, 
			String 					ind, 
			EObject 				obj) {
		// Before we 
		if (obj instanceof ParserRuleImpl) {
			ParserRuleImpl ri = (ParserRuleImpl)obj;
			ICompositeNode ri_n = NodeModelUtils.getNode(ri);
			int lineno = ri_n.getStartLine();
			
			// Spin forward
			while (fLeafNodes != null && fLeafNodeIdx < fLeafNodes.size() &&
					fLeafNodes.get(fLeafNodeIdx).getStartLine() < lineno) {
				ILeafNode ln = fLeafNodes.get(fLeafNodeIdx);
				
				if (ln.getText() != null && ln.getText().trim().startsWith("/*")) {
					List<String> lines = processComment(ln.getText());
					
					if (lines.size() > 0 && lines.get(0).trim().startsWith("Heading:")) {
						int heading_idx = lines.get(0).indexOf("Heading:");
						String text = lines.get(0).substring(heading_idx+"Heading:".length()).trim();
						sb.setFont(fHeaderFont);
						sb.append("\n");
						sb.append(text);
						sb.append("\n");
						sb.clrFont();
						sb.append("\n");
					}
				}
				fLeafNodeIdx++;
			}
			
			sb.append(ind);
			sb.append(ri.getName() + " ::= ");
			for (EObject eo : obj.eContents()) {
				production(sb, ind + "    ", eo);
			}
			sb.append("\n\n");
		} else {
			for (EObject eo : obj.eContents()) {
				traverse(sb, ind, eo);
			}
		}
	}
	
	private List<String> processComment(String comment) {
		List<String> ret = new ArrayList<String>();
		StringBuilder line = new StringBuilder();
		int i=0;
		int ch;
		
		while (i<comment.length()) {
			line.setLength(0);
	
			// Trim leading whitespace
			while (i < comment.length() && Character.isWhitespace(comment.charAt(i))) {
				i++;
			}
			
			ch = (i<comment.length())?comment.charAt(i):-1;
			
			if (ch == '/') {
				ch = (i+1<comment.length())?comment.charAt(i+1):-1;
				if (ch == '*') {
					// skip this line
					while (i < comment.length() && comment.charAt(i) != '\n') {
						i++;
					}
					i++;
				} else if (ch == '/') {
					// Read this line
					while (i < comment.length() && comment.charAt(i) != '\n') {
						if (comment.charAt(i) != '\r') {
							line.append(comment.charAt(i));
						}
						i++;
					}
					i++;
				}
			} else {
				if (ch == '*') {
					i++;
				}
				
				while (i < comment.length() && comment.charAt(i) != '\n') {
					if (comment.charAt(i) != '\r') {
						line.append(comment.charAt(i));
					}
					i++;
				}
				i++;
			}
			
			if (line.length() > 0) {
				ret.add(line.toString());
			}
		}
		
		return ret;
	}
	
	private void production(TextPresentationStringBuilder sb, String ind, EObject obj) {
		AbstractElementImpl ai = (obj instanceof AbstractElementImpl)?(AbstractElementImpl)obj:null;
		String closing = "";
		
		if (ai != null && ai.getCardinality() != null) {
			sb.insertWS();
			if (ai.getCardinality().equals("*")) {
				sb.append("{");
				closing = "}";
			} else if (ai.getCardinality().equals("?")) {
				sb.append("[");
				closing = "]";
			}
		}
		
		if (obj instanceof AlternativesImpl) {
			boolean all_keywords = true;
			for (EObject eo : obj.eContents()) {
				if (!(eo instanceof KeywordImpl)) {
					all_keywords = false;
				}
			}
			
			if (all_keywords) {
				for (int i=0; i<obj.eContents().size(); i++) {
					EObject eo = obj.eContents().get(i);
					
					sb.insertWS();
					int old_len = sb.length();
					production(sb, ind, eo);
					if (old_len != sb.length() && i+1 < obj.eContents().size()) {
						sb.append(" | ");
					}
				}
			} else {
				sb.append("\n" + ind + "  ");
				for (int i=0; i<obj.eContents().size(); i++) {
					EObject eo = obj.eContents().get(i);
					int old_len = sb.length();
					production(sb, ind, eo);
					if (old_len != sb.length() && i+1 < obj.eContents().size()) {
						sb.append("\n" + ind + "| ");
					}
				}
			}
		} else if (obj instanceof AssignmentImpl) {
			production(sb, ind, obj.eContents().get(0));
		} else if (obj instanceof RuleCallImpl) {
			RuleCallImpl rc = (RuleCallImpl)obj;

			sb.insertWS();
//			sb.append(rc.getRule().getName());
			if (rc.basicGetRule() != null) {
				sb.append(rc.basicGetRule().getName());
			} else {
//				System.out.println("ruleCall: " + rc + " " + rc.eGet(XtextPackage.RULE_CALL, false, false));
			}
		} else if (obj instanceof GroupImpl) {
			for (EObject eo : obj.eContents()) {
				production(sb, ind, eo);
			}
		} else if (obj instanceof KeywordImpl) {
			KeywordImpl k = (KeywordImpl)obj;
			sb.insertWS();
			sb.keyword(k.getValue());
		} else if (obj instanceof CrossReferenceImpl) {
			CrossReferenceImpl cr = (CrossReferenceImpl)obj;
			for (EObject eo : obj.eContents()) {
				production(sb, ind, eo);
			}
		} else if (obj instanceof RuleCallImpl) {
			RuleCallImpl rc = (RuleCallImpl)obj;
			sb.insertWS();
//			sb.append(rc.getRule().getName());
			sb.append(rc.basicGetRule().getName());
		} else if (obj instanceof TypeRefImpl) {
		}
	
		if (!closing.equals("")) {
			sb.insertWS();
			sb.append(closing);
		}
	}
	

	@Override
	public void partBroughtToTop(IWorkbenchPart part) { }
	@Override
	public void partClosed(IWorkbenchPart part) { } 
	@Override
	public void partDeactivated(IWorkbenchPart part) { }

	@Override
	public void partOpened(IWorkbenchPart part) { }

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(this);
		super.dispose();
	}

	
}
