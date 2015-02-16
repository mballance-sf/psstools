/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct data declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.struct_data_declaration#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.struct_data_declaration#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getstruct_data_declaration()
 * @model
 * @generated
 */
public interface struct_data_declaration extends struct_body_item
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
   * @see #setType(struct_datatype)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getstruct_data_declaration_Type()
   * @model containment="true"
   * @generated
   */
  struct_datatype getType();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.struct_data_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(struct_datatype value);

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
   * @see net.sf.psstools.lang.pSS.PSSPackage#getstruct_data_declaration_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // struct_data_declaration
