/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.type_inside_clause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>integer type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl#getAtom_type <em>Atom type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl#getInside <em>Inside</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class integer_typeImpl extends data_typeImpl implements integer_type
{
  /**
   * The default value of the '{@link #getAtom_type() <em>Atom type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom_type()
   * @generated
   * @ordered
   */
  protected static final String ATOM_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtom_type() <em>Atom type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom_type()
   * @generated
   * @ordered
   */
  protected String atom_type = ATOM_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getInside() <em>Inside</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInside()
   * @generated
   * @ordered
   */
  protected type_inside_clause inside;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected integer_typeImpl()
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
    return PSSPackage.Literals.INTEGER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtom_type()
  {
    return atom_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom_type(String newAtom_type)
  {
    String oldAtom_type = atom_type;
    atom_type = newAtom_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__ATOM_TYPE, oldAtom_type, atom_type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__LHS, oldLhs, newLhs);
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
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__LHS, newLhs, newLhs));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__RHS, oldRhs, newRhs);
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
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__RHS, newRhs, newRhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_inside_clause getInside()
  {
    return inside;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInside(type_inside_clause newInside, NotificationChain msgs)
  {
    type_inside_clause oldInside = inside;
    inside = newInside;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__INSIDE, oldInside, newInside);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInside(type_inside_clause newInside)
  {
    if (newInside != inside)
    {
      NotificationChain msgs = null;
      if (inside != null)
        msgs = ((InternalEObject)inside).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__INSIDE, null, msgs);
      if (newInside != null)
        msgs = ((InternalEObject)newInside).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.INTEGER_TYPE__INSIDE, null, msgs);
      msgs = basicSetInside(newInside, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.INTEGER_TYPE__INSIDE, newInside, newInside));
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
      case PSSPackage.INTEGER_TYPE__LHS:
        return basicSetLhs(null, msgs);
      case PSSPackage.INTEGER_TYPE__RHS:
        return basicSetRhs(null, msgs);
      case PSSPackage.INTEGER_TYPE__INSIDE:
        return basicSetInside(null, msgs);
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
      case PSSPackage.INTEGER_TYPE__ATOM_TYPE:
        return getAtom_type();
      case PSSPackage.INTEGER_TYPE__LHS:
        return getLhs();
      case PSSPackage.INTEGER_TYPE__RHS:
        return getRhs();
      case PSSPackage.INTEGER_TYPE__INSIDE:
        return getInside();
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
      case PSSPackage.INTEGER_TYPE__ATOM_TYPE:
        setAtom_type((String)newValue);
        return;
      case PSSPackage.INTEGER_TYPE__LHS:
        setLhs((expression)newValue);
        return;
      case PSSPackage.INTEGER_TYPE__RHS:
        setRhs((expression)newValue);
        return;
      case PSSPackage.INTEGER_TYPE__INSIDE:
        setInside((type_inside_clause)newValue);
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
      case PSSPackage.INTEGER_TYPE__ATOM_TYPE:
        setAtom_type(ATOM_TYPE_EDEFAULT);
        return;
      case PSSPackage.INTEGER_TYPE__LHS:
        setLhs((expression)null);
        return;
      case PSSPackage.INTEGER_TYPE__RHS:
        setRhs((expression)null);
        return;
      case PSSPackage.INTEGER_TYPE__INSIDE:
        setInside((type_inside_clause)null);
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
      case PSSPackage.INTEGER_TYPE__ATOM_TYPE:
        return ATOM_TYPE_EDEFAULT == null ? atom_type != null : !ATOM_TYPE_EDEFAULT.equals(atom_type);
      case PSSPackage.INTEGER_TYPE__LHS:
        return lhs != null;
      case PSSPackage.INTEGER_TYPE__RHS:
        return rhs != null;
      case PSSPackage.INTEGER_TYPE__INSIDE:
        return inside != null;
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
    result.append(" (atom_type: ");
    result.append(atom_type);
    result.append(')');
    return result.toString();
  }

} //integer_typeImpl
