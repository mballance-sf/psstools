/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.enum_declaration#getData_type <em>Data type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.enum_declaration#getItems <em>Items</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.enum_declaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getenum_declaration()
 * @model
 * @generated
 */
public interface enum_declaration extends data_declaration
{
  /**
   * Returns the value of the '<em><b>Data type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data type</em>' containment reference.
   * @see #setData_type(integer_type)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getenum_declaration_Data_type()
   * @model containment="true"
   * @generated
   */
  integer_type getData_type();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.enum_declaration#getData_type <em>Data type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data type</em>' containment reference.
   * @see #getData_type()
   * @generated
   */
  void setData_type(integer_type value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' attribute list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getenum_declaration_Items()
   * @model unique="false"
   * @generated
   */
  EList<String> getItems();

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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getenum_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.enum_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // enum_declaration
