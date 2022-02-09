/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

import smartFarmingXText.Crop;
import smartFarmingXText.Farm;
import smartFarmingXText.Farmer;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Farm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.FarmImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link smartFarmingXText.impl.FarmImpl#getSize <em>Size</em>}</li>
 *   <li>{@link smartFarmingXText.impl.FarmImpl#getCrops <em>Crops</em>}</li>
 *   <li>{@link smartFarmingXText.impl.FarmImpl#getFarmers <em>Farmers</em>}</li>
 *   <li>{@link smartFarmingXText.impl.FarmImpl#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FarmImpl extends NamedImpl implements Farm {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected float size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrops() <em>Crops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrops()
	 * @generated
	 * @ordered
	 */
	protected EList<Crop> crops;

	/**
	 * The cached value of the '{@link #getFarmers() <em>Farmers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarmers()
	 * @generated
	 * @ordered
	 */
	protected EList<Farmer> farmers;

	/**
	 * The cached value of the '{@link #getIoTSystem() <em>Io TSystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoTSystem()
	 * @generated
	 * @ordered
	 */
	protected IoTSystem ioTSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.FARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.FARM__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.FARM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crop> getCrops() {
		if (crops == null) {
			crops = new EObjectContainmentWithInverseEList<Crop>(Crop.class, this, SmartFarmingXTextPackage.FARM__CROPS,
					SmartFarmingXTextPackage.CROP__FARM);
		}
		return crops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Farmer> getFarmers() {
		if (farmers == null) {
			farmers = new EObjectContainmentWithInverseEList<Farmer>(Farmer.class, this,
					SmartFarmingXTextPackage.FARM__FARMERS, SmartFarmingXTextPackage.FARMER__FARM);
		}
		return farmers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTSystem getIoTSystem() {
		return ioTSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoTSystem(IoTSystem newIoTSystem, NotificationChain msgs) {
		IoTSystem oldIoTSystem = ioTSystem;
		ioTSystem = newIoTSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmartFarmingXTextPackage.FARM__IO_TSYSTEM, oldIoTSystem, newIoTSystem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoTSystem(IoTSystem newIoTSystem) {
		if (newIoTSystem != ioTSystem) {
			NotificationChain msgs = null;
			if (ioTSystem != null)
				msgs = ((InternalEObject) ioTSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmartFarmingXTextPackage.FARM__IO_TSYSTEM, null, msgs);
			if (newIoTSystem != null)
				msgs = ((InternalEObject) newIoTSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmartFarmingXTextPackage.FARM__IO_TSYSTEM, null, msgs);
			msgs = basicSetIoTSystem(newIoTSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.FARM__IO_TSYSTEM,
					newIoTSystem, newIoTSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ValidSize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Farm::ValidSize";
		try {
			/**
			 *
			 * inv ValidSize:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Size > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.FARM___VALID_SIZE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ float Size = this.getSize();
				final /*@NonInvalid*/ RealValue BOXED_Size = ValueUtil.realValueOf(Size);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_Size, SmartFarmingXTextTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SmartFarmingXTextTables.INT_0)
						.booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.FARM__CROPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCrops()).basicAdd(otherEnd, msgs);
		case SmartFarmingXTextPackage.FARM__FARMERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFarmers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.FARM__CROPS:
			return ((InternalEList<?>) getCrops()).basicRemove(otherEnd, msgs);
		case SmartFarmingXTextPackage.FARM__FARMERS:
			return ((InternalEList<?>) getFarmers()).basicRemove(otherEnd, msgs);
		case SmartFarmingXTextPackage.FARM__IO_TSYSTEM:
			return basicSetIoTSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.FARM__LOCATION:
			return getLocation();
		case SmartFarmingXTextPackage.FARM__SIZE:
			return getSize();
		case SmartFarmingXTextPackage.FARM__CROPS:
			return getCrops();
		case SmartFarmingXTextPackage.FARM__FARMERS:
			return getFarmers();
		case SmartFarmingXTextPackage.FARM__IO_TSYSTEM:
			return getIoTSystem();
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
		case SmartFarmingXTextPackage.FARM__LOCATION:
			setLocation((String) newValue);
			return;
		case SmartFarmingXTextPackage.FARM__SIZE:
			setSize((Float) newValue);
			return;
		case SmartFarmingXTextPackage.FARM__CROPS:
			getCrops().clear();
			getCrops().addAll((Collection<? extends Crop>) newValue);
			return;
		case SmartFarmingXTextPackage.FARM__FARMERS:
			getFarmers().clear();
			getFarmers().addAll((Collection<? extends Farmer>) newValue);
			return;
		case SmartFarmingXTextPackage.FARM__IO_TSYSTEM:
			setIoTSystem((IoTSystem) newValue);
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
		case SmartFarmingXTextPackage.FARM__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.FARM__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.FARM__CROPS:
			getCrops().clear();
			return;
		case SmartFarmingXTextPackage.FARM__FARMERS:
			getFarmers().clear();
			return;
		case SmartFarmingXTextPackage.FARM__IO_TSYSTEM:
			setIoTSystem((IoTSystem) null);
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
		case SmartFarmingXTextPackage.FARM__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case SmartFarmingXTextPackage.FARM__SIZE:
			return size != SIZE_EDEFAULT;
		case SmartFarmingXTextPackage.FARM__CROPS:
			return crops != null && !crops.isEmpty();
		case SmartFarmingXTextPackage.FARM__FARMERS:
			return farmers != null && !farmers.isEmpty();
		case SmartFarmingXTextPackage.FARM__IO_TSYSTEM:
			return ioTSystem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SmartFarmingXTextPackage.FARM___VALID_SIZE__DIAGNOSTICCHAIN_MAP:
			return ValidSize((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Location: ");
		result.append(location);
		result.append(", Size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //FarmImpl
