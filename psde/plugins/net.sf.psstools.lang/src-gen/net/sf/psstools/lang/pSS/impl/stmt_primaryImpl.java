/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.stmt_or_block;
import net.sf.psstools.lang.pSS.stmt_primary;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stmt primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.stmt_primaryImpl#getStmt_list <em>Stmt list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stmt_primaryImpl extends alt_stmtImpl implements stmt_primary
{
  /**
   * The cached value of the '{@link #getStmt_list() <em>Stmt list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt_list()
   * @generated
   * @ordered
   */
  protected EList<stmt_or_block> stmt_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stmt_primaryImpl()
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
    return PSSPackage.Literals.STMT_PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<stmt_or_block> getStmt_list()
  {
    if (stmt_list == null)
    {
      stmt_list = new EObjectContainmentEList<stmt_or_block>(stmt_or_block.class, this, PSSPackage.STMT_PRIMARY__STMT_LIST);
    }
    return stmt_list;
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
      case PSSPackage.STMT_PRIMARY__STMT_LIST:
        return ((InternalEList<?>)getStmt_list()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.STMT_PRIMARY__STMT_LIST:
        return getStmt_list();
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
      case PSSPackage.STMT_PRIMARY__STMT_LIST:
        getStmt_list().clear();
        getStmt_list().addAll((Collection<? extends stmt_or_block>)newValue);
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
      case PSSPackage.STMT_PRIMARY__STMT_LIST:
        getStmt_list().clear();
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
      case PSSPackage.STMT_PRIMARY__STMT_LIST:
        return stmt_list != null && !stmt_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //stmt_primaryImpl
