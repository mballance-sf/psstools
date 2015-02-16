/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.if_constraint_item;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if constraint item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl#getIf_expr <em>If expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl#getTrue_case <em>True case</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl#getFalse_set <em>False set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class if_constraint_itemImpl extends constraint_body_itemImpl implements if_constraint_item
{
  /**
   * The cached value of the '{@link #getIf_expr() <em>If expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_expr()
   * @generated
   * @ordered
   */
  protected expression if_expr;

  /**
   * The cached value of the '{@link #getTrue_case() <em>True case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue_case()
   * @generated
   * @ordered
   */
  protected constraint_set true_case;

  /**
   * The cached value of the '{@link #getFalse_set() <em>False set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse_set()
   * @generated
   * @ordered
   */
  protected constraint_set false_set;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected if_constraint_itemImpl()
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
    return PSSPackage.Literals.IF_CONSTRAINT_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getIf_expr()
  {
    return if_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_expr(expression newIf_expr, NotificationChain msgs)
  {
    expression oldIf_expr = if_expr;
    if_expr = newIf_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR, oldIf_expr, newIf_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf_expr(expression newIf_expr)
  {
    if (newIf_expr != if_expr)
    {
      NotificationChain msgs = null;
      if (if_expr != null)
        msgs = ((InternalEObject)if_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR, null, msgs);
      if (newIf_expr != null)
        msgs = ((InternalEObject)newIf_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR, null, msgs);
      msgs = basicSetIf_expr(newIf_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR, newIf_expr, newIf_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_set getTrue_case()
  {
    return true_case;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrue_case(constraint_set newTrue_case, NotificationChain msgs)
  {
    constraint_set oldTrue_case = true_case;
    true_case = newTrue_case;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE, oldTrue_case, newTrue_case);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue_case(constraint_set newTrue_case)
  {
    if (newTrue_case != true_case)
    {
      NotificationChain msgs = null;
      if (true_case != null)
        msgs = ((InternalEObject)true_case).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE, null, msgs);
      if (newTrue_case != null)
        msgs = ((InternalEObject)newTrue_case).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE, null, msgs);
      msgs = basicSetTrue_case(newTrue_case, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE, newTrue_case, newTrue_case));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_set getFalse_set()
  {
    return false_set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalse_set(constraint_set newFalse_set, NotificationChain msgs)
  {
    constraint_set oldFalse_set = false_set;
    false_set = newFalse_set;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET, oldFalse_set, newFalse_set);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse_set(constraint_set newFalse_set)
  {
    if (newFalse_set != false_set)
    {
      NotificationChain msgs = null;
      if (false_set != null)
        msgs = ((InternalEObject)false_set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET, null, msgs);
      if (newFalse_set != null)
        msgs = ((InternalEObject)newFalse_set).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET, null, msgs);
      msgs = basicSetFalse_set(newFalse_set, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET, newFalse_set, newFalse_set));
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
      case PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR:
        return basicSetIf_expr(null, msgs);
      case PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE:
        return basicSetTrue_case(null, msgs);
      case PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET:
        return basicSetFalse_set(null, msgs);
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
      case PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR:
        return getIf_expr();
      case PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE:
        return getTrue_case();
      case PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET:
        return getFalse_set();
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
      case PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR:
        setIf_expr((expression)newValue);
        return;
      case PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE:
        setTrue_case((constraint_set)newValue);
        return;
      case PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET:
        setFalse_set((constraint_set)newValue);
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
      case PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR:
        setIf_expr((expression)null);
        return;
      case PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE:
        setTrue_case((constraint_set)null);
        return;
      case PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET:
        setFalse_set((constraint_set)null);
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
      case PSSPackage.IF_CONSTRAINT_ITEM__IF_EXPR:
        return if_expr != null;
      case PSSPackage.IF_CONSTRAINT_ITEM__TRUE_CASE:
        return true_case != null;
      case PSSPackage.IF_CONSTRAINT_ITEM__FALSE_SET:
        return false_set != null;
    }
    return super.eIsSet(featureID);
  }

} //if_constraint_itemImpl
