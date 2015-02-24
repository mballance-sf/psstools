/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.rule_production;
import net.sf.psstools.lang.pSS.symbol_definition;

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
 * An implementation of the model object '<em><b>symbol definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_definitionImpl#getSymbol_name <em>Symbol name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_definitionImpl#getBody_items <em>Body items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class symbol_definitionImpl extends graph_body_itemImpl implements symbol_definition
{
  /**
   * The default value of the '{@link #getSymbol_name() <em>Symbol name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol_name()
   * @generated
   * @ordered
   */
  protected static final String SYMBOL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbol_name() <em>Symbol name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol_name()
   * @generated
   * @ordered
   */
  protected String symbol_name = SYMBOL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody_items() <em>Body items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody_items()
   * @generated
   * @ordered
   */
  protected EList<rule_production> body_items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected symbol_definitionImpl()
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
    return PSSPackage.Literals.SYMBOL_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbol_name()
  {
    return symbol_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol_name(String newSymbol_name)
  {
    String oldSymbol_name = symbol_name;
    symbol_name = newSymbol_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SYMBOL_DEFINITION__SYMBOL_NAME, oldSymbol_name, symbol_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rule_production> getBody_items()
  {
    if (body_items == null)
    {
      body_items = new EObjectContainmentEList<rule_production>(rule_production.class, this, PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS);
    }
    return body_items;
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
      case PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS:
        return ((InternalEList<?>)getBody_items()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.SYMBOL_DEFINITION__SYMBOL_NAME:
        return getSymbol_name();
      case PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS:
        return getBody_items();
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
      case PSSPackage.SYMBOL_DEFINITION__SYMBOL_NAME:
        setSymbol_name((String)newValue);
        return;
      case PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS:
        getBody_items().clear();
        getBody_items().addAll((Collection<? extends rule_production>)newValue);
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
      case PSSPackage.SYMBOL_DEFINITION__SYMBOL_NAME:
        setSymbol_name(SYMBOL_NAME_EDEFAULT);
        return;
      case PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS:
        getBody_items().clear();
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
      case PSSPackage.SYMBOL_DEFINITION__SYMBOL_NAME:
        return SYMBOL_NAME_EDEFAULT == null ? symbol_name != null : !SYMBOL_NAME_EDEFAULT.equals(symbol_name);
      case PSSPackage.SYMBOL_DEFINITION__BODY_ITEMS:
        return body_items != null && !body_items.isEmpty();
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
    result.append(" (symbol_name: ");
    result.append(symbol_name);
    result.append(')');
    return result.toString();
  }

} //symbol_definitionImpl
