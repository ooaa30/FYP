/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.wesnoth.wail.Defualt_CA;
import org.xtext.wesnoth.wail.WailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defualt CA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.impl.Defualt_CAImpl#getCaType <em>Ca Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Defualt_CAImpl extends MinimalEObjectImpl.Container implements Defualt_CA
{
  /**
   * The default value of the '{@link #getCaType() <em>Ca Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaType()
   * @generated
   * @ordered
   */
  protected static final String CA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaType() <em>Ca Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaType()
   * @generated
   * @ordered
   */
  protected String caType = CA_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Defualt_CAImpl()
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
    return WailPackage.Literals.DEFUALT_CA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCaType()
  {
    return caType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCaType(String newCaType)
  {
    String oldCaType = caType;
    caType = newCaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.DEFUALT_CA__CA_TYPE, oldCaType, caType));
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
      case WailPackage.DEFUALT_CA__CA_TYPE:
        return getCaType();
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
      case WailPackage.DEFUALT_CA__CA_TYPE:
        setCaType((String)newValue);
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
      case WailPackage.DEFUALT_CA__CA_TYPE:
        setCaType(CA_TYPE_EDEFAULT);
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
      case WailPackage.DEFUALT_CA__CA_TYPE:
        return CA_TYPE_EDEFAULT == null ? caType != null : !CA_TYPE_EDEFAULT.equals(caType);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (caType: ");
    result.append(caType);
    result.append(')');
    return result.toString();
  }

} //Defualt_CAImpl
