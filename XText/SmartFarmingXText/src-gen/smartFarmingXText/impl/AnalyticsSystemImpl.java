/**
 */
package smartFarmingXText.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smartFarmingXText.AnalyticsSystem;
import smartFarmingXText.AnalyticsType;
import smartFarmingXText.OutputType;
import smartFarmingXText.SmartFarmingXTextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analytics System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.AnalyticsSystemImpl#getAnalyticsType <em>Analytics Type</em>}</li>
 *   <li>{@link smartFarmingXText.impl.AnalyticsSystemImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link smartFarmingXText.impl.AnalyticsSystemImpl#getOutputType <em>Output Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticsSystemImpl extends ServiceImpl implements AnalyticsSystem {
	/**
	 * The default value of the '{@link #getAnalyticsType() <em>Analytics Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyticsType()
	 * @generated
	 * @ordered
	 */
	protected static final AnalyticsType ANALYTICS_TYPE_EDEFAULT = AnalyticsType.HARVESTING;

	/**
	 * The cached value of the '{@link #getAnalyticsType() <em>Analytics Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyticsType()
	 * @generated
	 * @ordered
	 */
	protected AnalyticsType analyticsType = ANALYTICS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected String dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected static final OutputType OUTPUT_TYPE_EDEFAULT = OutputType.LINE_GRAPH;

	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected OutputType outputType = OUTPUT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyticsSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.ANALYTICS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsType getAnalyticsType() {
		return analyticsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyticsType(AnalyticsType newAnalyticsType) {
		AnalyticsType oldAnalyticsType = analyticsType;
		analyticsType = newAnalyticsType == null ? ANALYTICS_TYPE_EDEFAULT : newAnalyticsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmartFarmingXTextPackage.ANALYTICS_SYSTEM__ANALYTICS_TYPE, oldAnalyticsType, analyticsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(String newDataSource) {
		String oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmartFarmingXTextPackage.ANALYTICS_SYSTEM__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType getOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(OutputType newOutputType) {
		OutputType oldOutputType = outputType;
		outputType = newOutputType == null ? OUTPUT_TYPE_EDEFAULT : newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmartFarmingXTextPackage.ANALYTICS_SYSTEM__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__ANALYTICS_TYPE:
			return getAnalyticsType();
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__DATA_SOURCE:
			return getDataSource();
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__OUTPUT_TYPE:
			return getOutputType();
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
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__ANALYTICS_TYPE:
			setAnalyticsType((AnalyticsType) newValue);
			return;
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__DATA_SOURCE:
			setDataSource((String) newValue);
			return;
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__OUTPUT_TYPE:
			setOutputType((OutputType) newValue);
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
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__ANALYTICS_TYPE:
			setAnalyticsType(ANALYTICS_TYPE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__DATA_SOURCE:
			setDataSource(DATA_SOURCE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__OUTPUT_TYPE:
			setOutputType(OUTPUT_TYPE_EDEFAULT);
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
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__ANALYTICS_TYPE:
			return analyticsType != ANALYTICS_TYPE_EDEFAULT;
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__DATA_SOURCE:
			return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM__OUTPUT_TYPE:
			return outputType != OUTPUT_TYPE_EDEFAULT;
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
		result.append(" (AnalyticsType: ");
		result.append(analyticsType);
		result.append(", DataSource: ");
		result.append(dataSource);
		result.append(", OutputType: ");
		result.append(outputType);
		result.append(')');
		return result.toString();
	}

} //AnalyticsSystemImpl
