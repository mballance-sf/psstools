/**
 */
package net.sf.psstools.lang.pSS.impl;

import java.util.Collection;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.graph_data_declaration;
import net.sf.psstools.lang.pSS.graph_datatype;
import net.sf.psstools.lang.pSS.port_map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>graph data declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl#getNames <em>Names</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl#getPortmaps <em>Portmaps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class graph_data_declarationImpl extends graph_body_itemImpl implements graph_data_declaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected graph_datatype type;

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
   * The cached value of the '{@link #getPortmaps() <em>Portmaps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortmaps()
   * @generated
   * @ordered
   */
  protected EList<port_map> portmaps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected graph_data_declarationImpl()
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
    return PSSPackage.Literals.GRAPH_DATA_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_datatype getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(graph_datatype newType, NotificationChain msgs)
  {
    graph_datatype oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.GRAPH_DATA_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(graph_datatype newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.GRAPH_DATA_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.GRAPH_DATA_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.GRAPH_DATA_DECLARATION__TYPE, newType, newType));
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
      names = new EDataTypeEList<String>(String.class, this, PSSPackage.GRAPH_DATA_DECLARATION__NAMES);
    }
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<port_map> getPortmaps()
  {
    if (portmaps == null)
    {
      portmaps = new EObjectContainmentEList<port_map>(port_map.class, this, PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS);
    }
    return portmaps;
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
      case PSSPackage.GRAPH_DATA_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS:
        return ((InternalEList<?>)getPortmaps()).basicRemove(otherEnd, msgs);
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
      case PSSPackage.GRAPH_DATA_DECLARATION__TYPE:
        return getType();
      case PSSPackage.GRAPH_DATA_DECLARATION__NAMES:
        return getNames();
      case PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS:
        return getPortmaps();
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
      case PSSPackage.GRAPH_DATA_DECLARATION__TYPE:
        setType((graph_datatype)newValue);
        return;
      case PSSPackage.GRAPH_DATA_DECLARATION__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends String>)newValue);
        return;
      case PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS:
        getPortmaps().clear();
        getPortmaps().addAll((Collection<? extends port_map>)newValue);
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
      case PSSPackage.GRAPH_DATA_DECLARATION__TYPE:
        setType((graph_datatype)null);
        return;
      case PSSPackage.GRAPH_DATA_DECLARATION__NAMES:
        getNames().clear();
        return;
      case PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS:
        getPortmaps().clear();
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
      case PSSPackage.GRAPH_DATA_DECLARATION__TYPE:
        return type != null;
      case PSSPackage.GRAPH_DATA_DECLARATION__NAMES:
        return names != null && !names.isEmpty();
      case PSSPackage.GRAPH_DATA_DECLARATION__PORTMAPS:
        return portmaps != null && !portmaps.isEmpty();
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
    result.append(" (names: ");
    result.append(names);
    result.append(')');
    return result.toString();
  }

} //graph_data_declarationImpl
