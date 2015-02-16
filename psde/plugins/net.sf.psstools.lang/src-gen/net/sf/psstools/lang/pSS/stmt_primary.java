/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stmt primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.stmt_primary#getStmt_list <em>Stmt list</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getstmt_primary()
 * @model
 * @generated
 */
public interface stmt_primary extends alt_stmt
{
  /**
   * Returns the value of the '<em><b>Stmt list</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.psstools.lang.pSS.stmt_or_block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt list</em>' containment reference list.
   * @see net.sf.psstools.lang.pSS.PSSPackage#getstmt_primary_Stmt_list()
   * @model containment="true"
   * @generated
   */
  EList<stmt_or_block> getStmt_list();

} // stmt_primary
