/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>data declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.data_declaration#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.data_declaration#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getdata_declaration()
 * @model
 * @generated
 */
public interface data_declaration extends portable_stimulus_description, struct_body_item, graph_body_item
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(data_type)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getdata_declaration_Type()
   * @model containment="true"
   * @generated
   */
  data_type getType();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.data_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(data_type value);

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.data_instantiation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getdata_declaration_Instances()
   * @model containment="true"
   * @generated
   */
  EList<data_instantiation> getInstances();

} // data_declaration
