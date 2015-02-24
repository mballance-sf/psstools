/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>action portlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.action_portlist#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getaction_portlist()
 * @model
 * @generated
 */
public interface action_portlist extends EObject
{
  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.action_port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getaction_portlist_Ports()
   * @model containment="true"
   * @generated
   */
  EList<action_port> getPorts();

} // action_portlist
