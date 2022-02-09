/**
 */
package smartFarmingXText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Controlling#getControlType <em>Control Type</em>}</li>
 *   <li>{@link smartFarmingXText.Controlling#getAction <em>Action</em>}</li>
 *   <li>{@link smartFarmingXText.Controlling#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getControlling()
 * @model
 * @generated
 */
public interface Controlling extends Service {
	/**
	 * Returns the value of the '<em><b>Control Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.ControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Type</em>' attribute.
	 * @see smartFarmingXText.ControlType
	 * @see #setControlType(ControlType)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getControlling_ControlType()
	 * @model
	 * @generated
	 */
	ControlType getControlType();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Controlling#getControlType <em>Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Type</em>' attribute.
	 * @see smartFarmingXText.ControlType
	 * @see #getControlType()
	 * @generated
	 */
	void setControlType(ControlType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.ControllerAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see smartFarmingXText.ControllerAction
	 * @see #setAction(ControllerAction)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getControlling_Action()
	 * @model
	 * @generated
	 */
	ControllerAction getAction();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Controlling#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see smartFarmingXText.ControllerAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ControllerAction value);

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' reference list.
	 * The list contents are of type {@link smartFarmingXText.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getControlling_Actuators()
	 * @model required="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // Controlling
