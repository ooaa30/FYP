/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage#getHealth <em>Health</em>}</li>
 * </ul>
 *
 * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage#getDamage()
 * @model
 * @generated
 */
public interface Damage extends Conditional
{
  /**
   * Returns the value of the '<em><b>Health</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Health</em>' attribute.
   * @see #setHealth(int)
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage#getDamage_Health()
   * @model
   * @generated
   */
  int getHealth();

  /**
   * Sets the value of the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage#getHealth <em>Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Health</em>' attribute.
   * @see #getHealth()
   * @generated
   */
  void setHealth(int value);

} // Damage