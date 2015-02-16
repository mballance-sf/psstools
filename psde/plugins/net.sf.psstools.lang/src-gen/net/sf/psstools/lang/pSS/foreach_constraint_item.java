/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>foreach constraint item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getExpr <em>Expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getforeach_constraint_item()
 * @model
 * @generated
 */
public interface foreach_constraint_item extends constraint_body_no_if_item
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getforeach_constraint_item_Expr()
   * @model containment="true"
   * @generated
   */
  expression getExpr();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(constraint_set)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getforeach_constraint_item_Body()
   * @model containment="true"
   * @generated
   */
  constraint_set getBody();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(constraint_set value);

} // foreach_constraint_item
