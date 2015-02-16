/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.graph_datatype;
import net.sf.psstools.lang.pSS.graph_struct_ifc_declaration;
import net.sf.psstools.lang.pSS.primitive_datatype;
import net.sf.psstools.lang.pSS.struct_datatype;
import net.sf.psstools.lang.pSS.struct_declaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primitive datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl#getGraph_typename <em>Graph typename</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl#getStruct_typename <em>Struct typename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primitive_datatypeImpl extends action_portlistImpl implements primitive_datatype
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
   * The cached value of the '{@link #getStruct_typename() <em>Struct typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_typename()
   * @generated
   * @ordered
   */
  protected struct_declaration struct_typename;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primitive_datatypeImpl()
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
    return PSSPackage.Literals.PRIMITIVE_DATATYPE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME, oldGraph_typename, graph_typename));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME, oldGraph_typename, graph_typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration getStruct_typename()
  {
    if (struct_typename != null && struct_typename.eIsProxy())
    {
      InternalEObject oldStruct_typename = (InternalEObject)struct_typename;
      struct_typename = (struct_declaration)eResolveProxy(oldStruct_typename);
      if (struct_typename != oldStruct_typename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME, oldStruct_typename, struct_typename));
      }
    }
    return struct_typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration basicGetStruct_typename()
  {
    return struct_typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_typename(struct_declaration newStruct_typename)
  {
    struct_declaration oldStruct_typename = struct_typename;
    struct_typename = newStruct_typename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME, oldStruct_typename, struct_typename));
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
      case PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME:
        if (resolve) return getGraph_typename();
        return basicGetGraph_typename();
      case PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME:
        if (resolve) return getStruct_typename();
        return basicGetStruct_typename();
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
      case PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME:
        setGraph_typename((graph_struct_ifc_declaration)newValue);
        return;
      case PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME:
        setStruct_typename((struct_declaration)newValue);
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
      case PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME:
        setGraph_typename((graph_struct_ifc_declaration)null);
        return;
      case PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME:
        setStruct_typename((struct_declaration)null);
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
      case PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME:
        return graph_typename != null;
      case PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME:
        return struct_typename != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == graph_datatype.class)
    {
      switch (derivedFeatureID)
      {
        case PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME: return PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME;
        default: return -1;
      }
    }
    if (baseClass == struct_datatype.class)
    {
      switch (derivedFeatureID)
      {
        case PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME: return PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == graph_datatype.class)
    {
      switch (baseFeatureID)
      {
        case PSSPackage.GRAPH_DATATYPE__GRAPH_TYPENAME: return PSSPackage.PRIMITIVE_DATATYPE__GRAPH_TYPENAME;
        default: return -1;
      }
    }
    if (baseClass == struct_datatype.class)
    {
      switch (baseFeatureID)
      {
        case PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME: return PSSPackage.PRIMITIVE_DATATYPE__STRUCT_TYPENAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //primitive_datatypeImpl
