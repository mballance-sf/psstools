package net.sf.psstools.lang.docbuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class HTMLDocBuilderApp implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Injector injector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resource_set = (XtextResourceSet)injector.getInstance(XtextResourceSet.class);
		resource_set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		String args[] = (String[])context.getArguments().get(
				IApplicationContext.APPLICATION_ARGS);

		File grammar_file = null;
		File output_file = null;
		
		for (int i=0; i<args.length; i++) {
			if (args[i].charAt(0) == '-') {
				if (args[i].equals("-grammar")) {
					i++;
					grammar_file = new File(args[i]);
				} else if (args[i].equals("-o")) {
					i++;
					output_file = new File(args[i]);
				} else {
					return fatal("Unknown option: " + args[i]);
				}
			} else {
				return fatal("Unknown argument: " + args[i]);
			}
		}
		
		if (grammar_file == null) {
			return fatal("Grammar file not specified");
		}
		if (!grammar_file.isFile()) {
			return fatal("Grammar file " + grammar_file.getAbsolutePath() + 
					" does not exist");
		}
		
		if (output_file == null) {
			return fatal("Output file not specified");
		}
		
		note("Grammar file path: " + grammar_file.getAbsolutePath());
	
		// Parse the grammar file
		String grammar_uri = 
				"file://" + grammar_file.getAbsolutePath().replace('\\', '/');
		Resource rs = resource_set.getResource(URI.createURI(grammar_uri), true);
	
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(output_file);
		} catch (IOException e) {
			return fatal("Failed to open output file: " + 
					output_file.getAbsolutePath() + " ; " + 
					e.getMessage());
		}
		
		note("Generating output to file: " + output_file.getAbsolutePath());
		
		HTMLDocRenderer renderer = new HTMLDocRenderer(fos);
		DocBuilder builder = new DocBuilder(renderer);
		
		builder.process((XtextResource)rs);
		renderer.close();
		
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EcoreUtil.resolveAll(resource_set);
		
		return Status.OK_STATUS;
	}

	@Override
	public void stop() { }

	private void note(String msg) {
		System.out.println("Note: " + msg);
	}
	
	private Object fatal(String msg) {
		System.out.println("Error: " + msg);
		return new Integer(1);
	}
}
