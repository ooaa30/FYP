/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL.impl;

import fyp.xtext.wesnoth.mydsl.wesnothDSL.HeathLevelEquals;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heath Level Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.HeathLevelEqualsImpl#getHealth <em>Health</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeathLevelEqualsImpl extends MinimalEObjectImpl.Container implements HeathLevelEquals
{
  /**
   * The default value of the '{@link #getHealth() <em>Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHealth()
   * @generated
   * @ordered
   */
  protected static final int HEALTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHealth() <em>Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHealth()
   * @generated
   * @ordered
   */
  protected int health = HEALTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeathLevelEqualsImpl()
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
    return WesnothDSLPackage.Literals.HEATH_LEVEL_EQUALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHealth()
  {
    return health;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHealth(int newHealth)
  {
    int oldHealth = health;
    health = newHealth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WesnothDSLPackage.HEATH_LEVEL_EQUALS__HEALTH, oldHealth, health));
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
      case WesnothDSLPackage.HEATH_LEVEL_EQUALS__HEALTH:
        return getHealth();
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
      case WesnothDSLPackage.HEATH_LEVEL_EQUALS__HEALTH:
        setHealth((Integer)newValue);
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
      case WesnothDSLPackage.HEATH_LEVEL_EQUALS__HEALTH:
        setHealth(HEALTH_EDEFAULT);
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
      case WesnothDSLPackage.HEATH_LEVEL_EQUALS__HEALTH:
        return health != HEALTH_EDEFAULT;
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
    result.append(" (health: ");
    result.append(health);
    result.append(')');
    return result.toString();
  }

} //HeathLevelEqualsImpl
