/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.domain_spec;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.signed_scalar;

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
 * An implementation of the model object '<em><b>signed scalar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.signed_scalarImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.signed_scalarImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.signed_scalarImpl#getItems <em>Items</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.signed_scalarImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class signed_scalarImpl extends scalar_declarationImpl implements signed_scalar
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected expression lhs;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected expression rhs;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<domain_spec> items;

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
  protected signed_scalarImpl()
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
    return PSSPackage.Literals.SIGNED_SCALAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(expression newLhs, NotificationChain msgs)
  {
    expression oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.SIGNED_SCALAR__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(expression newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SIGNED_SCALAR__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SIGNED_SCALAR__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SIGNED_SCALAR__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(expression newRhs, NotificationChain msgs)
  {
    expression oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.SIGNED_SCALAR__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(expression newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SIGNED_SCALAR__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SIGNED_SCALAR__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SIGNED_SCALAR__RHS, newRhs, newRhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<domain_spec> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<domain_spec>(domain_spec.class, this, PSSPackage.SIGNED_SCALAR__ITEMS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SIGNED_SCALAR__NAME, oldName, name));
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
      case PSSPackage.SIGNED_SCALAR__LHS:
        return basicSetLhs(null, msgs);
      case PSSPackage.SIGNED_SCALAR__RHS:
        return basicSetRhs(null, msgs);
      case PSSPackage.SIGNED_SCALAR__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.SIGNED_SCALAR__LHS:
        return getLhs();
      case PSSPackage.SIGNED_SCALAR__RHS:
        return getRhs();
      case PSSPackage.SIGNED_SCALAR__ITEMS:
        return getItems();
      case PSSPackage.SIGNED_SCALAR__NAME:
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
      case PSSPackage.SIGNED_SCALAR__LHS:
        setLhs((expression)newValue);
        return;
      case PSSPackage.SIGNED_SCALAR__RHS:
        setRhs((expression)newValue);
        return;
      case PSSPackage.SIGNED_SCALAR__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends domain_spec>)newValue);
        return;
      case PSSPackage.SIGNED_SCALAR__NAME:
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
      case PSSPackage.SIGNED_SCALAR__LHS:
        setLhs((expression)null);
        return;
      case PSSPackage.SIGNED_SCALAR__RHS:
        setRhs((expression)null);
        return;
      case PSSPackage.SIGNED_SCALAR__ITEMS:
        getItems().clear();
        return;
      case PSSPackage.SIGNED_SCALAR__NAME:
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
      case PSSPackage.SIGNED_SCALAR__LHS:
        return lhs != null;
      case PSSPackage.SIGNED_SCALAR__RHS:
        return rhs != null;
      case PSSPackage.SIGNED_SCALAR__ITEMS:
        return items != null && !items.isEmpty();
      case PSSPackage.SIGNED_SCALAR__NAME:
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

} //signed_scalarImpl
