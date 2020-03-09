/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.wesnothDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getCondition <em>Condition</em>}</li>
 *   <li>{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getDefualt_cas <em>Defualt cas</em>}</li>
 * </ul>
 *
 * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Conditional)
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage#getFragment_Condition()
   * @model containment="true"
   * @generated
   */
  Conditional getCondition();

  /**
   * Sets the value of the '{@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Conditional value);

  /**
   * Returns the value of the '<em><b>Defualt cas</b></em>' containment reference list.
   * The list contents are of type {@link fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defualt cas</em>' containment reference list.
   * @see fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage#getFragment_Defualt_cas()
   * @model containment="true"
   * @generated
   */
  EList<Defualt_CA> getDefualt_cas();

} // Fragment
