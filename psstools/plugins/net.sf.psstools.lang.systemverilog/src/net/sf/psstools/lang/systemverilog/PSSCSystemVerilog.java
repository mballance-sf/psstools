package net.sf.psstools.lang.systemverilog;

import java.io.File;

import net.sf.psstools.lang.PssGeneratorUtils;
import net.sf.psstools.lang.PssParseUtils;
import net.sf.psstools.lang.elaborator.GraphElabResult;
import net.sf.psstools.lang.elaborator.GraphElaborator;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;

public class PSSCSystemVerilog implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		String graph = null;
		
		String args[] = (String[])context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		for (int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] " + args[i]);
			if (args[i].startsWith("-")) {
				if (args[i].equals("-root")) {
					graph = args[++i];
				}
			}
		}
		
		XtextResourceSet rs = PssParseUtils.createXtextResourceSet();
	
		File current_dir = new File(System.getProperty("user.dir"));
		for (File f : current_dir.listFiles()) {
			if (f.isFile() && f.getName().endsWith(".pss")) {
				System.out.println("Adding file: " + f.getAbsolutePath());
				PssParseUtils.addFile(rs, f);
			}
		};
		
		EcoreUtil.resolveAll(rs);
		
		GraphElaborator elab = new GraphElaborator(rs.getAllContents());
	
		System.out.println("Elaborating graph " + graph);
		GraphElabResult result = elab.elaborate(graph);
		
		IFileSystemAccess fsa = PssGeneratorUtils.createJavaFSA("generated-sv");
		PssSystemVerilogClassGenerator gen = new PssSystemVerilogClassGenerator(fsa, result);
		
		gen.generate();
		
		return Status.OK_STATUS;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
