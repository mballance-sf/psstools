package net.sf.psstools.lang.tests.parser

import net.sf.psstools.lang.PSSInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import com.google.inject.Inject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PSSInjectorProvider))
class TestParseDataTypes {

	@Inject PSSLanguageTestUtils fTestUtils;
	
	@Test
	def void testParseEnumVar () {
		val testcase = '''
		struct my_struct {
			enum { a, b, c } m_enum_var;
		}
		'''
		fTestUtils.parseTest(testcase);
	}
	
	@Test
	def void testParseEnumTypedef () {
		val testcase = '''
		struct my_struct {
			typedef enum { a, b, c } my_enum_type;
		}
		'''

		fTestUtils.parseTest(testcase);
	}	

	@Test
	def void testParseEnumTypedefVarDecl () {
		val testcase = '''
		struct my_struct {
			typedef enum { a, b, c } my_enum_type;
			my_enum_type var1, var2;
		}
		'''

		fTestUtils.parseTest(testcase);
	}		

	@Test
	def void testParseIntegerType () {
		val testcase = '''
		struct my_struct {
			signed int foo;
			unsigned int bar;
		}
		'''

		fTestUtils.parseTest(testcase);
	}			
	
}


