/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>domain spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.domain_spec#getRange_lhs <em>Range lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.domain_spec#getRange_rhs <em>Range rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getdomain_spec()
 * @model
 * @generated
 */
public interface domain_spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Range lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range lhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range lhs</em>' attribute.
   * @see #setRange_lhs(int)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getdomain_spec_Range_lhs()
   * @model
   * @generated
   */
  int getRange_lhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.domain_spec#getRange_lhs <em>Range lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range lhs</em>' attribute.
   * @see #getRange_lhs()
   * @generated
   */
  void setRange_lhs(int value);

  /**
   * Returns the value of the '<em><b>Range rhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range rhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range rhs</em>' attribute.
   * @see #setRange_rhs(int)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getdomain_spec_Range_rhs()
   * @model
   * @generated
   */
  int getRange_rhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.domain_spec#getRange_rhs <em>Range rhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range rhs</em>' attribute.
   * @see #getRange_rhs()
   * @generated
   */
  void setRange_rhs(int value);

} // domain_spec
