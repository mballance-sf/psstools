/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>port map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.port_map#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.port_map#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getport_map()
 * @model
 * @generated
 */
public interface port_map extends EObject
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getport_map_Port()
   * @model
   * @generated
   */
  String getPort();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.port_map#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(String value);

  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(hierarchical_id)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getport_map_Map()
   * @model containment="true"
   * @generated
   */
  hierarchical_id getMap();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.port_map#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(hierarchical_id value);

} // port_map
