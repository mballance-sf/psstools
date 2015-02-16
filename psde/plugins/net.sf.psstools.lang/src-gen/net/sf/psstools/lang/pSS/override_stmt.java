/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>override stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.override_stmt#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getoverride_stmt()
 * @model
 * @generated
 */
public interface override_stmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' attribute.
   * @see #setDest(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getoverride_stmt_Dest()
   * @model
   * @generated
   */
  String getDest();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.override_stmt#getDest <em>Dest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' attribute.
   * @see #getDest()
   * @generated
   */
  void setDest(String value);

} // override_stmt
