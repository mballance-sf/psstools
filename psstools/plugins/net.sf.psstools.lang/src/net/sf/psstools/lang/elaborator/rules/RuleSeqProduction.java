package net.sf.psstools.lang.elaborator.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleSeqProduction extends RuleProduction {
	private List<RuleSeqItemRef>				fSeqItems;
	
	public RuleSeqProduction() {
		super(RuleProductionType.Sequence);
		fSeqItems = new ArrayList<RuleSeqItemRef>();
	}

	public void addSeqItemRef(RuleSeqItemRef ref) {
		fSeqItems.add(ref);
	}
	
	public List<RuleSeqItemRef> getSeqItems() {
		return fSeqItems;
	}
}
