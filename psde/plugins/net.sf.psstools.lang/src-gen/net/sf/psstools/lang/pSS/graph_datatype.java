/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>graph datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.graph_datatype#getGraph_typename <em>Graph typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_datatype()
 * @model
 * @generated
 */
public interface graph_datatype extends EObject
{
  /**
   * Returns the value of the '<em><b>Graph typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph typename</em>' reference.
   * @see #setGraph_typename(graph_struct_ifc_declaration)
   * @see net.sf.psstools.lang.pSS.PSSPackage#getgraph_datatype_Graph_typename()
   * @model
   * @generated
   */
  graph_struct_ifc_declaration getGraph_typename();

  /**
   * Sets the value of the '{@link net.sf.psstools.lang.pSS.graph_datatype#getGraph_typename <em>Graph typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph typename</em>' reference.
   * @see #getGraph_typename()
   * @generated
   */
  void setGraph_typename(graph_struct_ifc_declaration value);

} // graph_datatype
