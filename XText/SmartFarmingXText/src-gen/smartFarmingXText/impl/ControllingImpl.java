/**
 */
package smartFarmingXText.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartFarmingXText.Actuator;
import smartFarmingXText.ControlType;
import smartFarmingXText.ControllerAction;
import smartFarmingXText.Controlling;
import smartFarmingXText.SmartFarmingXTextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.ControllingImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ControllingImpl#getAction <em>Action</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ControllingImpl#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllingImpl extends ServiceImpl implements Controlling {
	/**
	 * The default value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
	protected static final ControlType CONTROL_TYPE_EDEFAULT = ControlType.AIR_CONDITIONER;

	/**
	 * The cached value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
	protected ControlType controlType = CONTROL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ControllerAction ACTION_EDEFAULT = ControllerAction.INCREASE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ControllerAction action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.CONTROLLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType getControlType() {
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlType(ControlType newControlType) {
		ControlType oldControlType = controlType;
		controlType = newControlType == null ? CONTROL_TYPE_EDEFAULT : newControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CONTROLLING__CONTROL_TYPE,
					oldControlType, controlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ControllerAction newAction) {
		ControllerAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CONTROLLING__ACTION,
					oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectResolvingEList<Actuator>(Actuator.class, this,
					SmartFarmingXTextPackage.CONTROLLING__ACTUATORS);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CONTROLLING__CONTROL_TYPE:
			return getControlType();
		case SmartFarmingXTextPackage.CONTROLLING__ACTION:
			return getAction();
		case SmartFarmingXTextPackage.CONTROLLING__ACTUATORS:
			return getActuators();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CONTROLLING__CONTROL_TYPE:
			setControlType((ControlType) newValue);
			return;
		case SmartFarmingXTextPackage.CONTROLLING__ACTION:
			setAction((ControllerAction) newValue);
			return;
		case SmartFarmingXTextPackage.CONTROLLING__ACTUATORS:
			getActuators().clear();
			getActuators().addAll((Collection<? extends Actuator>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CONTROLLING__CONTROL_TYPE:
			setControlType(CONTROL_TYPE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.CONTROLLING__ACTION:
			setAction(ACTION_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.CONTROLLING__ACTUATORS:
			getActuators().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CONTROLLING__CONTROL_TYPE:
			return controlType != CONTROL_TYPE_EDEFAULT;
		case SmartFarmingXTextPackage.CONTROLLING__ACTION:
			return action != ACTION_EDEFAULT;
		case SmartFarmingXTextPackage.CONTROLLING__ACTUATORS:
			return actuators != null && !actuators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ControlType: ");
		result.append(controlType);
		result.append(", Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ControllingImpl
