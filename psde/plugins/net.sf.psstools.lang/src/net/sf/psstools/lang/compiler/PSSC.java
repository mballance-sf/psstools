package net.sf.psstools.lang.compiler;

import java.io.File;

import net.sf.psstools.lang.PSSStandaloneSetup;
import net.sf.psstools.lang.elaborator.GraphElaborator;
import net.sf.psstools.lang.pSS.Model;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class PSSC implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String args[] = (String[])context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
	
		for (int i=0; i<args.length; i++) {
			System.out.println("ARG[" + i + "] " + args[i]);
		}
		
		Injector injector = new PSSStandaloneSetup().createInjectorAndDoEMFRegistration();
//		Injector injector = new PSSStandaloneSetup().createInjector();
		XtextResourceSet resource_set = (XtextResourceSet)injector.getInstance(XtextResourceSet.class);
		resource_set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		Resource resource = resource_set.createResource(URI.createURI("temp"));
//		Resource resource = resource_set.createResource(URI.createURI("http://www.sf.net/psstools/lang/PSS"));
	
		File current_dir = new File(System.getProperty("user.dir"));
		for (File f : current_dir.listFiles()) {
			if (f.isFile() && f.getName().endsWith(".pss")) {
				System.out.println("parsing file: " + f.getPath());
				String uri = "file://" + f.getAbsolutePath().replace('\\', '/');
				resource_set.getResource(URI.createURI(uri), true);
			}
		};
		
//		resource_set.getResources();
		
//		Resource resource = resource_set.createResource(URI.createURI("foo.pss"));

//		InputStream in = new FileInputStream("use_case.pss");
	
//		Object root = resource.getContents().get(0);
//		ModelImpl model = (ModelImpl)root;
		
		TreeIterator<Notifier> all_contents = resource_set.getAllContents();
		
		EcoreUtil.resolveAll(resource_set);
		
		GraphElaborator elab = new GraphElaborator();
		
		while (all_contents.hasNext()) {
			Notifier n = all_contents.next();
			if (n instanceof Model) {
				elab.addModel((Model)n);
			}
		}
		
		elab.elaborate("branching");
	
//		while (all_contents.hasNext()) {
//			Notifier n = all_contents.next();
//			
//			if (n instanceof ModelImpl) {
//				recurse("", (ModelImpl)n);
//			}
////			System.out.println("n: " + n);
//		}

//		System.out.println("root: " + root);
//		recurse("", model);
	
//		InputStream in = new FileInputStream("use_case.pss");
//
//		Injector injector = new PSSStandaloneSetup().createInjectorAndDoEMFRegistration();
//		IParser parser = injector.getInstance(PSSParser.class);
//		InputStreamReader rdr = new InputStreamReader(in);
//		
//		IParseResult result = parser.parse(rdr);
//		System.out.println("hasSyntaxErrors: " + result.hasSyntaxErrors());
//		
//		EObject root = result.getRootASTElement();
//		recurse("", root);

		

		return Status.OK_STATUS;
	}
	
	private void recurse(String ind, EObject obj) {
		System.out.println(ind + obj.toString());
		
//		if (obj instanceof graph_declaration) {
//			graph_declaration g = (graph_declaration)obj;
//			graph_or_struct_declaration gs = (graph_or_struct_declaration)g.getSuper();
//			System.out.println("Super: " + gs.eIsProxy());
//			System.out.println("  instanceof graph: " + (gs instanceof graph_declaration));
//			System.out.println("  instanceof struct: " + (gs instanceof graph_declaration));
//			recurse("      ", gs);
//			for (EObject eo : g.eCrossReferences()) {
//				System.out.println("cross: " + eo);
//			}
//		}
		for (EObject eo : obj.eContents()) {
			recurse(ind + "  ", eo);
		}
	}	

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
