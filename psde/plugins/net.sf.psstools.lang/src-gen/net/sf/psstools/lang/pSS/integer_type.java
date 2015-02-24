/**
 */
package net.sf.psstools.lang.pSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>integer type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.integer_type#getAtom_type <em>Atom type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.integer_type#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.integer_type#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.integer_type#getInside <em>Inside</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getinteger_type()
 * @model
 * @generated
 */
public interface integer_type extends data_type
{
  /**
   * Returns the value of the '<em><b>Atom type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom type</em>' attribute.
   * @see #setAtom_type(String)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getinteger_type_Atom_type()
   * @model
   * @generated
   */
  String getAtom_type();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.integer_type#getAtom_type <em>Atom type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom type</em>' attribute.
   * @see #getAtom_type()
   * @generated
   */
  void setAtom_type(String value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getinteger_type_Lhs()
   * @model containment="true"
   * @generated
   */
  expression getLhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.integer_type#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(expression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(expression)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getinteger_type_Rhs()
   * @model containment="true"
   * @generated
   */
  expression getRhs();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.integer_type#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(expression value);

  /**
   * Returns the value of the '<em><b>Inside</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inside</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inside</em>' containment reference.
   * @see #setInside(type_inside_clause)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getinteger_type_Inside()
   * @model containment="true"
   * @generated
   */
  type_inside_clause getInside();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.integer_type#getInside <em>Inside</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inside</em>' containment reference.
   * @see #getInside()
   * @generated
   */
  void setInside(type_inside_clause value);

} // integer_type
