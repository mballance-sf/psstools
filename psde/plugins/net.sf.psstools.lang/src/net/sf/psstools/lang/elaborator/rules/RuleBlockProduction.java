package net.sf.psstools.lang.elaborator.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleBlockProduction extends RuleProduction {
	
	private List<RuleProduction>				fChildren;
	
	public RuleBlockProduction() {
		super(RuleProductionType.Block);
		fChildren = new ArrayList<RuleProduction>();
	}
	
	public List<RuleProduction> getChildren() {
		return fChildren;
	}
	
	public void addChild(RuleProduction p) {
		p.setParent(this);
		fChildren.add(p);
	}

}
