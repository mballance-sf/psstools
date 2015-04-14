package net.sf.psstools.lang.ui.views.graph;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.DataField;
import net.sf.psstools.lang.elaborator.DataType;
import net.sf.psstools.lang.elaborator.DataTypeStruct;
import net.sf.psstools.lang.elaborator.DataTypeSymbol;
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
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.GroupBoxBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.Triangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

public class GraphFigureFactory {
	GraphElabResult				fElabResult;
	private static Color classColor = new Color(null,255,255,206);
	private static Color 		fActionColor = new Color(null, 0x20, 0xFF, 0x20);
	private static List<Color>	fScopeColorList;
	
	static {
		fScopeColorList = new ArrayList<Color>();
		
		for (int i=0; i<4; i++) {
			// ff f3 e6
			// ff e7 ce
			// ff d7 b5
//			fScopeColorList.add(new Color(null, 0xb0, 0x80, 0x40+(0x10*i)));
			fScopeColorList.add(new Color(null, 0xff, 0xf0-(0x10*i), 0xe5-(0x20*i)));
		}
	}
	
	public GraphFigureFactory() {
	}
	
	public IFigure build(GraphElabResult elab_result) {
		fElabResult = elab_result;
//		LayeredPane root = new LayeredPane();
//		root.setLayoutManager(new StackLayout());
//		root.setBorder(new LineBorder());
		
//		Layer fig_layer = new Layer();
//		fig_layer.setLayoutManager(new GridLayout());
//		root.add(fig_layer);
		
//		fConnLayer = new ConnectionLayer();
//		fConnLayer.setAntialias(1);
//		fConnLayer.setConnectionRouter(ConnectionRouter.NULL);
//		root.add(fConnLayer);
		
		CompartmentFigure fig = new CompartmentFigure();
		GridLayout layout = new GridLayout();
		fig.setLayoutManager(layout);
//		fig.setBorder(new LineBorder(ColorConstants.black, 1));
	
		
//		GroupBoxBorder border = new GroupBoxBorder(elab_result.getGraph().getName());
//		fig.setBorder(border);
		
		Label l = new Label(elab_result.getGraph().getName());
		fig.add(l);
		layout.setConstraint(l, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
		
		ChopboxAnchor root_a = new ChopboxAnchor(l);
		build(
				0, 
				fElabResult.getGraph().getRoot(), 
				root_a, 
				fig,
				null);
		
//		fig_layer.add(fig);
	
		return fig;
	}
	
	private AbstractConnectionAnchor build(
			int							level,
			RuleProduction 				node, 
			AbstractConnectionAnchor 	last_connection, 
			IFigure 					parent,
			ConnectionLayer				conn_layer) {
		AbstractConnectionAnchor ret = last_connection;
		LayoutManager parent_layout = parent.getLayoutManager();

		switch (node.getType()) {
			case Sequence: {
				RuleSeqProduction seq = (RuleSeqProduction)node;
			
				AbstractConnectionAnchor conn = last_connection;
				for (RuleSeqItemRef r : seq.getSeqItems()) {
					conn = build(level, r, conn, parent, conn_layer);
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

				// Create a figure to represent the alternative set
				RoundedRectangle fig = new RoundedRectangle();
				fig.setOpaque(false);
				fig.setCornerDimensions(new Dimension(10,10));
				fig.setBackgroundColor(getScopeColor(level));
				parent.add(fig);
				parent.getLayoutManager().setConstraint(fig, 
						new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
				GridLayout fig_layout = new GridLayout(n_children, false);
				fig.setLayoutManager(fig_layout);
				
				// Create the choice node
				Triangle choice_node = new Triangle();
				choice_node.setPreferredSize(20, 20);
				fig.add(choice_node);
				gd = new GridData(SWT.CENTER, SWT.BEGINNING, false, false);
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
					fig_layout.setConstraint(alt_head, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
					ChopboxAnchor alt_head_c = new ChopboxAnchor(alt_head);
					alt_head_cl[i] = alt_head_c;

				}
				
				// Create ALT to alternative-head connectors
				for (int i=0; i<n_children; i++) {
					// Connect from choice node to alt_head
					PolylineConnection choice2head = new PolylineConnection();
					choice2head.setSourceAnchor(choice_node_anchor);
					choice2head.setTargetAnchor(alt_head_cl[i]);
					fig.add(choice2head);
				}
			
				PolylineConnection alt_head2alt_l[] = new PolylineConnection[n_children];
				// Create the alternative-head to alternative connectors
				for (int i=0; i<n_children; i++) {
					alt_head2alt_l[i] = new PolylineConnection();
					alt_head2alt_l[i].setSourceAnchor(alt_head_cl[i]);
					fig.add(alt_head2alt_l[i]);
				}
			
				AbstractConnectionAnchor anchor_l[] = new AbstractConnectionAnchor[n_children];
				for (int i=0; i<n_children; i++) {
					RuleProduction c = alt_parallel.getChildren().get(i);

					RoundedRectangle alt_fig = new RoundedRectangle();
					alt_fig.setCornerDimensions(new Dimension(10, 10));
					alt_fig.setBackgroundColor(getScopeColor(level+1));
					GridLayout alt_layout = new GridLayout();
					alt_fig.setLayoutManager(alt_layout);
					
					fig.add(alt_fig);
					fig.setConstraint(alt_fig, 
							new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
					
					ChopboxAnchor alt_head_c = alt_head_cl[i];
					
					anchor_l[i] = build(level+1, c, alt_head_c, alt_fig, conn_layer);
					
					if (anchor_l[i] != null) {
						// Connect the alt-head to alt
						alt_head2alt_l[i].setTargetAnchor(anchor_l[i]);
					}
				}
				
				AbstractConnectionAnchor anchor_tail_l[] = new AbstractConnectionAnchor[n_children];
				Ellipse anchor_tail_e[] = new Ellipse[n_children];
				for (int i=0; i<n_children; i++) {
					anchor_tail_e[i] = new Ellipse();
					anchor_tail_e[i].setPreferredSize(1, 1);
					
					anchor_tail_l[i] = new ChopboxAnchor(anchor_tail_e[i]);
					PolylineConnection conn = new PolylineConnection();
					conn.setSourceAnchor(anchor_l[i]);
					conn.setTargetAnchor(anchor_tail_l[i]);
					fig.add(conn);
				}
				
				// Connect the alternatives to the join point
				for (int i=0; i<n_children; i++) {
					fig.add(anchor_tail_e[i]);
					fig.setConstraint(anchor_tail_e[i], 
							new GridData(SWT.CENTER, SWT.CENTER, false, false));
				}
				
				for (int i=0; i<n_children; i++) {
					// Add connection from the end of the sub-item to our join node
					PolylineConnection conn = new PolylineConnection();
					conn.setSourceAnchor(anchor_tail_l[i]);
					conn.setTargetAnchor(join_anchor);
					fig.add(conn);
				}

				fig.add(join_point);
				gd = new GridData(SWT.CENTER, SWT.BEGINNING, false, false);
				gd.horizontalSpan = n_children;
				fig_layout.setConstraint(join_point, gd);
				
				ret = join_anchor;
			} break;
			
			case Block: {
				RuleBlockProduction block = (RuleBlockProduction)node;
				
				AbstractConnectionAnchor conn = last_connection;
				for (RuleProduction p : block.getChildren()) {
					conn = build(level, p, conn, parent, conn_layer);
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
						new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
				
				
				// TODO: connect last to this
				// TODO: update last_connection
				
				Ellipse join_point = new Ellipse();
				join_point.setPreferredSize(5, 5);
				ChopboxAnchor join_anchor = new ChopboxAnchor(join_point);
			
				AbstractConnectionAnchor conn = build(level, repeat.getProduction(), 
						last_connection, parent, conn_layer);
				
				// TODO: make connection
			
				parent.add(join_point);
				parent_layout.setConstraint(join_point, 
						new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
			} break;
			
			default: {
				System.out.println("unhandled: " + node.getType());
			}
			
		}
		
		return ret;
	}
	
	private AbstractConnectionAnchor build(int level, RuleSeqItemRef ref, 
			AbstractConnectionAnchor last_connection, IFigure parent, ConnectionLayer conn_layer) {
		AbstractConnectionAnchor ret = last_connection;
		LayoutManager parent_layout = parent.getLayoutManager();
		
		switch (ref.getType()) {
			case RuleVariable: {
				DataField field = ref.getDataField();
				CompartmentFigure var = new CompartmentFigure();
				
				ret = new ChopboxAnchor(var);
			
				if (field != null && field.getType() != null) {
					DataType dt = field.getType();
					switch (dt.getType()) {
						case Symbol: {
							DataTypeSymbol dts = (DataTypeSymbol)dt;
							GridLayout layout = new GridLayout();
							var.setLayoutManager(layout);
							var.setBorder(new GroupBoxBorder(field.getName()));
							
							if (dts.getProduction() != null) {
								build(level, dts.getProduction(), last_connection, var, conn_layer);
							}
						} break;
						
						case Struct: {
							DataTypeStruct dts = (DataTypeStruct)dt;
							var.setLayoutManager(new ToolbarLayout());
							var.setOpaque(true);
							GroupBoxBorder border = 
									new GroupBoxBorder(field.getName() + " : " + dts.getName());
							var.setBorder(border);
							var.setBackgroundColor(classColor);
							
							for (DataField f : dts.getFields()) {
								Label l = new Label(f.getName());
								var.add(l);
							}
						} break;
				
						default: {
							GridLayout layout = new GridLayout();
							var.setLayoutManager(layout);
							var.setOpaque(true);
							var.setBorder(new LineBorder(ColorConstants.black, 1));
							var.setBackgroundColor(classColor);
							
							Label l = new Label(ref.getName() + " : " + field.getType());
							var.add(l);
							layout.setConstraint(l, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
							} break;
					}
				} else {
					LayoutManager layout = new GridLayout();
					var.setLayoutManager(layout);
					Label l = new Label(ref.getName());
					var.add(l);
					layout.setConstraint(l, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
				}
				
				parent.add(var);
				parent_layout.setConstraint(var, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
			} break;
			
			case ActionCall: {
				RuleSeqItemActionCallRef action = (RuleSeqItemActionCallRef)ref;
				Ellipse action_el = new Ellipse();
				action_el.setOpaque(true);
				action_el.setBackgroundColor(fActionColor);
				
				Label l = new Label(action.getName() + "." + action.getActionName() + "()");
				action_el.add(l);
				action_el.setLayoutManager(new GridLayout());
				action_el.setConstraint(l, new GridData(SWT.CENTER, SWT.CENTER, false, false));
				
				parent.add(action_el);
				parent_layout.setConstraint(action_el, new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
				
				ret = new ChopboxAnchor(action_el);
			} break;
		}
		
		if (last_connection != null && ret != null) {
			PolylineConnection conn = new PolylineConnection();
			conn.setSourceAnchor(last_connection);
			conn.setTargetAnchor(ret);
//			parent.add(conn);
		}
		
		return ret;
	}
	
	private Color getScopeColor(int idx) {
		return fScopeColorList.get((idx % fScopeColorList.size()));
	}

}
