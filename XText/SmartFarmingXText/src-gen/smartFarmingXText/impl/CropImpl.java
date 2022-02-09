/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import smartFarmingXText.Crop;
import smartFarmingXText.CropGroup;
import smartFarmingXText.Farm;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.CropImpl#getCropGroup <em>Crop Group</em>}</li>
 *   <li>{@link smartFarmingXText.impl.CropImpl#getGrowthDuration <em>Growth Duration</em>}</li>
 *   <li>{@link smartFarmingXText.impl.CropImpl#getSeedCode <em>Seed Code</em>}</li>
 *   <li>{@link smartFarmingXText.impl.CropImpl#getFarm <em>Farm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CropImpl extends NamedImpl implements Crop {
	/**
	 * The default value of the '{@link #getCropGroup() <em>Crop Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCropGroup()
	 * @generated
	 * @ordered
	 */
	protected static final CropGroup CROP_GROUP_EDEFAULT = CropGroup.VEGETABLE;

	/**
	 * The cached value of the '{@link #getCropGroup() <em>Crop Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCropGroup()
	 * @generated
	 * @ordered
	 */
	protected CropGroup cropGroup = CROP_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrowthDuration() <em>Growth Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowthDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int GROWTH_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrowthDuration() <em>Growth Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowthDuration()
	 * @generated
	 * @ordered
	 */
	protected int growthDuration = GROWTH_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeedCode() <em>Seed Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeedCode() <em>Seed Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedCode()
	 * @generated
	 * @ordered
	 */
	protected String seedCode = SEED_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.CROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CropGroup getCropGroup() {
		return cropGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCropGroup(CropGroup newCropGroup) {
		CropGroup oldCropGroup = cropGroup;
		cropGroup = newCropGroup == null ? CROP_GROUP_EDEFAULT : newCropGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CROP__CROP_GROUP,
					oldCropGroup, cropGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrowthDuration() {
		return growthDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowthDuration(int newGrowthDuration) {
		int oldGrowthDuration = growthDuration;
		growthDuration = newGrowthDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CROP__GROWTH_DURATION,
					oldGrowthDuration, growthDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeedCode() {
		return seedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeedCode(String newSeedCode) {
		String oldSeedCode = seedCode;
		seedCode = newSeedCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CROP__SEED_CODE, oldSeedCode,
					seedCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm getFarm() {
		if (eContainerFeatureID() != SmartFarmingXTextPackage.CROP__FARM)
			return null;
		return (Farm) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFarm(Farm newFarm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFarm, SmartFarmingXTextPackage.CROP__FARM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarm(Farm newFarm) {
		if (newFarm != eInternalContainer()
				|| (eContainerFeatureID() != SmartFarmingXTextPackage.CROP__FARM && newFarm != null)) {
			if (EcoreUtil.isAncestor(this, newFarm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFarm != null)
				msgs = ((InternalEObject) newFarm).eInverseAdd(this, SmartFarmingXTextPackage.FARM__CROPS, Farm.class,
						msgs);
			msgs = basicSetFarm(newFarm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.CROP__FARM, newFarm,
					newFarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CropUniqueID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Crop::CropUniqueID";
		try {
			/**
			 *
			 * inv CropUniqueID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.Farm.Crops->select(x | x.SeedCode = self.SeedCode)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.CROP___CROP_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ Farm Farm = this.getFarm();
				final /*@NonInvalid*/ List<Crop> Crops = Farm.getCrops();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Crops = idResolver
						.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Crop, Crops);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(SmartFarmingXTextTables.ORD_CLSSid_Crop);
				Iterator<Object> ITERATOR_x = BOXED_Crops.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Crop x = (Crop) ITERATOR_x.next();
					/**
					 * x.SeedCode = self.SeedCode
					 */
					final /*@NonInvalid*/ String SeedCode = x.getSeedCode();
					final /*@NonInvalid*/ String SeedCode_0 = this.getSeedCode();
					final /*@NonInvalid*/ boolean eq = (SeedCode != null) ? SeedCode.equals(SeedCode_0)
							: (SeedCode_0 == null);
					//
					if (eq) {
						accumulator.add(x);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(SmartFarmingXTextTables.INT_1);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CROP__FARM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFarm((Farm) otherEnd, msgs);
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
		case SmartFarmingXTextPackage.CROP__FARM:
			return basicSetFarm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SmartFarmingXTextPackage.CROP__FARM:
			return eInternalContainer().eInverseRemove(this, SmartFarmingXTextPackage.FARM__CROPS, Farm.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CROP__CROP_GROUP:
			return getCropGroup();
		case SmartFarmingXTextPackage.CROP__GROWTH_DURATION:
			return getGrowthDuration();
		case SmartFarmingXTextPackage.CROP__SEED_CODE:
			return getSeedCode();
		case SmartFarmingXTextPackage.CROP__FARM:
			return getFarm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartFarmingXTextPackage.CROP__CROP_GROUP:
			setCropGroup((CropGroup) newValue);
			return;
		case SmartFarmingXTextPackage.CROP__GROWTH_DURATION:
			setGrowthDuration((Integer) newValue);
			return;
		case SmartFarmingXTextPackage.CROP__SEED_CODE:
			setSeedCode((String) newValue);
			return;
		case SmartFarmingXTextPackage.CROP__FARM:
			setFarm((Farm) newValue);
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
		case SmartFarmingXTextPackage.CROP__CROP_GROUP:
			setCropGroup(CROP_GROUP_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.CROP__GROWTH_DURATION:
			setGrowthDuration(GROWTH_DURATION_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.CROP__SEED_CODE:
			setSeedCode(SEED_CODE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.CROP__FARM:
			setFarm((Farm) null);
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
		case SmartFarmingXTextPackage.CROP__CROP_GROUP:
			return cropGroup != CROP_GROUP_EDEFAULT;
		case SmartFarmingXTextPackage.CROP__GROWTH_DURATION:
			return growthDuration != GROWTH_DURATION_EDEFAULT;
		case SmartFarmingXTextPackage.CROP__SEED_CODE:
			return SEED_CODE_EDEFAULT == null ? seedCode != null : !SEED_CODE_EDEFAULT.equals(seedCode);
		case SmartFarmingXTextPackage.CROP__FARM:
			return getFarm() != null;
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
		case SmartFarmingXTextPackage.CROP___CROP_UNIQUE_ID__DIAGNOSTICCHAIN_MAP:
			return CropUniqueID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (CropGroup: ");
		result.append(cropGroup);
		result.append(", GrowthDuration: ");
		result.append(growthDuration);
		result.append(", SeedCode: ");
		result.append(seedCode);
		result.append(')');
		return result.toString();
	}

} //CropImpl
