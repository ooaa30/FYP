/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.wesnoth.wail.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WailFactoryImpl extends EFactoryImpl implements WailFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WailFactory init()
  {
    try
    {
      WailFactory theWailFactory = (WailFactory)EPackage.Registry.INSTANCE.getEFactory(WailPackage.eNS_URI);
      if (theWailFactory != null)
      {
        return theWailFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WailFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WailFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WailPackage.MODEL: return createModel();
      case WailPackage.RULE: return createRule();
      case WailPackage.FRAGMENT: return createFragment();
      case WailPackage.CONDITIONAL: return createConditional();
      case WailPackage.WHEN_RULES: return createwhenRules();
      case WailPackage.BASELINE: return createBaseline();
      case WailPackage.DAMAGE: return createDamage();
      case WailPackage.AT_LOCATION: return createAtLocation();
      case WailPackage.UNIT_EQUALS: return createUnitEquals();
      case WailPackage.GOAL: return createGoal();
      case WailPackage.PROTECT_LEADER: return createProtectLeader();
      case WailPackage.PROTECT_UNIT_ID: return createProtectUnitID();
      case WailPackage.PROTECT_UNIT_TYPE: return createProtectUnitType();
      case WailPackage.PROTECT_LOCATION: return createProtectLocation();
      case WailPackage.GOA_LOCATION: return createGoaLocation();
      case WailPackage.DEFUALT_CA: return createDefualt_CA();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public whenRules createwhenRules()
  {
    whenRulesImpl whenRules = new whenRulesImpl();
    return whenRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Baseline createBaseline()
  {
    BaselineImpl baseline = new BaselineImpl();
    return baseline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Damage createDamage()
  {
    DamageImpl damage = new DamageImpl();
    return damage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtLocation createAtLocation()
  {
    AtLocationImpl atLocation = new AtLocationImpl();
    return atLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitEquals createUnitEquals()
  {
    UnitEqualsImpl unitEquals = new UnitEqualsImpl();
    return unitEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtectLeader createProtectLeader()
  {
    ProtectLeaderImpl protectLeader = new ProtectLeaderImpl();
    return protectLeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtectUnitID createProtectUnitID()
  {
    ProtectUnitIDImpl protectUnitID = new ProtectUnitIDImpl();
    return protectUnitID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtectUnitType createProtectUnitType()
  {
    ProtectUnitTypeImpl protectUnitType = new ProtectUnitTypeImpl();
    return protectUnitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtectLocation createProtectLocation()
  {
    ProtectLocationImpl protectLocation = new ProtectLocationImpl();
    return protectLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GoaLocation createGoaLocation()
  {
    GoaLocationImpl goaLocation = new GoaLocationImpl();
    return goaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Defualt_CA createDefualt_CA()
  {
    Defualt_CAImpl defualt_CA = new Defualt_CAImpl();
    return defualt_CA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WailPackage getWailPackage()
  {
    return (WailPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WailPackage getPackage()
  {
    return WailPackage.eINSTANCE;
  }

} //WailFactoryImpl
