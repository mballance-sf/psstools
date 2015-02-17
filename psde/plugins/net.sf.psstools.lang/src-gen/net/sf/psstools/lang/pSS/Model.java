/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.Model#getTopLevel <em>Top Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Top Level</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.portable_stimulus_description}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Level</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Level</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getModel_TopLevel()
   * @model containment="true"
   * @generated
   */
  EList<portable_stimulus_description> getTopLevel();

} // Model