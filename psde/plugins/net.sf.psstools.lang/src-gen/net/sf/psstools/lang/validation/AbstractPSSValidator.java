/*
 * generated by Xtext
 */
package net.sf.psstools.lang.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPSSValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(net.sf.psstools.lang.pSS.PSSPackage.eINSTANCE);
		return result;
	}
}
