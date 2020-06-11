/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.wesnoth.wail.IDEquals;
import org.xtext.wesnoth.wail.WailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.impl.IDEqualsImpl#getUnitID <em>Unit ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDEqualsImpl extends whenRulesImpl implements IDEquals
{
  /**
   * The default value of the '{@link #getUnitID() <em>Unit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitID()
   * @generated
   * @ordered
   */
  protected static final String UNIT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnitID() <em>Unit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitID()
   * @generated
   * @ordered
   */
  protected String unitID = UNIT_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDEqualsImpl()
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
    return WailPackage.Literals.ID_EQUALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnitID()
  {
    return unitID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnitID(String newUnitID)
  {
    String oldUnitID = unitID;
    unitID = newUnitID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.ID_EQUALS__UNIT_ID, oldUnitID, unitID));
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
      case WailPackage.ID_EQUALS__UNIT_ID:
        return getUnitID();
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
      case WailPackage.ID_EQUALS__UNIT_ID:
        setUnitID((String)newValue);
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
      case WailPackage.ID_EQUALS__UNIT_ID:
        setUnitID(UNIT_ID_EDEFAULT);
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
      case WailPackage.ID_EQUALS__UNIT_ID:
        return UNIT_ID_EDEFAULT == null ? unitID != null : !UNIT_ID_EDEFAULT.equals(unitID);
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
    result.append(" (unitID: ");
    result.append(unitID);
    result.append(')');
    return result.toString();
  }

} //IDEqualsImpl
