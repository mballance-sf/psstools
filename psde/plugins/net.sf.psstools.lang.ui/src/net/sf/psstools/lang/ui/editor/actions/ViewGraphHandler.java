package net.sf.psstools.lang.ui.editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class ViewGraphHandler extends AbstractHandler implements IHandler {
	
	@Inject
	private IGenerator generator;
	
	@Inject
	private Provider<EclipseResourceFileSystemAccess> fsaP;
	
	@Inject
	IResourceDescriptions					resourceDescriptions;
	
	@Inject
	IResourceSetProvider					resourceSetProvider;
	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("execute");
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		ISelection sel = editor.getSite().getSelectionProvider().getSelection();

		if (editor instanceof XtextEditor) {
			XtextEditor xe = (XtextEditor)editor;
			final ITextSelection tsel = (ITextSelection)sel;
			
			xe.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
				public void process(XtextResource resource) throws Exception {
					IParseResult parseRes = resource.getParseResult();
					if (parseRes == null) {
						return;
					}
					ICompositeNode root = parseRes.getRootNode();
					int offset = tsel.getOffset();
					ILeafNode n = NodeModelUtils.findLeafNodeAtOffset(root, offset);
					EObject eobj = NodeModelUtils.findActualSemanticObjectFor(n);
					
					System.out.println("eobj: " + eobj);
		
					traverse("", eobj);
				}
			});
		}

		return null;
	}
	
	private void traverse(String ind, EObject eobj) {
		System.out.println(ind + " eobj=" + eobj);
		for (EObject c : eobj.eContents()) {
			traverse(ind + "  ", c);
		}
	}




}
