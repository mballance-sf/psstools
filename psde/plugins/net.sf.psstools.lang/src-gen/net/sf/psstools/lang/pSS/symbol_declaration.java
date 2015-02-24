/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>symbol declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_declaration#getDecl_list <em>Decl list</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule <em>Inline rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration()
 * @model
 * @generated
 */
public interface symbol_declaration extends graph_body_item
{
  /**
   * Returns the value of the '<em><b>Decl list</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.symbol_decl_item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl list</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration_Decl_list()
   * @model containment="true"
   * @generated
   */
  EList<symbol_decl_item> getDecl_list();

  /**
   * Returns the value of the '<em><b>Inline rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline rule</em>' containment reference.
   * @see #setInline_rule(rule_stmt_or_block)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration_Inline_rule()
   * @model containment="true"
   * @generated
   */
  rule_stmt_or_block getInline_rule();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule <em>Inline rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline rule</em>' containment reference.
   * @see #getInline_rule()
   * @generated
   */
  void setInline_rule(rule_stmt_or_block value);

} // symbol_declaration
