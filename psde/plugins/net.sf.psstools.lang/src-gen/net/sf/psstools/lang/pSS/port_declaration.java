/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>port declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.port_declaration#getIfc_type <em>Ifc type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.port_declaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getport_declaration()
 * @model
 * @generated
 */
public interface port_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifc type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifc type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifc type</em>' reference.
   * @see #setIfc_type(interface_declaration)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getport_declaration_Ifc_type()
   * @model
   * @generated
   */
  interface_declaration getIfc_type();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.port_declaration#getIfc_type <em>Ifc type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifc type</em>' reference.
   * @see #getIfc_type()
   * @generated
   */
  void setIfc_type(interface_declaration value);

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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getport_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.port_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // port_declaration
