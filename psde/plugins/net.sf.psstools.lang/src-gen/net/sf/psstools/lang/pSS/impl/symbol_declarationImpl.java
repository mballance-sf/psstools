/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.stmt_or_block;
import net.sf.psstools.lang.pSS.symbol_declaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>symbol declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl#getInline_rule <em>Inline rule</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class symbol_declarationImpl extends graph_body_itemImpl implements symbol_declaration
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
   * The cached value of the '{@link #getInline_rule() <em>Inline rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInline_rule()
   * @generated
   * @ordered
   */
  protected stmt_or_block inline_rule;

  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<String> names;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected symbol_declarationImpl()
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
    return PSSPackage.Literals.SYMBOL_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SYMBOL_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stmt_or_block getInline_rule()
  {
    return inline_rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInline_rule(stmt_or_block newInline_rule, NotificationChain msgs)
  {
    stmt_or_block oldInline_rule = inline_rule;
    inline_rule = newInline_rule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.SYMBOL_DECLARATION__INLINE_RULE, oldInline_rule, newInline_rule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInline_rule(stmt_or_block newInline_rule)
  {
    if (newInline_rule != inline_rule)
    {
      NotificationChain msgs = null;
      if (inline_rule != null)
        msgs = ((InternalEObject)inline_rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SYMBOL_DECLARATION__INLINE_RULE, null, msgs);
      if (newInline_rule != null)
        msgs = ((InternalEObject)newInline_rule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.SYMBOL_DECLARATION__INLINE_RULE, null, msgs);
      msgs = basicSetInline_rule(newInline_rule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.SYMBOL_DECLARATION__INLINE_RULE, newInline_rule, newInline_rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNames()
  {
    if (names == null)
    {
      names = new EDataTypeEList<String>(String.class, this, PSSPackage.SYMBOL_DECLARATION__NAMES);
    }
    return names;
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
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        return basicSetInline_rule(null, msgs);
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
      case PSSPackage.SYMBOL_DECLARATION__NAME:
        return getName();
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        return getInline_rule();
      case PSSPackage.SYMBOL_DECLARATION__NAMES:
        return getNames();
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
      case PSSPackage.SYMBOL_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        setInline_rule((stmt_or_block)newValue);
        return;
      case PSSPackage.SYMBOL_DECLARATION__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends String>)newValue);
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
      case PSSPackage.SYMBOL_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        setInline_rule((stmt_or_block)null);
        return;
      case PSSPackage.SYMBOL_DECLARATION__NAMES:
        getNames().clear();
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
      case PSSPackage.SYMBOL_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        return inline_rule != null;
      case PSSPackage.SYMBOL_DECLARATION__NAMES:
        return names != null && !names.isEmpty();
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
    result.append(", names: ");
    result.append(names);
    result.append(')');
    return result.toString();
  }

} //symbol_declarationImpl
