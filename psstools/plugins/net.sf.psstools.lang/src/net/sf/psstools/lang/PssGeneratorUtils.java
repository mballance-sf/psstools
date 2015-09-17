package net.sf.psstools.lang;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PssGeneratorUtils {
	
	public static IFileSystemAccess createJavaFSA(String path) {
		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		
		Injector injector = Guice.createInjector(new AbstractGenericModule() {
			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}
		});
		injector.injectMembers(fsa);
		fsa.setOutputPath(path);
		
		return fsa;
	}

}
