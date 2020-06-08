/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.wesnoth.wail.WailPackage
 * @generated
 */
public interface WailFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WailFactory eINSTANCE = org.xtext.wesnoth.wail.impl.WailFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fragment</em>'.
   * @generated
   */
  Fragment createFragment();

  /**
   * Returns a new object of class '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional</em>'.
   * @generated
   */
  Conditional createConditional();

  /**
   * Returns a new object of class '<em>when Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>when Rules</em>'.
   * @generated
   */
  whenRules createwhenRules();

  /**
   * Returns a new object of class '<em>Baseline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Baseline</em>'.
   * @generated
   */
  Baseline createBaseline();

  /**
   * Returns a new object of class '<em>Damage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Damage</em>'.
   * @generated
   */
  Damage createDamage();

  /**
   * Returns a new object of class '<em>At Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Location</em>'.
   * @generated
   */
  AtLocation createAtLocation();

  /**
   * Returns a new object of class '<em>Unit Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Equals</em>'.
   * @generated
   */
  UnitEquals createUnitEquals();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Protect Leader</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protect Leader</em>'.
   * @generated
   */
  ProtectLeader createProtectLeader();

  /**
   * Returns a new object of class '<em>Protect Unit ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protect Unit ID</em>'.
   * @generated
   */
  ProtectUnitID createProtectUnitID();

  /**
   * Returns a new object of class '<em>Protect Unit Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protect Unit Type</em>'.
   * @generated
   */
  ProtectUnitType createProtectUnitType();

  /**
   * Returns a new object of class '<em>Protect Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protect Location</em>'.
   * @generated
   */
  ProtectLocation createProtectLocation();

  /**
   * Returns a new object of class '<em>Goa Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goa Location</em>'.
   * @generated
   */
  GoaLocation createGoaLocation();

  /**
   * Returns a new object of class '<em>Defualt CA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defualt CA</em>'.
   * @generated
   */
  Defualt_CA createDefualt_CA();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WailPackage getWailPackage();

} //WailFactory
