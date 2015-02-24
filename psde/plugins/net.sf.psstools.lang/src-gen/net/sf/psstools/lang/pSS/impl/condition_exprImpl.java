/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.condition_expr;
import net.sf.psstools.lang.pSS.expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>condition expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.condition_exprImpl#getTrue_expr <em>True expr</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.condition_exprImpl#getFalse_expr <em>False expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class condition_exprImpl extends expressionImpl implements condition_expr
{
  /**
   * The cached value of the '{@link #getTrue_expr() <em>True expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue_expr()
   * @generated
   * @ordered
   */
  protected expression true_expr;

  /**
   * The cached value of the '{@link #getFalse_expr() <em>False expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse_expr()
   * @generated
   * @ordered
   */
  protected expression false_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected condition_exprImpl()
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
    return PSSPackage.Literals.CONDITION_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getTrue_expr()
  {
    return true_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrue_expr(expression newTrue_expr, NotificationChain msgs)
  {
    expression oldTrue_expr = true_expr;
    true_expr = newTrue_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.CONDITION_EXPR__TRUE_EXPR, oldTrue_expr, newTrue_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue_expr(expression newTrue_expr)
  {
    if (newTrue_expr != true_expr)
    {
      NotificationChain msgs = null;
      if (true_expr != null)
        msgs = ((InternalEObject)true_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.CONDITION_EXPR__TRUE_EXPR, null, msgs);
      if (newTrue_expr != null)
        msgs = ((InternalEObject)newTrue_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.CONDITION_EXPR__TRUE_EXPR, null, msgs);
      msgs = basicSetTrue_expr(newTrue_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.CONDITION_EXPR__TRUE_EXPR, newTrue_expr, newTrue_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getFalse_expr()
  {
    return false_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalse_expr(expression newFalse_expr, NotificationChain msgs)
  {
    expression oldFalse_expr = false_expr;
    false_expr = newFalse_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.CONDITION_EXPR__FALSE_EXPR, oldFalse_expr, newFalse_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse_expr(expression newFalse_expr)
  {
    if (newFalse_expr != false_expr)
    {
      NotificationChain msgs = null;
      if (false_expr != null)
        msgs = ((InternalEObject)false_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.CONDITION_EXPR__FALSE_EXPR, null, msgs);
      if (newFalse_expr != null)
        msgs = ((InternalEObject)newFalse_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.CONDITION_EXPR__FALSE_EXPR, null, msgs);
      msgs = basicSetFalse_expr(newFalse_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.CONDITION_EXPR__FALSE_EXPR, newFalse_expr, newFalse_expr));
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
      case PSSPackage.CONDITION_EXPR__TRUE_EXPR:
        return basicSetTrue_expr(null, msgs);
      case PSSPackage.CONDITION_EXPR__FALSE_EXPR:
        return basicSetFalse_expr(null, msgs);
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
      case PSSPackage.CONDITION_EXPR__TRUE_EXPR:
        return getTrue_expr();
      case PSSPackage.CONDITION_EXPR__FALSE_EXPR:
        return getFalse_expr();
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
      case PSSPackage.CONDITION_EXPR__TRUE_EXPR:
        setTrue_expr((expression)newValue);
        return;
      case PSSPackage.CONDITION_EXPR__FALSE_EXPR:
        setFalse_expr((expression)newValue);
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
      case PSSPackage.CONDITION_EXPR__TRUE_EXPR:
        setTrue_expr((expression)null);
        return;
      case PSSPackage.CONDITION_EXPR__FALSE_EXPR:
        setFalse_expr((expression)null);
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
      case PSSPackage.CONDITION_EXPR__TRUE_EXPR:
        return true_expr != null;
      case PSSPackage.CONDITION_EXPR__FALSE_EXPR:
        return false_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //condition_exprImpl
