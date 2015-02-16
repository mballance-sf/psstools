/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>binary xor expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.binary_xor_expr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getbinary_xor_expr()
 * @model
 * @generated
 */
public interface binary_xor_expr extends expression
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getbinary_xor_expr_Right()
   * @model containment="true"
   * @generated
   */
  expression getRight();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.binary_xor_expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(expression value);

} // binary_xor_expr
