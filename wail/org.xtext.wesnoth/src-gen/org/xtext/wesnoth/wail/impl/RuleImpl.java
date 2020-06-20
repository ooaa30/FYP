/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.wail.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.wesnoth.wail.Aggression;
import org.xtext.wesnoth.wail.Caution;
import org.xtext.wesnoth.wail.Fragment;
import org.xtext.wesnoth.wail.Goal;
import org.xtext.wesnoth.wail.Grouping;
import org.xtext.wesnoth.wail.Recruitment;
import org.xtext.wesnoth.wail.Rule;
import org.xtext.wesnoth.wail.WailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getAggressionval <em>Aggressionval</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getCautionval <em>Cautionval</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getGroupingVal <em>Grouping Val</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.RuleImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragments()
   * @generated
   * @ordered
   */
  protected EList<Fragment> fragments;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Goal> goals;

  /**
   * The cached value of the '{@link #getAggressionval() <em>Aggressionval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggressionval()
   * @generated
   * @ordered
   */
  protected Aggression aggressionval;

  /**
   * The cached value of the '{@link #getCautionval() <em>Cautionval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCautionval()
   * @generated
   * @ordered
   */
  protected Caution cautionval;

  /**
   * The cached value of the '{@link #getGroupingVal() <em>Grouping Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupingVal()
   * @generated
   * @ordered
   */
  protected Grouping groupingVal;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected EList<Recruitment> units;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return WailPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Fragment> getFragments()
  {
    if (fragments == null)
    {
      fragments = new EObjectContainmentEList<Fragment>(Fragment.class, this, WailPackage.RULE__FRAGMENTS);
    }
    return fragments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Goal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, WailPackage.RULE__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Aggression getAggressionval()
  {
    return aggressionval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggressionval(Aggression newAggressionval, NotificationChain msgs)
  {
    Aggression oldAggressionval = aggressionval;
    aggressionval = newAggressionval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WailPackage.RULE__AGGRESSIONVAL, oldAggressionval, newAggressionval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAggressionval(Aggression newAggressionval)
  {
    if (newAggressionval != aggressionval)
    {
      NotificationChain msgs = null;
      if (aggressionval != null)
        msgs = ((InternalEObject)aggressionval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__AGGRESSIONVAL, null, msgs);
      if (newAggressionval != null)
        msgs = ((InternalEObject)newAggressionval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__AGGRESSIONVAL, null, msgs);
      msgs = basicSetAggressionval(newAggressionval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.RULE__AGGRESSIONVAL, newAggressionval, newAggressionval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Caution getCautionval()
  {
    return cautionval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCautionval(Caution newCautionval, NotificationChain msgs)
  {
    Caution oldCautionval = cautionval;
    cautionval = newCautionval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WailPackage.RULE__CAUTIONVAL, oldCautionval, newCautionval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCautionval(Caution newCautionval)
  {
    if (newCautionval != cautionval)
    {
      NotificationChain msgs = null;
      if (cautionval != null)
        msgs = ((InternalEObject)cautionval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__CAUTIONVAL, null, msgs);
      if (newCautionval != null)
        msgs = ((InternalEObject)newCautionval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__CAUTIONVAL, null, msgs);
      msgs = basicSetCautionval(newCautionval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.RULE__CAUTIONVAL, newCautionval, newCautionval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Grouping getGroupingVal()
  {
    return groupingVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupingVal(Grouping newGroupingVal, NotificationChain msgs)
  {
    Grouping oldGroupingVal = groupingVal;
    groupingVal = newGroupingVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WailPackage.RULE__GROUPING_VAL, oldGroupingVal, newGroupingVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGroupingVal(Grouping newGroupingVal)
  {
    if (newGroupingVal != groupingVal)
    {
      NotificationChain msgs = null;
      if (groupingVal != null)
        msgs = ((InternalEObject)groupingVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__GROUPING_VAL, null, msgs);
      if (newGroupingVal != null)
        msgs = ((InternalEObject)newGroupingVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WailPackage.RULE__GROUPING_VAL, null, msgs);
      msgs = basicSetGroupingVal(newGroupingVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.RULE__GROUPING_VAL, newGroupingVal, newGroupingVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Recruitment> getUnits()
  {
    if (units == null)
    {
      units = new EObjectContainmentEList<Recruitment>(Recruitment.class, this, WailPackage.RULE__UNITS);
    }
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WailPackage.RULE__FRAGMENTS:
        return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
      case WailPackage.RULE__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case WailPackage.RULE__AGGRESSIONVAL:
        return basicSetAggressionval(null, msgs);
      case WailPackage.RULE__CAUTIONVAL:
        return basicSetCautionval(null, msgs);
      case WailPackage.RULE__GROUPING_VAL:
        return basicSetGroupingVal(null, msgs);
      case WailPackage.RULE__UNITS:
        return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case WailPackage.RULE__NAME:
        return getName();
      case WailPackage.RULE__FRAGMENTS:
        return getFragments();
      case WailPackage.RULE__GOALS:
        return getGoals();
      case WailPackage.RULE__AGGRESSIONVAL:
        return getAggressionval();
      case WailPackage.RULE__CAUTIONVAL:
        return getCautionval();
      case WailPackage.RULE__GROUPING_VAL:
        return getGroupingVal();
      case WailPackage.RULE__UNITS:
        return getUnits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WailPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case WailPackage.RULE__FRAGMENTS:
        getFragments().clear();
        getFragments().addAll((Collection<? extends Fragment>)newValue);
        return;
      case WailPackage.RULE__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
        return;
      case WailPackage.RULE__AGGRESSIONVAL:
        setAggressionval((Aggression)newValue);
        return;
      case WailPackage.RULE__CAUTIONVAL:
        setCautionval((Caution)newValue);
        return;
      case WailPackage.RULE__GROUPING_VAL:
        setGroupingVal((Grouping)newValue);
        return;
      case WailPackage.RULE__UNITS:
        getUnits().clear();
        getUnits().addAll((Collection<? extends Recruitment>)newValue);
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
      case WailPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WailPackage.RULE__FRAGMENTS:
        getFragments().clear();
        return;
      case WailPackage.RULE__GOALS:
        getGoals().clear();
        return;
      case WailPackage.RULE__AGGRESSIONVAL:
        setAggressionval((Aggression)null);
        return;
      case WailPackage.RULE__CAUTIONVAL:
        setCautionval((Caution)null);
        return;
      case WailPackage.RULE__GROUPING_VAL:
        setGroupingVal((Grouping)null);
        return;
      case WailPackage.RULE__UNITS:
        getUnits().clear();
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
      case WailPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WailPackage.RULE__FRAGMENTS:
        return fragments != null && !fragments.isEmpty();
      case WailPackage.RULE__GOALS:
        return goals != null && !goals.isEmpty();
      case WailPackage.RULE__AGGRESSIONVAL:
        return aggressionval != null;
      case WailPackage.RULE__CAUTIONVAL:
        return cautionval != null;
      case WailPackage.RULE__GROUPING_VAL:
        return groupingVal != null;
      case WailPackage.RULE__UNITS:
        return units != null && !units.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
