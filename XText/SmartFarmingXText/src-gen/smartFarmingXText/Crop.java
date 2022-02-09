/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Crop#getCropGroup <em>Crop Group</em>}</li>
 *   <li>{@link smartFarmingXText.Crop#getGrowthDuration <em>Growth Duration</em>}</li>
 *   <li>{@link smartFarmingXText.Crop#getSeedCode <em>Seed Code</em>}</li>
 *   <li>{@link smartFarmingXText.Crop#getFarm <em>Farm</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getCrop()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CropUniqueID'"
 * @generated
 */
public interface Crop extends Named {
	/**
	 * Returns the value of the '<em><b>Crop Group</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.CropGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crop Group</em>' attribute.
	 * @see smartFarmingXText.CropGroup
	 * @see #setCropGroup(CropGroup)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCrop_CropGroup()
	 * @model
	 * @generated
	 */
	CropGroup getCropGroup();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Crop#getCropGroup <em>Crop Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crop Group</em>' attribute.
	 * @see smartFarmingXText.CropGroup
	 * @see #getCropGroup()
	 * @generated
	 */
	void setCropGroup(CropGroup value);

	/**
	 * Returns the value of the '<em><b>Growth Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Growth Duration</em>' attribute.
	 * @see #setGrowthDuration(int)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCrop_GrowthDuration()
	 * @model required="true"
	 * @generated
	 */
	int getGrowthDuration();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Crop#getGrowthDuration <em>Growth Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Growth Duration</em>' attribute.
	 * @see #getGrowthDuration()
	 * @generated
	 */
	void setGrowthDuration(int value);

	/**
	 * Returns the value of the '<em><b>Seed Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Code</em>' attribute.
	 * @see #setSeedCode(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCrop_SeedCode()
	 * @model
	 * @generated
	 */
	String getSeedCode();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Crop#getSeedCode <em>Seed Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Code</em>' attribute.
	 * @see #getSeedCode()
	 * @generated
	 */
	void setSeedCode(String value);

	/**
	 * Returns the value of the '<em><b>Farm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Farm#getCrops <em>Crops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm</em>' container reference.
	 * @see #setFarm(Farm)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCrop_Farm()
	 * @see smartFarmingXText.Farm#getCrops
	 * @model opposite="Crops" required="true" transient="false"
	 * @generated
	 */
	Farm getFarm();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Crop#getFarm <em>Farm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farm</em>' container reference.
	 * @see #getFarm()
	 * @generated
	 */
	void setFarm(Farm value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Farm.Crops-&gt;select(x | x.SeedCode = self.SeedCode)-&gt;size() = 1'"
	 * @generated
	 */
	boolean CropUniqueID(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Crop
