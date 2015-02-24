/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.expressionImpl#getImpl_constraint <em>Impl constraint</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.expressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.expressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.expressionImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.expressionImpl#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends expression_or_dist_itemImpl implements expression
{
  /**
   * The cached value of the '{@link #getImpl_constraint() <em>Impl constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpl_constraint()
   * @generated
   * @ordered
   */
  protected constraint_set impl_constraint;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EObject expr;

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
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected expression left;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return PSSPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_set getImpl_constraint()
  {
    return impl_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImpl_constraint(constraint_set newImpl_constraint, NotificationChain msgs)
  {
    constraint_set oldImpl_constraint = impl_constraint;
    impl_constraint = newImpl_constraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__IMPL_CONSTRAINT, oldImpl_constraint, newImpl_constraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpl_constraint(constraint_set newImpl_constraint)
  {
    if (newImpl_constraint != impl_constraint)
    {
      NotificationChain msgs = null;
      if (impl_constraint != null)
        msgs = ((InternalEObject)impl_constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__IMPL_CONSTRAINT, null, msgs);
      if (newImpl_constraint != null)
        msgs = ((InternalEObject)newImpl_constraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__IMPL_CONSTRAINT, null, msgs);
      msgs = basicSetImpl_constraint(newImpl_constraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__IMPL_CONSTRAINT, newImpl_constraint, newImpl_constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(EObject newExpr, NotificationChain msgs)
  {
    EObject oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(EObject newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__LHS, oldLhs, newLhs);
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
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__LHS, newLhs, newLhs));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__RHS, oldRhs, newRhs);
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
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__RHS, newRhs, newRhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(expression newLeft, NotificationChain msgs)
  {
    expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.EXPRESSION__LEFT, newLeft, newLeft));
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
      case PSSPackage.EXPRESSION__IMPL_CONSTRAINT:
        return basicSetImpl_constraint(null, msgs);
      case PSSPackage.EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case PSSPackage.EXPRESSION__LHS:
        return basicSetLhs(null, msgs);
      case PSSPackage.EXPRESSION__RHS:
        return basicSetRhs(null, msgs);
      case PSSPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
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
      case PSSPackage.EXPRESSION__IMPL_CONSTRAINT:
        return getImpl_constraint();
      case PSSPackage.EXPRESSION__EXPR:
        return getExpr();
      case PSSPackage.EXPRESSION__LHS:
        return getLhs();
      case PSSPackage.EXPRESSION__RHS:
        return getRhs();
      case PSSPackage.EXPRESSION__LEFT:
        return getLeft();
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
      case PSSPackage.EXPRESSION__IMPL_CONSTRAINT:
        setImpl_constraint((constraint_set)newValue);
        return;
      case PSSPackage.EXPRESSION__EXPR:
        setExpr((EObject)newValue);
        return;
      case PSSPackage.EXPRESSION__LHS:
        setLhs((expression)newValue);
        return;
      case PSSPackage.EXPRESSION__RHS:
        setRhs((expression)newValue);
        return;
      case PSSPackage.EXPRESSION__LEFT:
        setLeft((expression)newValue);
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
      case PSSPackage.EXPRESSION__IMPL_CONSTRAINT:
        setImpl_constraint((constraint_set)null);
        return;
      case PSSPackage.EXPRESSION__EXPR:
        setExpr((EObject)null);
        return;
      case PSSPackage.EXPRESSION__LHS:
        setLhs((expression)null);
        return;
      case PSSPackage.EXPRESSION__RHS:
        setRhs((expression)null);
        return;
      case PSSPackage.EXPRESSION__LEFT:
        setLeft((expression)null);
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
      case PSSPackage.EXPRESSION__IMPL_CONSTRAINT:
        return impl_constraint != null;
      case PSSPackage.EXPRESSION__EXPR:
        return expr != null;
      case PSSPackage.EXPRESSION__LHS:
        return lhs != null;
      case PSSPackage.EXPRESSION__RHS:
        return rhs != null;
      case PSSPackage.EXPRESSION__LEFT:
        return left != null;
    }
    return super.eIsSet(featureID);
  }

} //expressionImpl
