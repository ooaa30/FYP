/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.Goal#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Goal#getLocValue <em>Loc Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.wesnoth.wail.WailPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject
{
  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference.
   * @see #setGoal(GoaLocation)
   * @see org.xtext.wesnoth.wail.WailPackage#getGoal_Goal()
   * @model containment="true"
   * @generated
   */
  GoaLocation getGoal();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Goal#getGoal <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' containment reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(GoaLocation value);

  /**
   * Returns the value of the '<em><b>Loc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc Value</em>' attribute.
   * @see #setLocValue(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getGoal_LocValue()
   * @model
   * @generated
   */
  int getLocValue();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Goal#getLocValue <em>Loc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc Value</em>' attribute.
   * @see #getLocValue()
   * @generated
   */
  void setLocValue(int value);

} // Goal
