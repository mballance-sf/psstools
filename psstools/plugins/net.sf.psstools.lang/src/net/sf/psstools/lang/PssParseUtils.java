/****************************************************************************
 * Copyright 2015 Mentor Graphics Corporation
 * All Rights Reserved Worldwide
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See
 * the License for the specific language governing
 * permissions and limitations under the License.
 ****************************************************************************/

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
