/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.port_declaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>port declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.port_declarationImpl#getIfc_type <em>Ifc type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.port_declarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class port_declarationImpl extends MinimalEObjectImpl.Container implements port_declaration
{
  /**
   * The cached value of the '{@link #getIfc_type() <em>Ifc type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfc_type()
   * @generated
   * @ordered
   */
  protected interface_declaration ifc_type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected port_declarationImpl()
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
    return PSSPackage.Literals.PORT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration getIfc_type()
  {
    if (ifc_type != null && ifc_type.eIsProxy())
    {
      InternalEObject oldIfc_type = (InternalEObject)ifc_type;
      ifc_type = (interface_declaration)eResolveProxy(oldIfc_type);
      if (ifc_type != oldIfc_type)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.PORT_DECLARATION__IFC_TYPE, oldIfc_type, ifc_type));
      }
    }
    return ifc_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration basicGetIfc_type()
  {
    return ifc_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfc_type(interface_declaration newIfc_type)
  {
    interface_declaration oldIfc_type = ifc_type;
    ifc_type = newIfc_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PORT_DECLARATION__IFC_TYPE, oldIfc_type, ifc_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PORT_DECLARATION__NAME, oldName, name));
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
      case PSSPackage.PORT_DECLARATION__IFC_TYPE:
        if (resolve) return getIfc_type();
        return basicGetIfc_type();
      case PSSPackage.PORT_DECLARATION__NAME:
        return getName();
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
      case PSSPackage.PORT_DECLARATION__IFC_TYPE:
        setIfc_type((interface_declaration)newValue);
        return;
      case PSSPackage.PORT_DECLARATION__NAME:
        setName((String)newValue);
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
      case PSSPackage.PORT_DECLARATION__IFC_TYPE:
        setIfc_type((interface_declaration)null);
        return;
      case PSSPackage.PORT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
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
      case PSSPackage.PORT_DECLARATION__IFC_TYPE:
        return ifc_type != null;
      case PSSPackage.PORT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //port_declarationImpl
