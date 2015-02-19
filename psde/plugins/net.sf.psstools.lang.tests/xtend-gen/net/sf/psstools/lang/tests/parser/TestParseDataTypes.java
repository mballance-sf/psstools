package net.sf.psstools.lang.tests.parser;

import com.google.inject.Inject;
import net.sf.psstools.lang.PSSInjectorProvider;
import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.portable_stimulus_description;
import net.sf.psstools.lang.pSS.struct_declaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(PSSInjectorProvider.class)
@SuppressWarnings("all")
public class TestParseDataTypes {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParseEnumVar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("struct my_struct {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("enum { a, b, c } m_enum_var;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String testcase = _builder.toString();
      final Model model = this._parseHelper.parse(testcase);
      this._validationTestHelper.assertNoErrors(model);
      EList<portable_stimulus_description> _topLevel = model.getTopLevel();
      portable_stimulus_description _get = _topLevel.get(0);
      final struct_declaration s = ((struct_declaration) _get);
      String _name = s.getName();
      Assert.assertEquals("my_struct", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseEnumTypedef() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("struct my_struct {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("typedef enum { a, b, c } my_enum_type;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String testcase = _builder.toString();
      final Model model = this._parseHelper.parse(testcase);
      this._validationTestHelper.assertNoErrors(model);
      EList<portable_stimulus_description> _topLevel = model.getTopLevel();
      portable_stimulus_description _get = _topLevel.get(0);
      final struct_declaration s = ((struct_declaration) _get);
      String _name = s.getName();
      Assert.assertEquals("my_struct", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseEnumTypedefVarDecl() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("struct my_struct {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("typedef enum { a, b, c } my_enum_type;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("my_enum_type var1, var2;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String testcase = _builder.toString();
      final Model model = this._parseHelper.parse(testcase);
      this._validationTestHelper.assertNoErrors(model);
      EList<portable_stimulus_description> _topLevel = model.getTopLevel();
      portable_stimulus_description _get = _topLevel.get(0);
      final struct_declaration s = ((struct_declaration) _get);
      String _name = s.getName();
      Assert.assertEquals("my_struct", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParseIntegerType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("struct my_struct {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("signed int foo;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("unsigned int bar;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String testcase = _builder.toString();
      final Model model = this._parseHelper.parse(testcase);
      this._validationTestHelper.assertNoErrors(model);
      EList<portable_stimulus_description> _topLevel = model.getTopLevel();
      portable_stimulus_description _get = _topLevel.get(0);
      final struct_declaration s = ((struct_declaration) _get);
      String _name = s.getName();
      Assert.assertEquals("my_struct", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
