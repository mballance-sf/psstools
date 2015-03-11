package net.sf.psstools.lang.ui.views.graph;

import net.sf.psstools.lang.ui.views.graph.model.GraphNode;
import net.sf.psstools.lang.ui.views.graph.model.GraphNodeType;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IFigureProvider;
import org.eclipse.zest.core.widgets.ZestStyles;

public class GraphLabelProvider extends LabelProvider implements
		IFigureProvider, IConnectionStyleProvider {
	

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
			if (((GraphNode)c.dest).getType() == GraphNodeType.Join &&
					((GraphNode)c.source).getType() == GraphNodeType.Join) {
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
				return new FigureBranchPoint();
			} else if (n.getType() == GraphNodeType.Join) {
				return new FigureBranchJoin();
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

}
