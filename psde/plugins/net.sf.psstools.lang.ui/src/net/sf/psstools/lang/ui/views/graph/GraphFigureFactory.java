package net.sf.psstools.lang.ui.views.graph;

import java.util.Stack;

import net.sf.psstools.lang.Tuple;
import net.sf.psstools.lang.elaborator.DataField;
import net.sf.psstools.lang.elaborator.GraphElabResult;
import net.sf.psstools.lang.elaborator.rules.RuleBlockProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleRepeatProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemActionCallRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtProduction;
import net.sf.psstools.lang.ui.CompartmentFigure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FocusBorder;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.GroupBoxBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.Triangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.widgets.internal.ContainerFigure;

public class GraphFigureFactory {
	GraphElabResult				fElabResult;
	private static Color classColor = new Color(null,255,255,206);
	
	public GraphFigureFactory() {
	}
	
	public IFigure build(GraphElabResult elab_result) {
		fElabResult = elab_result;
		
		CompartmentFigure fig = new CompartmentFigure();
		GridLayout layout = new GridLayout();
		fig.setLayoutManager(layout);
		fig.setBorder(new LineBorder(ColorConstants.black, 1));
//		GroupBoxBorder border = new GroupBoxBorder(elab_result.getGraph().getName());
//		fig.setBorder(border);
		
		Label l = new Label(elab_result.getGraph().getName());
		fig.add(l);
		layout.setConstraint(l, new GridData(SWT.CENTER, SWT.TOP, false, false));
		
		ChopboxAnchor root_a = new ChopboxAnchor(l);
		build(fElabResult.getGraph().getRootRule(), root_a, fig);
	
		return fig;
	}
	
	private AbstractConnectionAnchor build(RuleProduction node, AbstractConnectionAnchor last_connection, IFigure parent) {
		AbstractConnectionAnchor ret = last_connection;
		LayoutManager parent_layout = parent.getLayoutManager();
	
		switch (node.getType()) {
			case Sequence: {
				RuleSeqProduction seq = (RuleSeqProduction)node;
			
				AbstractConnectionAnchor conn = last_connection;
				for (RuleSeqItemRef r : seq.getSeqItems()) {
					conn = build(r, conn, parent);
				}
				ret = conn;
			} break;
		
			/**
			 * AltParallel
			 * - Add an alternative-set node to the parent scope
			 * - Add a choice node to the alternative-set node
			 * - Connect the last anchor point 
			 * - Add alternative nodes to the alternative-set node
			 */
			case AltParallel: {
				GridData gd;
				RuleStmtProduction alt_parallel = (RuleStmtProduction)node;
				int n_children = alt_parallel.getChildren().size();

				// Create a container to hold the choice node and
				// alternatives
//				CompartmentFigure super_fig = new CompartmentFigure();
//				LayoutManager super_fig_layout = new GridLayout();
//				super_fig.setLayoutManager(super_fig_layout);
//				parent.add(super_fig);
//				parent.getLayoutManager().setConstraint(super_fig, 
//						new GridData(SWT.CENTER, SWT.TOP, false, false));

				// Create a figure to represent the alternative set
				CompartmentFigure fig = new CompartmentFigure();
				fig.setBorder(new LineBorder(ColorConstants.black, 1));
				parent.add(fig);
				parent.getLayoutManager().setConstraint(fig, 
						new GridData(SWT.CENTER, SWT.TOP, false, false));
				GridLayout fig_layout = new GridLayout(n_children, false);
				fig.setLayoutManager(fig_layout);
				
				// Create the choice node
				Triangle choice_node = new Triangle();
				choice_node.setPreferredSize(20, 20);
				fig.add(choice_node);
				gd = new GridData(SWT.CENTER, SWT.TOP, false, false);
				gd.horizontalSpan = n_children;
				fig_layout.setConstraint(choice_node, gd);
				
				ChopboxAnchor choice_node_anchor = new ChopboxAnchor(choice_node);
				if (last_connection != null) {
					// Add connection to our choice node
					PolylineConnection c = new PolylineConnection();
					c.setSourceAnchor(last_connection);
					c.setTargetAnchor(choice_node_anchor);
//					parent.add(c);
				}
				
				Ellipse join_point = new Ellipse();
				join_point.setPreferredSize(5, 5);
				ChopboxAnchor join_anchor = new ChopboxAnchor(join_point);
			
				// Create an anchor for each 
				ChopboxAnchor alt_head_cl[] = new ChopboxAnchor[n_children];
				for (int i=0; i<n_children; i++) {
					Ellipse alt_head = new Ellipse();
					alt_head.setPreferredSize(5, 5);
					fig.add(alt_head);
					fig_layout.setConstraint(alt_head, new GridData(SWT.CENTER, SWT.TOP, false, false));
					ChopboxAnchor alt_head_c = new ChopboxAnchor(alt_head);
					alt_head_cl[i] = alt_head_c;
					
					// Connect from choice node to alt_head
					PolylineConnection choice2head = new PolylineConnection();
					choice2head.setSourceAnchor(choice_node_anchor);
					choice2head.setTargetAnchor(alt_head_c);
//					fig.add(choice2head);
				}
				
				for (int i=0; i<n_children; i++) {
					RuleProduction c = alt_parallel.getChildren().get(i);

					CompartmentFigure alt_fig = new CompartmentFigure();
					alt_fig.setBorder(new LineBorder(ColorConstants.black, 1));
					GridLayout alt_layout = new GridLayout();
					alt_fig.setLayoutManager(alt_layout);
					
					fig.add(alt_fig);
					
					ChopboxAnchor alt_head_c = alt_head_cl[i];
					
					AbstractConnectionAnchor anchor = build(c, alt_head_c, alt_fig);
					
					if (anchor != null) {
						// Add connection from the end of the sub-item to our join node
						PolylineConnection conn = new PolylineConnection();
						conn.setSourceAnchor(anchor);
						conn.setTargetAnchor(join_anchor);
//						fig.add(conn);
					}
				}

				fig.add(join_point);
				gd = new GridData(SWT.CENTER, SWT.TOP, false, false);
				gd.horizontalSpan = n_children;
				fig_layout.setConstraint(join_point, gd);
				
				ret = join_anchor;
			} break;
			
			case Block: {
				RuleBlockProduction block = (RuleBlockProduction)node;
				
				AbstractConnectionAnchor conn = last_connection;
				for (RuleProduction p : block.getChildren()) {
					conn = build(p, conn, parent);
				}
			
				ret = conn;
			} break;
			
			case Repeat: {
				RuleRepeatProduction repeat = (RuleRepeatProduction)node;
				Ellipse head_point = new Ellipse();
				head_point.setPreferredSize(5, 5);
				ChopboxAnchor head_anchor = new ChopboxAnchor(head_point);
				
				parent.add(head_point);
				parent_layout.setConstraint(head_point, 
						new GridData(SWT.CENTER, SWT.TOP, false, false));
				
				
				// TODO: connect last to this
				// TODO: update last_connection
				
				Ellipse join_point = new Ellipse();
				join_point.setPreferredSize(5, 5);
				ChopboxAnchor join_anchor = new ChopboxAnchor(join_point);
			
				AbstractConnectionAnchor conn = build(repeat.getProduction(), last_connection, parent);
				
				// TODO: make connection
			
				parent.add(join_point);
				parent_layout.setConstraint(join_point, 
						new GridData(SWT.CENTER, SWT.TOP, false, false));
			} break;
			
			default: {
				System.out.println("unhandled: " + node.getType());
			}
			
		}
		
		return ret;
	}
	
