/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>graph data declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.graph_data_declaration#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.graph_data_declaration#getNames <em>Names</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.graph_data_declaration#getPortmaps <em>Portmaps</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_data_declaration()
 * @model
 * @generated
 */
public interface graph_data_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(data_type)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_data_declaration_Type()
   * @model
   * @generated
   */
  data_type getType();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.graph_data_declaration#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(data_type value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_data_declaration_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Portmaps</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.port_map}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Portmaps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Portmaps</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_data_declaration_Portmaps()
   * @model containment="true"
   * @generated
   */
  EList<port_map> getPortmaps();

} // graph_data_declaration
