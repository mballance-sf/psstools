/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ifc call parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.ifc_call_parameter_list#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getifc_call_parameter_list()
 * @model
 * @generated
 */
public interface ifc_call_parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.hierarchical_id}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getifc_call_parameter_list_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<hierarchical_id> getParameters();

} // ifc_call_parameter_list
