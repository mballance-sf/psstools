package net.sf.psstools.lang.validation;

import org.eclipse.xtext.validation.Check;

import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.action_field_declaration;
import net.sf.psstools.lang.pSS.user_defined_type;

public class BasePSSValidator extends PSSValidator {

	@Check
	public void checkActionExists(action_field_declaration decl) {
		if (decl.getDeclaration().getType() instanceof user_defined_type) {
			user_defined_type udt = (user_defined_type)decl.getDeclaration().getType();
//			System.out.println("TYPE: " + udt.getTypename());
//			error("Undefined type", decl,
//					PSSPackage.eINSTANCE.getaction_field_declaration_Declaration());
		}
		
	}

}
