/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL.util;

import fyp.xtext.wesnoth.mydsl.wesnothDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage
 * @generated
 */
public class WesnothDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WesnothDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WesnothDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WesnothDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WesnothDSLSwitch<Adapter> modelSwitch =
    new WesnothDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseFragment(Fragment object)
      {
        return createFragmentAdapter();
      }
      @Override
      public Adapter caseConditional(Conditional object)
      {
        return createConditionalAdapter();
      }
      @Override
      public Adapter caseBaseline(Baseline object)
      {
        return createBaselineAdapter();
      }
      @Override
      public Adapter caseDamage(Damage object)
      {
        return createDamageAdapter();
      }
      @Override
      public Adapter caseAtLocation(AtLocation object)
      {
        return createAtLocationAdapter();
      }
      @Override
      public Adapter caseUnitEquals(UnitEquals object)
      {
        return createUnitEqualsAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseGoalCondition(GoalCondition object)
      {
        return createGoalConditionAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseDefualt_CA(Defualt_CA object)
      {
        return createDefualt_CAAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment
   * @generated
   */
  public Adapter createFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional
   * @generated
   */
  public Adapter createConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline <em>Baseline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline
   * @generated
   */
  public Adapter createBaselineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage <em>Damage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage
   * @generated
   */
  public Adapter createDamageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation <em>At Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation
   * @generated
   */
  public Adapter createAtLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals <em>Unit Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals
   * @generated
   */
  public Adapter createUnitEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.GoalCondition <em>Goal Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.GoalCondition
   * @generated
   */
  public Adapter createGoalConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA <em>Defualt CA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA
   * @generated
   */
  public Adapter createDefualt_CAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WesnothDSLAdapterFactory
