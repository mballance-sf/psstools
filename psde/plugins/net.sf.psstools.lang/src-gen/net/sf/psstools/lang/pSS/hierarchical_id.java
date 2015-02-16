/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>hierarchical id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.hierarchical_id#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.hierarchical_id#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#gethierarchical_id()
 * @model
 * @generated
 */
public interface hierarchical_id extends seq_item
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ifc_call_parameter_list)
   * @see net.sf.psstools.lang.pSS.PSSPackage#gethierarchical_id_Parameters()
   * @model containment="true"
   * @generated
   */
  ifc_call_parameter_list getParameters();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.hierarchical_id#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ifc_call_parameter_list value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#gethierarchical_id_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.hierarchical_id#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // hierarchical_id
