package net.sf.psstools.lang.ui.views.graph;

import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;

public class GraphLayoutAlgorithm extends AbstractLayoutAlgorithm {
	
	public GraphLayoutAlgorithm(int style) {
		super(style);
	}

	@Override
	protected void applyLayoutInternal(
			InternalNode[] 			entities, 
			InternalRelationship[]	relationships, 
			double 					bounds_x, 
			double 					bounds_y,
			double 					bounds_w, 
			double 					bounds_h) {
		
		for (InternalNode n : entities) {
			System.out.println("n: " + n.getLayoutEntity() + " " + n.getLayoutEntity().getGraphData() + " " + 
					n.getLayoutEntity().getLayoutInformation());
		}
	}

	@Override
	protected int getCurrentLayoutStep() {
		return 0;
	}

	@Override
	protected int getTotalNumberOfLayoutSteps() {
		return 4;
	}

	@Override
	protected boolean isValidConfiguration(boolean async, boolean cont) {
		if (async && cont) {
			return false;
		} else if (async && !cont) {
			return true;
		} else if (!async && cont) {
			return false;
		} else if (!async && !cont) {
			return true;
		}
		
		return false;
	}

	@Override
	protected void postLayoutAlgorithm(InternalNode[] arg0, InternalRelationship[] arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void preLayoutAlgorithm(
			InternalNode[] 			entities, 
			InternalRelationship[]	relationships, 
			double arg2, 
			double arg3,
			double arg4, 
			double arg5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLayoutArea(double arg0, double arg1, double arg2, double arg3) {
		throw new RuntimeException();
	}

}
