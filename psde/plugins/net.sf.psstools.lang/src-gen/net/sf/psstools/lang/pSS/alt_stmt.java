/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>alt stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.alt_stmt#getLeft <em>Left</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.alt_stmt#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getalt_stmt()
 * @model
 * @generated
 */
public interface alt_stmt extends stmt_or_block
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(alt_stmt)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getalt_stmt_Left()
   * @model containment="true"
   * @generated
   */
  alt_stmt getLeft();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.alt_stmt#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(alt_stmt value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(stmt_primary)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getalt_stmt_Right()
   * @model containment="true"
   * @generated
   */
  stmt_primary getRight();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.alt_stmt#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(stmt_primary value);

} // alt_stmt
