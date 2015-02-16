/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>condition expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.condition_expr#getTrue_expr <em>True expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.condition_expr#getFalse_expr <em>False expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getcondition_expr()
 * @model
 * @generated
 */
public interface condition_expr extends expression
{
  /**
   * Returns the value of the '<em><b>True expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True expr</em>' containment reference.
   * @see #setTrue_expr(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getcondition_expr_True_expr()
   * @model containment="true"
   * @generated
   */
  expression getTrue_expr();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.condition_expr#getTrue_expr <em>True expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True expr</em>' containment reference.
   * @see #getTrue_expr()
   * @generated
   */
  void setTrue_expr(expression value);

  /**
   * Returns the value of the '<em><b>False expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False expr</em>' containment reference.
   * @see #setFalse_expr(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getcondition_expr_False_expr()
   * @model containment="true"
   * @generated
   */
  expression getFalse_expr();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.condition_expr#getFalse_expr <em>False expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False expr</em>' containment reference.
   * @see #getFalse_expr()
   * @generated
   */
  void setFalse_expr(expression value);

} // condition_expr
