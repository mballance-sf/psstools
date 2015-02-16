/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.port_map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>port map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.port_mapImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.psstools.lang.pSS.impl.port_mapImpl#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class port_mapImpl extends MinimalEObjectImpl.Container implements port_map
{
  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected hierarchical_id map;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected port_mapImpl()
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
    return PSSPackage.Literals.PORT_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PORT_MAP__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public hierarchical_id getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMap(hierarchical_id newMap, NotificationChain msgs)
  {
    hierarchical_id oldMap = map;
    map = newMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSSPackage.PORT_MAP__MAP, oldMap, newMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(hierarchical_id newMap)
  {
    if (newMap != map)
    {
      NotificationChain msgs = null;
      if (map != null)
        msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSSPackage.PORT_MAP__MAP, null, msgs);
      if (newMap != null)
        msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSSPackage.PORT_MAP__MAP, null, msgs);
      msgs = basicSetMap(newMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PSSPackage.PORT_MAP__MAP, newMap, newMap));
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
      case PSSPackage.PORT_MAP__MAP:
        return basicSetMap(null, msgs);
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
      case PSSPackage.PORT_MAP__PORT:
        return getPort();
      case PSSPackage.PORT_MAP__MAP:
        return getMap();
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
      case PSSPackage.PORT_MAP__PORT:
        setPort((String)newValue);
        return;
      case PSSPackage.PORT_MAP__MAP:
        setMap((hierarchical_id)newValue);
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
      case PSSPackage.PORT_MAP__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case PSSPackage.PORT_MAP__MAP:
        setMap((hierarchical_id)null);
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
      case PSSPackage.PORT_MAP__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
      case PSSPackage.PORT_MAP__MAP:
        return map != null;
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
    result.append(" (port: ");
    result.append(port);
    result.append(')');
    return result.toString();
  }

} //port_mapImpl
