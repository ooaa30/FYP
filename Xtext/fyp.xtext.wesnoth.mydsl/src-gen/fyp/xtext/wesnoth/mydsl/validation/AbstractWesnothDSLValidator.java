/*
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractWesnothDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage.eINSTANCE);
		return result;
	}
}