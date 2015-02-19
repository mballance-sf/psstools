/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.graph_datatype;
import net.sf.psstools.lang.pSS.graph_struct_ifc_declaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>graph datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.graph_datatypeImpl#getGraph_typename <em>Graph typename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class graph_datatypeImpl extends MinimalEObjectImpl.Container implements graph_datatype
{
  /**
   * The cached value of the '{@link #getGraph_typename() <em>Graph typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraph_typename()
   * @generated
   * @ordered
   */
  protected graph_struct_ifc_declaration graph_typename;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected graph_datatypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PSSPackage.Literals.GRAPH_DATATYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_struct_ifc_declaration getGraph_typename()
  {
    if (graph_typename != null && graph_typename.eIsProxy())
    {
      InternalEObject oldGraph_typename = (InternalEObject)graph_typename;
      graph_typename = (graph_struct_ifc_declaration)eResolveProxy(oldGraph_typename);
      if (graph_typename != oldGraph_typename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME, oldGraph_typename, graph_typename));
      }
    }
    return graph_typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_struct_ifc_declaration basicGetGraph_typename()
  {
    return graph_typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraph_typename(graph_struct_ifc_declaration newGraph_typename)
  {
    graph_struct_ifc_declaration oldGraph_typename = graph_typename;
    graph_typename = newGraph_typename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME, oldGraph_typename, graph_typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME:
        if (resolve) return getGraph_typename();
        return basicGetGraph_typename();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME:
        setGraph_typename((graph_struct_ifc_declaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME:
        setGraph_typename((graph_struct_ifc_declaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME:
        return graph_typename != null;
    }
    return super.eIsSet(featureID);
  }

} //graph_datatypeImpl
