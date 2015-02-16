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
//		rl.get(0).
		// TODO Auto-generated method stub
		
	}

	
}
