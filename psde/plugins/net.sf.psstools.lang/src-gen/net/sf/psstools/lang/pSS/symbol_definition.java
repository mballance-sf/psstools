/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>symbol definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_definition#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.symbol_definition#getRule <em>Rule</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_definition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_definition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(rule_production)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsymbol_definition_Rule()
   * @model containment="true"
   * @generated
   */
  rule_production getRule();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.symbol_definition#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(rule_production value);

} // symbol_definition
