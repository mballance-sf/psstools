/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>symbol definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_definition#getSymbol_name <em>Symbol name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_definition#getBody_items <em>Body items</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_definition()
 * @model
 * @generated
 */
public interface symbol_definition extends graph_body_item
{
  /**
   * Returns the value of the '<em><b>Symbol name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol name</em>' attribute.
   * @see #setSymbol_name(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_definition_Symbol_name()
   * @model
   * @generated
   */
  String getSymbol_name();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_definition#getSymbol_name <em>Symbol name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol name</em>' attribute.
   * @see #getSymbol_name()
   * @generated
   */
  void setSymbol_name(String value);

  /**
   * Returns the value of the '<em><b>Body items</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.rule_production}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body items</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_definition_Body_items()
   * @model containment="true"
   * @generated
   */
  EList<rule_production> getBody_items();

} // symbol_definition
