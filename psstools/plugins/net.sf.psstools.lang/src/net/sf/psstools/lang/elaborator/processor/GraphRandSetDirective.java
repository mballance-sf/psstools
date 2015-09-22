package net.sf.psstools.lang.elaborator.processor;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;

public class GraphRandSetDirective extends GraphProcDirective {
	private List<RuleSeqItemRef>			fVarRefs;
	
	public GraphRandSetDirective() {
		super(GraphProcDirectiveType.RandSet);
		fVarRefs = new ArrayList<RuleSeqItemRef>();
	}
	
	public void addRef(RuleSeqItemRef ref) {
		fVarRefs.add(ref);
	}
	
	public List<RuleSeqItemRef> getRefs() {
		return fVarRefs;
	}

}
