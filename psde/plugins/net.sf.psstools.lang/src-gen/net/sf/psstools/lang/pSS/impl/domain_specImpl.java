/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.domain_spec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>domain spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.domain_specImpl#getRange_lhs <em>Range lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.domain_specImpl#getRange_rhs <em>Range rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class domain_specImpl extends MinimalEObjectImpl.Container implements domain_spec
{
  /**
   * The default value of the '{@link #getRange_lhs() <em>Range lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange_lhs()
   * @generated
   * @ordered
   */
  protected static final int RANGE_LHS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRange_lhs() <em>Range lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange_lhs()
   * @generated
   * @ordered
   */
  protected int range_lhs = RANGE_LHS_EDEFAULT;

  /**
   * The default value of the '{@link #getRange_rhs() <em>Range rhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange_rhs()
   * @generated
   * @ordered
   */
  protected static final int RANGE_RHS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRange_rhs() <em>Range rhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange_rhs()
   * @generated
   * @ordered
   */
  protected int range_rhs = RANGE_RHS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected domain_specImpl()
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
    return PSSPackage.Literals.DOMAIN_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRange_lhs()
  {
    return range_lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange_lhs(int newRange_lhs)
  {
    int oldRange_lhs = range_lhs;
    range_lhs = newRange_lhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.DOMAIN_SPEC__RANGE_LHS, oldRange_lhs, range_lhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRange_rhs()
  {
    return range_rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange_rhs(int newRange_rhs)
  {
    int oldRange_rhs = range_rhs;
    range_rhs = newRange_rhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.DOMAIN_SPEC__RANGE_RHS, oldRange_rhs, range_rhs));
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
      case PSSPackage.DOMAIN_SPEC__RANGE_LHS:
        return getRange_lhs();
      case PSSPackage.DOMAIN_SPEC__RANGE_RHS:
        return getRange_rhs();
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
      case PSSPackage.DOMAIN_SPEC__RANGE_LHS:
        setRange_lhs((Integer)newValue);
        return;
      case PSSPackage.DOMAIN_SPEC__RANGE_RHS:
        setRange_rhs((Integer)newValue);
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
      case PSSPackage.DOMAIN_SPEC__RANGE_LHS:
        setRange_lhs(RANGE_LHS_EDEFAULT);
        return;
      case PSSPackage.DOMAIN_SPEC__RANGE_RHS:
        setRange_rhs(RANGE_RHS_EDEFAULT);
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
      case PSSPackage.DOMAIN_SPEC__RANGE_LHS:
        return range_lhs != RANGE_LHS_EDEFAULT;
      case PSSPackage.DOMAIN_SPEC__RANGE_RHS:
        return range_rhs != RANGE_RHS_EDEFAULT;
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
    result.append(" (range_lhs: ");
    result.append(range_lhs);
    result.append(", range_rhs: ");
    result.append(range_rhs);
    result.append(')');
    return result.toString();
  }

} //domain_specImpl
