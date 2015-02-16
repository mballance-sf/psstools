/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if constraint item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.if_constraint_item#getIf_expr <em>If expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.if_constraint_item#getTrue_case <em>True case</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.if_constraint_item#getFalse_set <em>False set</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getif_constraint_item()
 * @model
 * @generated
 */
public interface if_constraint_item extends constraint_body_item
{
  /**
   * Returns the value of the '<em><b>If expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If expr</em>' containment reference.
   * @see #setIf_expr(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getif_constraint_item_If_expr()
   * @model containment="true"
   * @generated
   */
  expression getIf_expr();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.if_constraint_item#getIf_expr <em>If expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If expr</em>' containment reference.
   * @see #getIf_expr()
   * @generated
   */
  void setIf_expr(expression value);

  /**
   * Returns the value of the '<em><b>True case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True case</em>' containment reference.
   * @see #setTrue_case(constraint_set)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getif_constraint_item_True_case()
   * @model containment="true"
   * @generated
   */
  constraint_set getTrue_case();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.if_constraint_item#getTrue_case <em>True case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True case</em>' containment reference.
   * @see #getTrue_case()
   * @generated
   */
  void setTrue_case(constraint_set value);

  /**
   * Returns the value of the '<em><b>False set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False set</em>' containment reference.
   * @see #setFalse_set(constraint_set)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getif_constraint_item_False_set()
   * @model containment="true"
   * @generated
   */
  constraint_set getFalse_set();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.if_constraint_item#getFalse_set <em>False set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False set</em>' containment reference.
   * @see #getFalse_set()
   * @generated
   */
  void setFalse_set(constraint_set value);

} // if_constraint_item
