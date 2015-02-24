/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repeat stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.repeat_stmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getrepeat_stmt()
 * @model
 * @generated
 */
public interface repeat_stmt extends stmt_or_block
{
  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(stmt_or_block)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getrepeat_stmt_Stmt()
   * @model containment="true"
   * @generated
   */
  stmt_or_block getStmt();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.repeat_stmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(stmt_or_block value);

} // repeat_stmt
