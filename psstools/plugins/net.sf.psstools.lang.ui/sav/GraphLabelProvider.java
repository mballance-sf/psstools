package net.sf.psstools.lang.ui.views.graph;

import net.sf.psstools.lang.ui.views.graph.model.GraphNode;
import net.sf.psstools.lang.ui.views.graph.model.GraphNodeType;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.IConnectionStyleBezierExtension;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IFigureProvider;
import org.eclipse.zest.core.widgets.ZestStyles;

public class GraphLabelProvider extends LabelProvider implements
		IFigureProvider, IConnectionStyleProvider {
//		IConnectionStyleBezierExtension {
	

	@Override
	public String getText(Object element) {
		if (element instanceof GraphNode) {
			return ((GraphNode)element).toString();
		} else if (element instanceof EntityConnectionData) {
			return "";
		} else {
			System.out.println("getText: " + element);
		}
		// TODO Auto-generated method stub
		return super.getText(element);
	}

	@Override
	public Color getColor(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getConnectionStyle(Object obj) {
		if (obj instanceof EntityConnectionData) {
			
			EntityConnectionData c = (EntityConnectionData)obj;
			if (isRepeat(c)) {
				return ZestStyles.CONNECTIONS_DIRECTED;
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	@Override
	public Color getHighlightColor(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLineWidth(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IFigure getTooltip(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFigure getFigure(Object obj) {
		if (obj instanceof GraphNode) {
			GraphNode n = (GraphNode)obj;
			if (n.getType() == GraphNodeType.Branch) {
				FigureBranchPoint ret = new FigureBranchPoint();
				return ret;
			} else if (n.getType() == GraphNodeType.Join ||
					n.getType() == GraphNodeType.RepeatStart ||
					n.getType() == GraphNodeType.RepeatEnd) {
				return new FigureBranchJoin();
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	

//	@Override
//	public double getEndAngle(Object obj) {
//		if (obj instanceof EntityConnectionData) {
//			EntityConnectionData cd = (EntityConnectionData)obj;
//			if (isRepeat(cd)) {
//				return 45;
//			}
//		}
//
//		return Double.NaN;
//	}
//
//	@Override
//	public double getEndDistance(Object obj) {
//		if (obj instanceof EntityConnectionData) {
//			EntityConnectionData cd = (EntityConnectionData)obj;
//			if (isRepeat(cd)) {
//				return 45;
//			}
//		}
//		return Double.NaN;
//	}
//
//	@Override
//	public double getStartAngle(Object obj) {
//		if (obj instanceof EntityConnectionData) {
//			EntityConnectionData cd = (EntityConnectionData)obj;
//			if (isRepeat(cd)) {
//				return 45;
//			}
//		}
//		return Double.NaN;
//	}
//
//	@Override
//	public double getStartDistance(Object obj) {
//		if (obj instanceof EntityConnectionData) {
//			EntityConnectionData cd = (EntityConnectionData)obj;
//			if (isRepeat(cd)) {
//				return 100;
//			}
//		}
//		return Double.NaN;
//	}

	public static boolean isRepeat(EntityConnectionData cd) {
		GraphNode s = (GraphNode)cd.source;
		GraphNode d = (GraphNode)cd.dest;
	
		if (s.getType() == GraphNodeType.RepeatEnd ||
				s.getType() == GraphNodeType.RepeatStart) {
			System.out.println("s: " + s.getType() + " d: " + d.getType());
		}
		
		return (s.getType() == GraphNodeType.RepeatStart &&
				d.getType() == GraphNodeType.RepeatEnd);
	}
	
	
}
