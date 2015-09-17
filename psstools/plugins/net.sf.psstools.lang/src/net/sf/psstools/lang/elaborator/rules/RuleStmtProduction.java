package net.sf.psstools.lang.elaborator.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleStmtProduction extends RuleProduction {

	private List<RuleProduction>	fChildren;
	private RuleStmtType			fType;
	
	public RuleStmtProduction(RuleStmtType type) {
		super(RuleProductionType.AltParallel);
		fChildren = new ArrayList<RuleProduction>();
		fType = type;
	}

	public RuleStmtType getStmtType() {
		return fType;
	}
	
	public void addChild(RuleProduction production) {
		fChildren.add(production);
	}
	
	public List<RuleProduction> getChildren() {
		return fChildren;
	}
}
