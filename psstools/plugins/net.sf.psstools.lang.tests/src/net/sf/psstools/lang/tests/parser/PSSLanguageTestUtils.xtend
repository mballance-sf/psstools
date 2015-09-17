package net.sf.psstools.lang.tests.parser

import com.google.inject.Inject
import net.sf.psstools.lang.PSSInjectorProvider
import net.sf.psstools.lang.pSS.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@InjectWith(typeof(PSSInjectorProvider))
class PSSLanguageTestUtils {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	
	def void parseTest(String test) {
		val model = test.parse
		model.assertNoErrors
	}
	
}