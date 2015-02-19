/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.struct_datatype#getStruct_typename <em>Struct typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getstruct_datatype()
 * @model
 * @generated
 */
public interface struct_datatype extends EObject
{
  /**
   * Returns the value of the '<em><b>Struct typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct typename</em>' reference.
   * @see #setStruct_typename(struct_declaration)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getstruct_datatype_Struct_typename()
   * @model
   * @generated
   */
  struct_declaration getStruct_typename();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.struct_datatype#getStruct_typename <em>Struct typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct typename</em>' reference.
   * @see #getStruct_typename()
   * @generated
   */
  void setStruct_typename(struct_declaration value);

} // struct_datatype
