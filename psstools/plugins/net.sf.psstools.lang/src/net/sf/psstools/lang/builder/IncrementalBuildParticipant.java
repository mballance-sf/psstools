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
package net.sf.psstools.lang.builder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class IncrementalBuildParticipant implements IXtextBuilderParticipant {

	public IncrementalBuildParticipant() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		ResourceSet rs = context.getResourceSet();
		EList<Resource> rl = rs.getResources();
		System.out.println("build " + context.getBuiltProject());
//		rl.get(0).
		// TODO Auto-generated method stub
		
	}

	
}
