/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>overides declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.overides_declaration#getOverrides <em>Overrides</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getoverides_declaration()
 * @model
 * @generated
 */
public interface overides_declaration extends overrides_declaration
{
  /**
   * Returns the value of the '<em><b>Overrides</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.override_stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overrides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overrides</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getoverides_declaration_Overrides()
   * @model containment="true"
   * @generated
   */
  EList<override_stmt> getOverrides();

} // overides_declaration
