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
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_declaration#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule <em>Inline rule</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_declaration#getNames <em>Names</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inline rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline rule</em>' containment reference.
   * @see #setInline_rule(stmt_or_block)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration_Inline_rule()
   * @model containment="true"
   * @generated
   */
  stmt_or_block getInline_rule();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule <em>Inline rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline rule</em>' containment reference.
   * @see #getInline_rule()
   * @generated
   */
  void setInline_rule(stmt_or_block value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_declaration_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // symbol_declaration
