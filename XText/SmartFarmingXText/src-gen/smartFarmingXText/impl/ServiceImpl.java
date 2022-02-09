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

import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import smartFarmingXText.Farmer;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.Service;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.ServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ServiceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ServiceImpl#getURI <em>URI</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ServiceImpl#getIoTSystem <em>Io TSystem</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ServiceImpl#getPIC <em>PIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceImpl extends NamedImpl implements Service {
	/**
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected String serviceID = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceID() {
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(String newServiceID) {
		String oldServiceID = serviceID;
		serviceID = newServiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SERVICE__SERVICE_ID,
					oldServiceID, serviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SERVICE__HOST, oldHost,
					host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SERVICE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTSystem getIoTSystem() {
		if (eContainerFeatureID() != SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM)
			return null;
		return (IoTSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoTSystem(IoTSystem newIoTSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIoTSystem, SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoTSystem(IoTSystem newIoTSystem) {
		if (newIoTSystem != eInternalContainer()
				|| (eContainerFeatureID() != SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM && newIoTSystem != null)) {
			if (EcoreUtil.isAncestor(this, newIoTSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIoTSystem != null)
				msgs = ((InternalEObject) newIoTSystem).eInverseAdd(this, SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES,
						IoTSystem.class, msgs);
			msgs = basicSetIoTSystem(newIoTSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM,
					newIoTSystem, newIoTSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Farmer> getPIC() {
		/**
		 *
		 * Farmer.allInstances()
		 * ->select(f | f.Services->exists(service | service = self))
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_smartFarmingXText_c_c_Farmer_0 = idResolver
				.getClass(SmartFarmingXTextTables.CLSSid_Farmer, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				SmartFarmingXTextTables.SET_CLSSid_Farmer, TYP_smartFarmingXText_c_c_Farmer_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSetAccumulatorValue(SmartFarmingXTextTables.SET_CLSSid_Farmer);
		Iterator<Object> ITERATOR_f = allInstances.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR_f.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Farmer f = (Farmer) ITERATOR_f.next();
			/**
			 * f.Services->exists(service | service = self)
			 */
			final /*@NonInvalid*/ List<Service> Services = f.getServices();
			final /*@NonInvalid*/ OrderedSetValue BOXED_Services = idResolver
					.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Service, Services);
			/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_service = BOXED_Services.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_service.hasNext()) {
					if (accumulator_0 == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator_0;
					}
					break;
				}
				/*@NonInvalid*/ Service service = (Service) ITERATOR_service.next();
				/**
				 * service = self
				 */
				final /*@NonInvalid*/ boolean eq = service.equals(this);
				//
				if (eq) { // Normal successful body evaluation result
					exists = ValueUtil.TRUE_VALUE;
					break; // Stop immediately
				} else if (!eq) { // Normal unsuccessful body evaluation result
					; // Carry on
				} else { // Impossible badly typed result
					accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
				}
			}
			if (exists == null) {
				throw new InvalidValueException(
						"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
			}
			//
			if (exists == ValueUtil.TRUE_VALUE) {
				accumulator.add(f);
			}
		}
		final /*@Thrown*/ List<Farmer> ECORE_select = ((IdResolverExtension) idResolver).ecoreValueOfAll(Farmer.class,
				select);
		return (EList<Farmer>) ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ServiceUniqueID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::ServiceUniqueID";
		try {
			/**
			 *
			 * inv ServiceUniqueID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.IoTSystem.Services->select(x | x.ServiceID = self.ServiceID)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ IoTSystem IoTSystem = this.getIoTSystem();
				final /*@NonInvalid*/ List<Service> Services = IoTSystem.getServices();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Services = idResolver
						.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Service, Services);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(SmartFarmingXTextTables.ORD_CLSSid_Service);
				Iterator<Object> ITERATOR_x = BOXED_Services.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Service x = (Service) ITERATOR_x.next();
					/**
					 * x.ServiceID = self.ServiceID
					 */
					final /*@NonInvalid*/ String ServiceID = x.getServiceID();
					final /*@NonInvalid*/ String ServiceID_0 = this.getServiceID();
					final /*@NonInvalid*/ boolean eq = (ServiceID != null) ? ServiceID.equals(ServiceID_0)
							: (ServiceID_0 == null);
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
	public boolean ServiceMustHaveID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::ServiceMustHaveID";
		try {
			/**
			 *
			 * inv ServiceMustHaveID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not ServiceID.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ String ServiceID = this.getServiceID();
				final /*@NonInvalid*/ boolean oclIsUndefined = ServiceID == null;
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					if (oclIsUndefined) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = null;
					}
				}
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
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetIoTSystem((IoTSystem) otherEnd, msgs);
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
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
			return eInternalContainer().eInverseRemove(this, SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES,
					IoTSystem.class, msgs);
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
		case SmartFarmingXTextPackage.SERVICE__SERVICE_ID:
			return getServiceID();
		case SmartFarmingXTextPackage.SERVICE__HOST:
			return getHost();
		case SmartFarmingXTextPackage.SERVICE__URI:
			return getURI();
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
			return getIoTSystem();
		case SmartFarmingXTextPackage.SERVICE__PIC:
			return getPIC();
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
		case SmartFarmingXTextPackage.SERVICE__SERVICE_ID:
			setServiceID((String) newValue);
			return;
		case SmartFarmingXTextPackage.SERVICE__HOST:
			setHost((String) newValue);
			return;
		case SmartFarmingXTextPackage.SERVICE__URI:
			setURI((String) newValue);
			return;
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.SERVICE__SERVICE_ID:
			setServiceID(SERVICE_ID_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SERVICE__HOST:
			setHost(HOST_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SERVICE__URI:
			setURI(URI_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.SERVICE__SERVICE_ID:
			return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
		case SmartFarmingXTextPackage.SERVICE__HOST:
			return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		case SmartFarmingXTextPackage.SERVICE__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		case SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM:
			return getIoTSystem() != null;
		case SmartFarmingXTextPackage.SERVICE__PIC:
			return !getPIC().isEmpty();
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
		case SmartFarmingXTextPackage.SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP:
			return ServiceUniqueID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SmartFarmingXTextPackage.SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP:
			return ServiceMustHaveID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (ServiceID: ");
		result.append(serviceID);
		result.append(", Host: ");
		result.append(host);
		result.append(", URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
