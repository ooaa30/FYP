/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL.impl;

import fyp.xtext.wesnoth.mydsl.wesnothDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WesnothDSLFactoryImpl extends EFactoryImpl implements WesnothDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WesnothDSLFactory init()
  {
    try
    {
      WesnothDSLFactory theWesnothDSLFactory = (WesnothDSLFactory)EPackage.Registry.INSTANCE.getEFactory(WesnothDSLPackage.eNS_URI);
      if (theWesnothDSLFactory != null)
      {
        return theWesnothDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WesnothDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WesnothDSLFactoryImpl()
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
      case WesnothDSLPackage.MODEL: return createModel();
      case WesnothDSLPackage.RULE: return createRule();
      case WesnothDSLPackage.FRAGMENT: return createFragment();
      case WesnothDSLPackage.CONDITIONAL: return createConditional();
      case WesnothDSLPackage.DAMAGE: return createDamage();
      case WesnothDSLPackage.HEALTH_LEVEL_LESS: return createHealthLevelLess();
      case WesnothDSLPackage.HEATH_LEVEL_EQUALS: return createHeathLevelEquals();
      case WesnothDSLPackage.HEALTH_LEVEL_GREATER: return createHealthLevelGreater();
      case WesnothDSLPackage.AT_LOCATION: return createAtLocation();
      case WesnothDSLPackage.UNIT_EQUALS: return createUnitEquals();
      case WesnothDSLPackage.UNIT_ID: return createUnitID();
      case WesnothDSLPackage.DEFUALT_CA: return createDefualt_CA();
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
  public HealthLevelLess createHealthLevelLess()
  {
    HealthLevelLessImpl healthLevelLess = new HealthLevelLessImpl();
    return healthLevelLess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HeathLevelEquals createHeathLevelEquals()
  {
    HeathLevelEqualsImpl heathLevelEquals = new HeathLevelEqualsImpl();
    return heathLevelEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HealthLevelGreater createHealthLevelGreater()
  {
    HealthLevelGreaterImpl healthLevelGreater = new HealthLevelGreaterImpl();
    return healthLevelGreater;
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
  public UnitID createUnitID()
  {
    UnitIDImpl unitID = new UnitIDImpl();
    return unitID;
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
  public WesnothDSLPackage getWesnothDSLPackage()
  {
    return (WesnothDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WesnothDSLPackage getPackage()
  {
    return WesnothDSLPackage.eINSTANCE;
  }

} //WesnothDSLFactoryImpl