	private AbstractConnectionAnchor build(RuleSeqItemRef ref, AbstractConnectionAnchor last_connection, IFigure parent) {
		AbstractConnectionAnchor ret = last_connection;
		LayoutManager parent_layout = parent.getLayoutManager();
		
		switch (ref.getType()) {
			case RuleVariable: {
				DataField field = ref.getDataField();
				CompartmentFigure var = new CompartmentFigure();
				var.setOpaque(true);
				var.setBorder(new LineBorder(ColorConstants.black, 1));
				var.setBackgroundColor(classColor);
				GridLayout layout = new GridLayout();
				var.setLayoutManager(layout);
				
				ret = new ChopboxAnchor(var);
				
				if (field != null) {
					Label l = new Label(ref.getName() + " : " + field.getType());
					var.add(l);
					layout.setConstraint(l, new GridData(SWT.CENTER, SWT.TOP, false, false));
				} else {
					Label l = new Label(ref.getName());
					var.add(l);
					layout.setConstraint(l, new GridData(SWT.CENTER, SWT.TOP, false, false));
				}
				
//				var.setVisible(false);
				
				parent.add(var);
				parent_layout.setConstraint(var, new GridData(SWT.CENTER, SWT.TOP, false, false));
			} break;
			
			case ActionCall: {
				RuleSeqItemActionCallRef action = (RuleSeqItemActionCallRef)ref;
				Label l = new Label(action.getName() + "." + action.getActionName());
				parent.add(l);
				parent_layout.setConstraint(l, new GridData(SWT.CENTER, SWT.TOP, false, false));
				ret = new ChopboxAnchor(l);
			}
		}
		
		if (last_connection != null && ret != null) {
			PolylineConnection conn = new PolylineConnection();
			conn.setSourceAnchor(last_connection);
			conn.setTargetAnchor(ret);
//			parent.add(conn);
		}
		
		return ret;
	}

}
