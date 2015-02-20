package net.sf.psstools.lang.tests.parser

import com.google.inject.Inject
import net.sf.psstools.lang.PSSInjectorProvider
import net.sf.psstools.lang.pSS.Model
import net.sf.psstools.lang.pSS.struct_declaration
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PSSInjectorProvider))
class TestParseDataTypes {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testParseEnumVar () {
		val testcase = '''
		struct my_struct {
			enum { a, b, c } m_enum_var;
		}
		'''
		
		val model = testcase.parse
		model.assertNoErrors
	}
	
	@Test
	def void testParseEnumTypedef () {
		val testcase = '''
		struct my_struct {
			typedef enum { a, b, c } my_enum_type;
		}
		'''

		val model = testcase.parse
		model.assertNoErrors
	}	

	@Test
	def void testParseEnumTypedefVarDecl () {
		val testcase = '''
		struct my_struct {
			typedef enum { a, b, c } my_enum_type;
			my_enum_type var1, var2;
		}
		'''

		val model = testcase.parse
		model.assertNoErrors
	}		

	@Test
	def void testParseIntegerType () {
		val testcase = '''
		struct my_struct {
			signed int foo;
			unsigned int bar;
		}
		'''

		val model = testcase.parse
		model.assertNoErrors
	}			
	
}


