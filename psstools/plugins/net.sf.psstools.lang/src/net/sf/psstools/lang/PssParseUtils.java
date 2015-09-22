package net.sf.psstools.lang;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class PssParseUtils {
	
	public static XtextResourceSet createXtextResourceSet() {
		Injector injector = new PSSStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet rs = (XtextResourceSet)injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		return rs;
	}
	
	public static void addFile(XtextResourceSet rs, File path) {
		String uri = "file://" + path.getAbsolutePath().replace('\\', '/');
		rs.getResource(URI.createURI(uri), true);
	}
	
	public static void addFiles(XtextResourceSet rs, List<File> paths) {
		for (File path : paths) {
			String uri = "file://" + path.getAbsolutePath().replace('\\', '/');
			rs.getResource(URI.createURI(uri), true);
		}
	}

}
