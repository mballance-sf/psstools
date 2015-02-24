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
 *   <li>{@link net.sf.psstools.lang.pSS.typedef_declaration#getSrc <em>Src</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.typedef_declaration#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration()
 * @model
 * @generated
 */
public interface typedef_declaration extends data_declaration
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' attribute.
   * @see #setSrc(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration_Src()
   * @model
   * @generated
   */
  String getSrc();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.typedef_declaration#getSrc <em>Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' attribute.
   * @see #getSrc()
   * @generated
   */
  void setSrc(String value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' attribute.
   * @see #setDest(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#gettypedef_declaration_Dest()
   * @model
   * @generated
   */
  String getDest();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.typedef_declaration#getDest <em>Dest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' attribute.
   * @see #getDest()
   * @generated
   */
  void setDest(String value);

} // typedef_declaration
