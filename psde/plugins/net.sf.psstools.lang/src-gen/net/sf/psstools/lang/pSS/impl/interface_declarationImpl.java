/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.interface_body_item;
import net.sf.psstools.lang.pSS.interface_declaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.interface_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.interface_declarationImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.interface_declarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interface_declarationImpl extends portable_stimulus_descriptionImpl implements interface_declaration
{
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
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected interface_declaration super_;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<interface_body_item> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected interface_declarationImpl()
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
    return PSSPackage.Literals.INTERFACE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTERFACE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration getSuper()
  {
    if (super_ != null && super_.eIsProxy())
    {
      InternalEObject oldSuper = (InternalEObject)super_;
      super_ = (interface_declaration)eResolveProxy(oldSuper);
      if (super_ != oldSuper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSSPackage.INTERFACE_DECLARATION__SUPER, oldSuper, super_));
      }
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration basicGetSuper()
  {
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(interface_declaration newSuper)
  {
    interface_declaration oldSuper = super_;
    super_ = newSuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTERFACE_DECLARATION__SUPER, oldSuper, super_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<interface_body_item> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<interface_body_item>(interface_body_item.class, this, PSSPackage.INTERFACE_DECLARATION__BODY);
    }
    return body;
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
      case PSSPackage.INTERFACE_DECLARATION__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.INTERFACE_DECLARATION__NAME:
        return getName();
      case PSSPackage.INTERFACE_DECLARATION__SUPER:
        if (resolve) return getSuper();
        return basicGetSuper();
      case PSSPackage.INTERFACE_DECLARATION__BODY:
        return getBody();
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
      case PSSPackage.INTERFACE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case PSSPackage.INTERFACE_DECLARATION__SUPER:
        setSuper((interface_declaration)newValue);
        return;
      case PSSPackage.INTERFACE_DECLARATION__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends interface_body_item>)newValue);
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
      case PSSPackage.INTERFACE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PSSPackage.INTERFACE_DECLARATION__SUPER:
        setSuper((interface_declaration)null);
        return;
      case PSSPackage.INTERFACE_DECLARATION__BODY:
        getBody().clear();
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
      case PSSPackage.INTERFACE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PSSPackage.INTERFACE_DECLARATION__SUPER:
        return super_ != null;
      case PSSPackage.INTERFACE_DECLARATION__BODY:
        return body != null && !body.isEmpty();
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

} //interface_declarationImpl
