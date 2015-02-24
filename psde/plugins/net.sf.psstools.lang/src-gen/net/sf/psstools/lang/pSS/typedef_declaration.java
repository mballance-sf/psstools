/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>typedef declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.typedef_declaration#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.typedef_declaration#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration()
 * @model
 * @generated
 */
public interface typedef_declaration extends portable_stimulus_description, struct_body_item, graph_body_item
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
   * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration_Type()
   * @model containment="true"
   * @generated
   */
  data_type getType();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.typedef_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(data_type value);

  /**
   * Returns the value of the '<em><b>Type identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type identifier</em>' attribute.
   * @see #setType_identifier(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration_Type_identifier()
   * @model
   * @generated
   */
  String getType_identifier();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.typedef_declaration#getType_identifier <em>Type identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type identifier</em>' attribute.
   * @see #getType_identifier()
   * @generated
   */
  void setType_identifier(String value);

} // typedef_declaration
