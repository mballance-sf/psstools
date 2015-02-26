package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

public class RuleStmtProduction extends RuleProduction {

	private List<RuleProduction>	fChildren;
	private RuleStmtType			fType;
	
	public RuleStmtProduction(
			RuleProduction 		lhs, 
			RuleStmtType		type,
			RuleProduction 		rhs) {
		super(RuleProductionType.AltParallel);
		fChildren = new ArrayList<RuleProduction>();
		fChildren.add(lhs);
		fChildren.add(rhs);
		fType = type;
	}

	public RuleStmtType getStmtType() {
		return fType;
	}
	
	public List<RuleProduction> getChildren() {
		return fChildren;
	}
}
