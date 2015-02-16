/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.expression#getImpl_constraint <em>Impl constraint</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.expression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.expression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.expression#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends expression_or_dist_item
{
  /**
   * Returns the value of the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl constraint</em>' containment reference.
   * @see #setImpl_constraint(constraint_set)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression_Impl_constraint()
   * @model containment="true"
   * @generated
   */
  constraint_set getImpl_constraint();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.expression#getImpl_constraint <em>Impl constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl constraint</em>' containment reference.
   * @see #getImpl_constraint()
   * @generated
   */
  void setImpl_constraint(constraint_set value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(EObject)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression_Expr()
   * @model containment="true"
   * @generated
   */
  EObject getExpr();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.expression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(EObject value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression_Lhs()
   * @model containment="true"
   * @generated
   */
  expression getLhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.expression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(expression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression_Rhs()
   * @model containment="true"
   * @generated
   */
  expression getRhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.expression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(expression value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getexpression_Left()
   * @model containment="true"
   * @generated
   */
  expression getLeft();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(expression value);

} // expression
