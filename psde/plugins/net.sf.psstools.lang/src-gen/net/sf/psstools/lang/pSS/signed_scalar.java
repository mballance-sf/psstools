/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>signed scalar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.signed_scalar#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.signed_scalar#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.signed_scalar#getItems <em>Items</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.signed_scalar#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getsigned_scalar()
 * @model
 * @generated
 */
public interface signed_scalar extends scalar_declaration
{
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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsigned_scalar_Lhs()
   * @model containment="true"
   * @generated
   */
  expression getLhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.signed_scalar#getLhs <em>Lhs</em>}' containment reference.
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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsigned_scalar_Rhs()
   * @model containment="true"
   * @generated
   */
  expression getRhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.signed_scalar#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(expression value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.domain_spec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsigned_scalar_Items()
   * @model containment="true"
   * @generated
   */
  EList<domain_spec> getItems();

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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getsigned_scalar_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.signed_scalar#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // signed_scalar
