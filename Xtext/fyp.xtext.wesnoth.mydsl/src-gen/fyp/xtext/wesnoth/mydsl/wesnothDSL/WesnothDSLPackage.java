/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLFactory
 * @model kind="package"
 * @generated
 */
public interface WesnothDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wesnothDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.fyp/wesnoth/mydsl/WesnothDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wesnothDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WesnothDSLPackage eINSTANCE = fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ModelImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.RuleImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__FRAGMENTS = 1;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__GOALS = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.FragmentImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Defualt cas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__DEFUALT_CAS = 1;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ConditionalImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 3;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__X = 0;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.whenRulesImpl <em>when Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.whenRulesImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getwhenRules()
   * @generated
   */
  int WHEN_RULES = 4;

  /**
   * The number of structural features of the '<em>when Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_RULES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.BaselineImpl <em>Baseline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.BaselineImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getBaseline()
   * @generated
   */
  int BASELINE = 5;

  /**
   * The feature id for the '<em><b>Always</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE__ALWAYS = WHEN_RULES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Baseline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASELINE_FEATURE_COUNT = WHEN_RULES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.DamageImpl <em>Damage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.DamageImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getDamage()
   * @generated
   */
  int DAMAGE = 6;

  /**
   * The feature id for the '<em><b>Health</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGE__HEALTH = WHEN_RULES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Damage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGE_FEATURE_COUNT = WHEN_RULES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.AtLocationImpl <em>At Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.AtLocationImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getAtLocation()
   * @generated
   */
  int AT_LOCATION = 7;

  /**
   * The feature id for the '<em><b>XAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LOCATION__XAXIS = WHEN_RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>YAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LOCATION__YAXIS = WHEN_RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>At Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LOCATION_FEATURE_COUNT = WHEN_RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.UnitEqualsImpl <em>Unit Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.UnitEqualsImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getUnitEquals()
   * @generated
   */
  int UNIT_EQUALS = 8;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_EQUALS__UNIT = WHEN_RULES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unit Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_EQUALS_FEATURE_COUNT = WHEN_RULES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoalImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 9;

  /**
   * The feature id for the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__GOAL = 0;

  /**
   * The feature id for the '<em><b>Loc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__LOC_VALUE = 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoaLocationImpl <em>Goa Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoaLocationImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getGoaLocation()
   * @generated
   */
  int GOA_LOCATION = 10;

  /**
   * The feature id for the '<em><b>XAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOA_LOCATION__XAXIS = 0;

  /**
   * The feature id for the '<em><b>YAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOA_LOCATION__YAXIS = 1;

  /**
   * The number of structural features of the '<em>Goa Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOA_LOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.Defualt_CAImpl <em>Defualt CA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.Defualt_CAImpl
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getDefualt_CA()
   * @generated
   */
  int DEFUALT_CA = 11;

  /**
   * The feature id for the '<em><b>Ca Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFUALT_CA__CA_TYPE = 0;

  /**
   * The number of structural features of the '<em>Defualt CA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFUALT_CA_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getFragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fragments</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getFragments()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Fragments();

  /**
   * Returns the meta object for the containment reference list '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule#getGoals()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Goals();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for the containment reference '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getCondition()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getDefualt_cas <em>Defualt cas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defualt cas</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getDefualt_cas()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_Defualt_cas();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional#getX()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_X();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.whenRules <em>when Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>when Rules</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.whenRules
   * @generated
   */
  EClass getwhenRules();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline <em>Baseline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Baseline</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline
   * @generated
   */
  EClass getBaseline();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline#getAlways <em>Always</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Always</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline#getAlways()
   * @see #getBaseline()
   * @generated
   */
  EAttribute getBaseline_Always();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage <em>Damage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Damage</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage
   * @generated
   */
  EClass getDamage();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage#getHealth <em>Health</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Health</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage#getHealth()
   * @see #getDamage()
   * @generated
   */
  EAttribute getDamage_Health();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation <em>At Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Location</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation
   * @generated
   */
  EClass getAtLocation();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation#getXAxis <em>XAxis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>XAxis</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation#getXAxis()
   * @see #getAtLocation()
   * @generated
   */
  EAttribute getAtLocation_XAxis();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation#getYAxis <em>YAxis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>YAxis</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation#getYAxis()
   * @see #getAtLocation()
   * @generated
   */
  EAttribute getAtLocation_YAxis();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals <em>Unit Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Equals</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals
   * @generated
   */
  EClass getUnitEquals();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals#getUnit()
   * @see #getUnitEquals()
   * @generated
   */
  EAttribute getUnitEquals_Unit();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the containment reference '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goal</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal#getGoal()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Goal();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal#getLocValue <em>Loc Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loc Value</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal#getLocValue()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_LocValue();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation <em>Goa Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goa Location</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation
   * @generated
   */
  EClass getGoaLocation();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation#getXAxis <em>XAxis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>XAxis</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation#getXAxis()
   * @see #getGoaLocation()
   * @generated
   */
  EAttribute getGoaLocation_XAxis();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation#getYAxis <em>YAxis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>YAxis</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation#getYAxis()
   * @see #getGoaLocation()
   * @generated
   */
  EAttribute getGoaLocation_YAxis();

  /**
   * Returns the meta object for class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA <em>Defualt CA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defualt CA</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA
   * @generated
   */
  EClass getDefualt_CA();

  /**
   * Returns the meta object for the attribute '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA#getCaType <em>Ca Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ca Type</em>'.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA#getCaType()
   * @see #getDefualt_CA()
   * @generated
   */
  EAttribute getDefualt_CA_CaType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WesnothDSLFactory getWesnothDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ModelImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.RuleImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__FRAGMENTS = eINSTANCE.getRule_Fragments();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__GOALS = eINSTANCE.getRule_Goals();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.FragmentImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__CONDITION = eINSTANCE.getFragment_Condition();

    /**
     * The meta object literal for the '<em><b>Defualt cas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__DEFUALT_CAS = eINSTANCE.getFragment_Defualt_cas();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.ConditionalImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__X = eINSTANCE.getConditional_X();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.whenRulesImpl <em>when Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.whenRulesImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getwhenRules()
     * @generated
     */
    EClass WHEN_RULES = eINSTANCE.getwhenRules();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.BaselineImpl <em>Baseline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.BaselineImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getBaseline()
     * @generated
     */
    EClass BASELINE = eINSTANCE.getBaseline();

    /**
     * The meta object literal for the '<em><b>Always</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASELINE__ALWAYS = eINSTANCE.getBaseline_Always();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.DamageImpl <em>Damage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.DamageImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getDamage()
     * @generated
     */
    EClass DAMAGE = eINSTANCE.getDamage();

    /**
     * The meta object literal for the '<em><b>Health</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAMAGE__HEALTH = eINSTANCE.getDamage_Health();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.AtLocationImpl <em>At Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.AtLocationImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getAtLocation()
     * @generated
     */
    EClass AT_LOCATION = eINSTANCE.getAtLocation();

    /**
     * The meta object literal for the '<em><b>XAxis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_LOCATION__XAXIS = eINSTANCE.getAtLocation_XAxis();

    /**
     * The meta object literal for the '<em><b>YAxis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_LOCATION__YAXIS = eINSTANCE.getAtLocation_YAxis();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.UnitEqualsImpl <em>Unit Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.UnitEqualsImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getUnitEquals()
     * @generated
     */
    EClass UNIT_EQUALS = eINSTANCE.getUnitEquals();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_EQUALS__UNIT = eINSTANCE.getUnitEquals_Unit();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoalImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__GOAL = eINSTANCE.getGoal_Goal();

    /**
     * The meta object literal for the '<em><b>Loc Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__LOC_VALUE = eINSTANCE.getGoal_LocValue();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoaLocationImpl <em>Goa Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.GoaLocationImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getGoaLocation()
     * @generated
     */
    EClass GOA_LOCATION = eINSTANCE.getGoaLocation();

    /**
     * The meta object literal for the '<em><b>XAxis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOA_LOCATION__XAXIS = eINSTANCE.getGoaLocation_XAxis();

    /**
     * The meta object literal for the '<em><b>YAxis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOA_LOCATION__YAXIS = eINSTANCE.getGoaLocation_YAxis();

    /**
     * The meta object literal for the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.Defualt_CAImpl <em>Defualt CA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.Defualt_CAImpl
     * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.impl.WesnothDSLPackageImpl#getDefualt_CA()
     * @generated
     */
    EClass DEFUALT_CA = eINSTANCE.getDefualt_CA();

    /**
     * The meta object literal for the '<em><b>Ca Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFUALT_CA__CA_TYPE = eINSTANCE.getDefualt_CA_CaType();

  }

} //WesnothDSLPackage
