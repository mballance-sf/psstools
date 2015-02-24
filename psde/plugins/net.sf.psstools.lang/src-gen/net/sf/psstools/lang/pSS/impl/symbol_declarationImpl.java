/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.rule_stmt_or_block;
import net.sf.psstools.lang.pSS.symbol_decl_item;
import net.sf.psstools.lang.pSS.symbol_declaration;

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
 * An implementation of the model object '<em><b>symbol declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl#getDecl_list <em>Decl list</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl#getInline_rule <em>Inline rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class symbol_declarationImpl extends graph_body_itemImpl implements symbol_declaration
{
  /**
   * The cached value of the '{@link #getDecl_list() <em>Decl list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl_list()
   * @generated
   * @ordered
   */
  protected EList<symbol_decl_item> decl_list;

  /**
   * The cached value of the '{@link #getInline_rule() <em>Inline rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInline_rule()
   * @generated
   * @ordered
   */
  protected rule_stmt_or_block inline_rule;

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
  public EList<symbol_decl_item> getDecl_list()
  {
    if (decl_list == null)
    {
      decl_list = new EObjectContainmentEList<symbol_decl_item>(symbol_decl_item.class, this, PSSPackage.SYMBOL_DECLARATION__DECL_LIST);
    }
    return decl_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_or_block getInline_rule()
  {
    return inline_rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInline_rule(rule_stmt_or_block newInline_rule, NotificationChain msgs)
  {
    rule_stmt_or_block oldInline_rule = inline_rule;
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
  public void setInline_rule(rule_stmt_or_block newInline_rule)
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PSSPackage.SYMBOL_DECLARATION__DECL_LIST:
        return ((InternalEList<?>)getDecl_list()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.SYMBOL_DECLARATION__DECL_LIST:
        return getDecl_list();
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        return getInline_rule();
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
      case PSSPackage.SYMBOL_DECLARATION__DECL_LIST:
        getDecl_list().clear();
        getDecl_list().addAll((Collection<? extends symbol_decl_item>)newValue);
        return;
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        setInline_rule((rule_stmt_or_block)newValue);
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
      case PSSPackage.SYMBOL_DECLARATION__DECL_LIST:
        getDecl_list().clear();
        return;
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        setInline_rule((rule_stmt_or_block)null);
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
      case PSSPackage.SYMBOL_DECLARATION__DECL_LIST:
        return decl_list != null && !decl_list.isEmpty();
      case PSSPackage.SYMBOL_DECLARATION__INLINE_RULE:
        return inline_rule != null;
    }
    return super.eIsSet(featureID);
  }

} //symbol_declarationImpl
