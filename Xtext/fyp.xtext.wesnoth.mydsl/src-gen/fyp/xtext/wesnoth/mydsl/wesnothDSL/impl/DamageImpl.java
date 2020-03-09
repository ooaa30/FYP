/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL.impl;

import fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Damage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.DamageImpl#getHealth <em>Health</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DamageImpl extends ConditionalImpl implements Damage
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
  protected DamageImpl()
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
    return WesnothDSLPackage.Literals.DAMAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WesnothDSLPackage.DAMAGE__HEALTH, oldHealth, health));
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
      case WesnothDSLPackage.DAMAGE__HEALTH:
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
      case WesnothDSLPackage.DAMAGE__HEALTH:
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
      case WesnothDSLPackage.DAMAGE__HEALTH:
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
      case WesnothDSLPackage.DAMAGE__HEALTH:
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

} //DamageImpl
