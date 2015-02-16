/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.struct_datatype;
import net.sf.psstools.lang.pSS.struct_declaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.struct_datatypeImpl#getStruct_typename <em>Struct typename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class struct_datatypeImpl extends MinimalEObjectImpl.Container implements struct_datatype
{
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
  protected struct_datatypeImpl()
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
    return PSSPackage.Literals.STRUCT_DATATYPE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME, oldStruct_typename, struct_typename));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME, oldStruct_typename, struct_typename));
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
      case PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME:
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
      case PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME:
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
      case PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME:
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
      case PSSPackage.STRUCT_DATATYPE__STRUCT_TYPENAME:
        return struct_typename != null;
    }
    return super.eIsSet(featureID);
  }

} //struct_datatypeImpl
