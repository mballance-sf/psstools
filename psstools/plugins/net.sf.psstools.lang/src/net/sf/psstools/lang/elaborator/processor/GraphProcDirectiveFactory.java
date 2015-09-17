package net.sf.psstools.lang.elaborator.processor;

import net.sf.psstools.lang.elaborator.ElabException;
import net.sf.psstools.lang.elaborator.rules.RuleBlockProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleRepeatProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemActionCallRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtProduction;

public class GraphProcDirectiveFactory {
	
	public GraphProcDirective build(RuleProduction production) throws ElabException {
		GraphProcDirective root = new GraphProcDirective();
		
		build(root, production);
		
		return root;
	}
	
	private GraphProcDirective build(GraphProcDirective parent, RuleProduction production) throws ElabException {
		GraphProcDirective current = parent;
		
		debug("production.type=" + production.getType());
		
		switch (production.getType()) {
			case Sequence: {
				RuleSeqProduction seq = (RuleSeqProduction)production;
				for (RuleSeqItemRef item : seq.getSeqItems()) {
					switch (item.getType()) {
						case ActionCall: {
							// Determine where this action is implemented and 
							RuleSeqItemActionCallRef call_r = (RuleSeqItemActionCallRef)item;
							GraphActionCallProcDirective call = new GraphActionCallProcDirective(
									call_r.getName() + "." + call_r.getActionName());
							call.addParameters(call_r.getParameters());
							GraphProcDirective our_parent = getNonRSParent(parent);
							our_parent.addChild(call);
							call.setParent(our_parent);
							current = our_parent;
							parent = our_parent;
						} break;
						
						case RuleVariable: {
							debug("Add variable " + item.getName() + " to randset");
							if (current.getType() != GraphProcDirectiveType.RandSet) {
								// Add a new child node to which we add this sequence
								GraphRandSetDirective rsd = new GraphRandSetDirective();
								current.addChild(rsd);
								rsd.setParent(parent);
								current = rsd;
							}
							GraphRandSetDirective rsd = (GraphRandSetDirective)current;
							rsd.addRef(item);
						} break;
						
						default: error("unhandled sequence-item type: " + item.getType());
					}
				}
			} break;
			
			case Repeat: {
				// Probably want to introduce another hierarchical node...
				GraphProcDirective our_parent = getNonRSParent(parent);
				RuleRepeatProduction repeat_p = (RuleRepeatProduction)production;
				
				GraphRepeatProcDirective repeat = new GraphRepeatProcDirective();
				repeat.setParent(our_parent);
				our_parent.addChild(repeat);
			
				build(repeat, repeat_p.getProduction());
			} break;

			case Block: {
				// Look across blocks when creating a strategy
				RuleBlockProduction block = (RuleBlockProduction)production;
				for (RuleProduction rp : block.getChildren()) {
					current = build(current, rp);
				}
			} break;
			
			case AltParallel: {
				GraphChoiceProcDirective choice = new GraphChoiceProcDirective();
				RuleStmtProduction stmt = (RuleStmtProduction)production;
				
				// Need to add ourselves to something other than a randset
				GraphProcDirective our_parent = getNonRSParent(parent);
				our_parent.addChild(choice);
				choice.setParent(our_parent);
			
				for (int i=0; i<stmt.getChildren().size(); i++) {
					RuleProduction rp = stmt.getChildren().get(i);
				
					GraphChoiceNodeProcDirective node = new GraphChoiceNodeProcDirective(i);
					choice.addChild(node);
					node.setParent(choice);
					build(node, rp);
				}
			
				// An choice causes us to reset our parent to the last non-randset
				current = our_parent;
			}
		}
		
		return current;		
	}
	
	private GraphProcDirective getNonRSParent(GraphProcDirective parent) {
		while (parent != null && parent.getType() == GraphProcDirectiveType.RandSet) {
			parent = parent.getParent();
		}
		return parent;
	}

	private void debug(String msg) {
//		System.out.println("[GraphProcDirectiveFactory] " + msg);
	}
	
	private void error(String msg) throws ElabException {
		throw new ElabException("[GraphProcDirectiveFactory] " + msg);
	}
}
