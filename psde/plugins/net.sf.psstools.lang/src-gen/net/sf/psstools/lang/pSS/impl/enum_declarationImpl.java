/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.enum_declaration;
import net.sf.psstools.lang.pSS.integer_type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.enum_declarationImpl#getData_type <em>Data type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.enum_declarationImpl#getItems <em>Items</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.enum_declarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enum_declarationImpl extends data_declarationImpl implements enum_declaration
{
  /**
   * The cached value of the '{@link #getData_type() <em>Data type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData_type()
   * @generated
   * @ordered
   */
  protected integer_type data_type;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<String> items;

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
  protected enum_declarationImpl()
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
    return PSSPackage.Literals.ENUM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public integer_type getData_type()
  {
    return data_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData_type(integer_type newData_type, NotificationChain msgs)
  {
    integer_type oldData_type = data_type;
    data_type = newData_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.ENUM_DECLARATION__DATA_TYPE, oldData_type, newData_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData_type(integer_type newData_type)
  {
    if (newData_type != data_type)
    {
      NotificationChain msgs = null;
      if (data_type != null)
        msgs = ((InternalEObject)data_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.ENUM_DECLARATION__DATA_TYPE, null, msgs);
      if (newData_type != null)
        msgs = ((InternalEObject)newData_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.ENUM_DECLARATION__DATA_TYPE, null, msgs);
      msgs = basicSetData_type(newData_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.ENUM_DECLARATION__DATA_TYPE, newData_type, newData_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getItems()
  {
    if (items == null)
    {
      items = new EDataTypeEList<String>(String.class, this, PSSPackage.ENUM_DECLARATION__ITEMS);
    }
    return items;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.ENUM_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PSSPackage.ENUM_DECLARATION__DATA_TYPE:
        return basicSetData_type(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PSSPackage.ENUM_DECLARATION__DATA_TYPE:
        return getData_type();
      case PSSPackage.ENUM_DECLARATION__ITEMS:
        return getItems();
      case PSSPackage.ENUM_DECLARATION__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PSSPackage.ENUM_DECLARATION__DATA_TYPE:
        setData_type((integer_type)newValue);
        return;
      case PSSPackage.ENUM_DECLARATION__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends String>)newValue);
        return;
      case PSSPackage.ENUM_DECLARATION__NAME:
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
      case PSSPackage.ENUM_DECLARATION__DATA_TYPE:
        setData_type((integer_type)null);
        return;
      case PSSPackage.ENUM_DECLARATION__ITEMS:
        getItems().clear();
        return;
      case PSSPackage.ENUM_DECLARATION__NAME:
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
      case PSSPackage.ENUM_DECLARATION__DATA_TYPE:
        return data_type != null;
      case PSSPackage.ENUM_DECLARATION__ITEMS:
        return items != null && !items.isEmpty();
      case PSSPackage.ENUM_DECLARATION__NAME:
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
    result.append(" (items: ");
    result.append(items);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //enum_declarationImpl
