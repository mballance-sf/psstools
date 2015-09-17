package net.sf.psstools.lang.ui.views;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xtext.GrammarResource;

import net.sf.psstools.lang.docbuilder.DocBuilder;

public class EBnfView extends ViewPart implements IPartListener, IDocumentListener {
	private StyledText				fText;
	private IXtextDocument			fLastDoc;

	@Override
	public void createPartControl(Composite parent) {
		fText = new StyledText(parent, SWT.WRAP+SWT.V_SCROLL+SWT.READ_ONLY);
		getSite().getWorkbenchWindow().getPartService().addPartListener(this);
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
				
					DocBuilder db = new DocBuilder(sb);
					
					
					try {
						db.process(resource);
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
