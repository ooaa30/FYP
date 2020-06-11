/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.Conditional#getX <em>X</em>}</li>
 * </ul>
 *
 * @see org.xtext.wesnoth.wail.WailPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.wesnoth.wail.whenRules}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference list.
   * @see org.xtext.wesnoth.wail.WailPackage#getConditional_X()
   * @model containment="true"
   * @generated
   */
  EList<whenRules> getX();

} // Conditional
