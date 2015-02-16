/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>action declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.action_declaration#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.action_declaration#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getaction_declaration()
 * @model
 * @generated
 */
public interface action_declaration extends interface_body_item
{
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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getaction_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.action_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.action_portlist}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getaction_declaration_Ports()
   * @model containment="true"
   * @generated
   */
  EList<action_portlist> getPorts();

} // action_declaration
