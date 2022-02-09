/*
 * generated by Xtext 2.25.0
 */
package com.se4gd.smartfarming.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.se4gd.smartfarming.ide.contentassist.antlr.internal.InternalSmartFarmingParser;
import com.se4gd.smartfarming.services.SmartFarmingGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SmartFarmingParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SmartFarmingGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SmartFarmingGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getServiceAccess().getAlternatives(), "rule__Service__Alternatives");
			builder.put(grammarAccess.getDeviceAccess().getAlternatives(), "rule__Device__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
			builder.put(grammarAccess.getCropGroupAccess().getAlternatives(), "rule__CropGroup__Alternatives");
			builder.put(grammarAccess.getAnalyticsTypeAccess().getAlternatives(), "rule__AnalyticsType__Alternatives");
			builder.put(grammarAccess.getOutputTypeAccess().getAlternatives(), "rule__OutputType__Alternatives");
			builder.put(grammarAccess.getMonitoringMetricsAccess().getAlternatives(), "rule__MonitoringMetrics__Alternatives");
			builder.put(grammarAccess.getSensorTypeAccess().getAlternatives(), "rule__SensorType__Alternatives");
			builder.put(grammarAccess.getSensorStateAccess().getAlternatives(), "rule__SensorState__Alternatives");
			builder.put(grammarAccess.getCommunicationTypeAccess().getAlternatives(), "rule__CommunicationType__Alternatives");
			builder.put(grammarAccess.getControlTypeAccess().getAlternatives(), "rule__ControlType__Alternatives");
			builder.put(grammarAccess.getControllerActionAccess().getAlternatives(), "rule__ControllerAction__Alternatives");
			builder.put(grammarAccess.getActuatorTypeAccess().getAlternatives(), "rule__ActuatorType__Alternatives");
			builder.put(grammarAccess.getFarmAccess().getGroup(), "rule__Farm__Group__0");
			builder.put(grammarAccess.getFarmAccess().getGroup_3(), "rule__Farm__Group_3__0");
			builder.put(grammarAccess.getFarmAccess().getGroup_10(), "rule__Farm__Group_10__0");
			builder.put(grammarAccess.getFarmAccess().getGroup_15(), "rule__Farm__Group_15__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
			builder.put(grammarAccess.getCropAccess().getGroup(), "rule__Crop__Group__0");
			builder.put(grammarAccess.getCropAccess().getGroup_3(), "rule__Crop__Group_3__0");
			builder.put(grammarAccess.getCropAccess().getGroup_7(), "rule__Crop__Group_7__0");
			builder.put(grammarAccess.getFarmerAccess().getGroup(), "rule__Farmer__Group__0");
			builder.put(grammarAccess.getFarmerAccess().getGroup_3(), "rule__Farmer__Group_3__0");
			builder.put(grammarAccess.getFarmerAccess().getGroup_4(), "rule__Farmer__Group_4__0");
			builder.put(grammarAccess.getFarmerAccess().getGroup_5(), "rule__Farmer__Group_5__0");
			builder.put(grammarAccess.getFarmerAccess().getGroup_9(), "rule__Farmer__Group_9__0");
			builder.put(grammarAccess.getIoTSystemAccess().getGroup(), "rule__IoTSystem__Group__0");
			builder.put(grammarAccess.getIoTSystemAccess().getGroup_3(), "rule__IoTSystem__Group_3__0");
			builder.put(grammarAccess.getIoTSystemAccess().getGroup_7(), "rule__IoTSystem__Group_7__0");
			builder.put(grammarAccess.getIoTSystemAccess().getGroup_12(), "rule__IoTSystem__Group_12__0");
			builder.put(grammarAccess.getIoTSystemAccess().getGroup_17(), "rule__IoTSystem__Group_17__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup(), "rule__AnalyticsSystem__Group__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_4(), "rule__AnalyticsSystem__Group_4__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_5(), "rule__AnalyticsSystem__Group_5__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_6(), "rule__AnalyticsSystem__Group_6__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_7(), "rule__AnalyticsSystem__Group_7__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_8(), "rule__AnalyticsSystem__Group_8__0");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getGroup_9(), "rule__AnalyticsSystem__Group_9__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup(), "rule__Monitoring__Group__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_3(), "rule__Monitoring__Group_3__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_4(), "rule__Monitoring__Group_4__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_5(), "rule__Monitoring__Group_5__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_6(), "rule__Monitoring__Group_6__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_10(), "rule__Monitoring__Group_10__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_12(), "rule__Monitoring__Group_12__0");
			builder.put(grammarAccess.getControllingAccess().getGroup(), "rule__Controlling__Group__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_3(), "rule__Controlling__Group_3__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_4(), "rule__Controlling__Group_4__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_5(), "rule__Controlling__Group_5__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_6(), "rule__Controlling__Group_6__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_7(), "rule__Controlling__Group_7__0");
			builder.put(grammarAccess.getControllingAccess().getGroup_11(), "rule__Controlling__Group_11__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_3(), "rule__Sensor__Group_3__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_4(), "rule__Sensor__Group_4__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_5(), "rule__Sensor__Group_5__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_6(), "rule__Sensor__Group_6__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_7(), "rule__Sensor__Group_7__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_8(), "rule__Sensor__Group_8__0");
			builder.put(grammarAccess.getCommunicationProtocolAccess().getGroup(), "rule__CommunicationProtocol__Group__0");
			builder.put(grammarAccess.getCommunicationProtocolAccess().getGroup_4(), "rule__CommunicationProtocol__Group_4__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_3(), "rule__Actuator__Group_3__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_4(), "rule__Actuator__Group_4__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_5(), "rule__Actuator__Group_5__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_6(), "rule__Actuator__Group_6__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup(), "rule__Gateway__Group__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_3(), "rule__Gateway__Group_3__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_4(), "rule__Gateway__Group_4__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_8(), "rule__Gateway__Group_8__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_13(), "rule__Gateway__Group_13__0");
			builder.put(grammarAccess.getFarmAccess().getNameAssignment_1(), "rule__Farm__NameAssignment_1");
			builder.put(grammarAccess.getFarmAccess().getLocationAssignment_3_1(), "rule__Farm__LocationAssignment_3_1");
			builder.put(grammarAccess.getFarmAccess().getSizeAssignment_5(), "rule__Farm__SizeAssignment_5");
			builder.put(grammarAccess.getFarmAccess().getCropsAssignment_9(), "rule__Farm__CropsAssignment_9");
			builder.put(grammarAccess.getFarmAccess().getCropsAssignment_10_1(), "rule__Farm__CropsAssignment_10_1");
			builder.put(grammarAccess.getFarmAccess().getFarmersAssignment_14(), "rule__Farm__FarmersAssignment_14");
			builder.put(grammarAccess.getFarmAccess().getFarmersAssignment_15_1(), "rule__Farm__FarmersAssignment_15_1");
			builder.put(grammarAccess.getFarmAccess().getIoTSystemAssignment_19(), "rule__Farm__IoTSystemAssignment_19");
			builder.put(grammarAccess.getCropAccess().getNameAssignment_1(), "rule__Crop__NameAssignment_1");
			builder.put(grammarAccess.getCropAccess().getCropGroupAssignment_3_1(), "rule__Crop__CropGroupAssignment_3_1");
			builder.put(grammarAccess.getCropAccess().getGrowthDurationAssignment_5(), "rule__Crop__GrowthDurationAssignment_5");
			builder.put(grammarAccess.getCropAccess().getSeedCodeAssignment_7_1(), "rule__Crop__SeedCodeAssignment_7_1");
			builder.put(grammarAccess.getFarmerAccess().getNameAssignment_1(), "rule__Farmer__NameAssignment_1");
			builder.put(grammarAccess.getFarmerAccess().getFarmerIDAssignment_3_1(), "rule__Farmer__FarmerIDAssignment_3_1");
			builder.put(grammarAccess.getFarmerAccess().getEmailAssignment_4_1(), "rule__Farmer__EmailAssignment_4_1");
			builder.put(grammarAccess.getFarmerAccess().getPhoneNumberAssignment_5_1(), "rule__Farmer__PhoneNumberAssignment_5_1");
			builder.put(grammarAccess.getFarmerAccess().getServicesAssignment_8(), "rule__Farmer__ServicesAssignment_8");
			builder.put(grammarAccess.getFarmerAccess().getServicesAssignment_9_1(), "rule__Farmer__ServicesAssignment_9_1");
			builder.put(grammarAccess.getIoTSystemAccess().getNameAssignment_1(), "rule__IoTSystem__NameAssignment_1");
			builder.put(grammarAccess.getIoTSystemAccess().getVersionAssignment_3_1(), "rule__IoTSystem__VersionAssignment_3_1");
			builder.put(grammarAccess.getIoTSystemAccess().getServicesAssignment_6(), "rule__IoTSystem__ServicesAssignment_6");
			builder.put(grammarAccess.getIoTSystemAccess().getServicesAssignment_7_1(), "rule__IoTSystem__ServicesAssignment_7_1");
			builder.put(grammarAccess.getIoTSystemAccess().getDevicesAssignment_11(), "rule__IoTSystem__DevicesAssignment_11");
			builder.put(grammarAccess.getIoTSystemAccess().getDevicesAssignment_12_1(), "rule__IoTSystem__DevicesAssignment_12_1");
			builder.put(grammarAccess.getIoTSystemAccess().getGatewaysAssignment_16(), "rule__IoTSystem__GatewaysAssignment_16");
			builder.put(grammarAccess.getIoTSystemAccess().getGatewaysAssignment_17_1(), "rule__IoTSystem__GatewaysAssignment_17_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getNameAssignment_2(), "rule__AnalyticsSystem__NameAssignment_2");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getServiceIDAssignment_4_1(), "rule__AnalyticsSystem__ServiceIDAssignment_4_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getHostAssignment_5_1(), "rule__AnalyticsSystem__HostAssignment_5_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getURIAssignment_6_1(), "rule__AnalyticsSystem__URIAssignment_6_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getAnalyticsTypeAssignment_7_1(), "rule__AnalyticsSystem__AnalyticsTypeAssignment_7_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getDataSourceAssignment_8_1(), "rule__AnalyticsSystem__DataSourceAssignment_8_1");
			builder.put(grammarAccess.getAnalyticsSystemAccess().getOutputTypeAssignment_9_1(), "rule__AnalyticsSystem__OutputTypeAssignment_9_1");
			builder.put(grammarAccess.getMonitoringAccess().getNameAssignment_1(), "rule__Monitoring__NameAssignment_1");
			builder.put(grammarAccess.getMonitoringAccess().getServiceIDAssignment_3_1(), "rule__Monitoring__ServiceIDAssignment_3_1");
			builder.put(grammarAccess.getMonitoringAccess().getHostAssignment_4_1(), "rule__Monitoring__HostAssignment_4_1");
			builder.put(grammarAccess.getMonitoringAccess().getURIAssignment_5_1(), "rule__Monitoring__URIAssignment_5_1");
			builder.put(grammarAccess.getMonitoringAccess().getMetricsAssignment_6_1(), "rule__Monitoring__MetricsAssignment_6_1");
			builder.put(grammarAccess.getMonitoringAccess().getSensorsAssignment_9(), "rule__Monitoring__SensorsAssignment_9");
			builder.put(grammarAccess.getMonitoringAccess().getSensorsAssignment_10_1(), "rule__Monitoring__SensorsAssignment_10_1");
			builder.put(grammarAccess.getMonitoringAccess().getControlAssignment_12_1(), "rule__Monitoring__ControlAssignment_12_1");
			builder.put(grammarAccess.getControllingAccess().getNameAssignment_1(), "rule__Controlling__NameAssignment_1");
			builder.put(grammarAccess.getControllingAccess().getServiceIDAssignment_3_1(), "rule__Controlling__ServiceIDAssignment_3_1");
			builder.put(grammarAccess.getControllingAccess().getHostAssignment_4_1(), "rule__Controlling__HostAssignment_4_1");
			builder.put(grammarAccess.getControllingAccess().getURIAssignment_5_1(), "rule__Controlling__URIAssignment_5_1");
			builder.put(grammarAccess.getControllingAccess().getControlTypeAssignment_6_1(), "rule__Controlling__ControlTypeAssignment_6_1");
			builder.put(grammarAccess.getControllingAccess().getActionAssignment_7_1(), "rule__Controlling__ActionAssignment_7_1");
			builder.put(grammarAccess.getControllingAccess().getActuatorsAssignment_10(), "rule__Controlling__ActuatorsAssignment_10");
			builder.put(grammarAccess.getControllingAccess().getActuatorsAssignment_11_1(), "rule__Controlling__ActuatorsAssignment_11_1");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getDeviceIDAssignment_3_1(), "rule__Sensor__DeviceIDAssignment_3_1");
			builder.put(grammarAccess.getSensorAccess().getIPAddressAssignment_4_1(), "rule__Sensor__IPAddressAssignment_4_1");
			builder.put(grammarAccess.getSensorAccess().getManufacturerAssignment_5_1(), "rule__Sensor__ManufacturerAssignment_5_1");
			builder.put(grammarAccess.getSensorAccess().getTypeAssignment_6_1(), "rule__Sensor__TypeAssignment_6_1");
			builder.put(grammarAccess.getSensorAccess().getStateAssignment_7_1(), "rule__Sensor__StateAssignment_7_1");
			builder.put(grammarAccess.getSensorAccess().getUnitAssignment_8_1(), "rule__Sensor__UnitAssignment_8_1");
			builder.put(grammarAccess.getSensorAccess().getValueAssignment_10(), "rule__Sensor__ValueAssignment_10");
			builder.put(grammarAccess.getSensorAccess().getProtocolAssignment_12(), "rule__Sensor__ProtocolAssignment_12");
			builder.put(grammarAccess.getCommunicationProtocolAccess().getNameAssignment_2(), "rule__CommunicationProtocol__NameAssignment_2");
			builder.put(grammarAccess.getCommunicationProtocolAccess().getTypeAssignment_4_1(), "rule__CommunicationProtocol__TypeAssignment_4_1");
			builder.put(grammarAccess.getActuatorAccess().getNameAssignment_1(), "rule__Actuator__NameAssignment_1");
			builder.put(grammarAccess.getActuatorAccess().getDeviceIDAssignment_3_1(), "rule__Actuator__DeviceIDAssignment_3_1");
			builder.put(grammarAccess.getActuatorAccess().getIPAddressAssignment_4_1(), "rule__Actuator__IPAddressAssignment_4_1");
			builder.put(grammarAccess.getActuatorAccess().getManufacturerAssignment_5_1(), "rule__Actuator__ManufacturerAssignment_5_1");
			builder.put(grammarAccess.getActuatorAccess().getTypeAssignment_6_1(), "rule__Actuator__TypeAssignment_6_1");
			builder.put(grammarAccess.getActuatorAccess().getProtocolAssignment_8(), "rule__Actuator__ProtocolAssignment_8");
			builder.put(grammarAccess.getGatewayAccess().getNameAssignment_1(), "rule__Gateway__NameAssignment_1");
			builder.put(grammarAccess.getGatewayAccess().getGatewayIDAssignment_3_1(), "rule__Gateway__GatewayIDAssignment_3_1");
			builder.put(grammarAccess.getGatewayAccess().getModelAssignment_4_1(), "rule__Gateway__ModelAssignment_4_1");
			builder.put(grammarAccess.getGatewayAccess().getDevicesAssignment_7(), "rule__Gateway__DevicesAssignment_7");
			builder.put(grammarAccess.getGatewayAccess().getDevicesAssignment_8_1(), "rule__Gateway__DevicesAssignment_8_1");
			builder.put(grammarAccess.getGatewayAccess().getProtocolsAssignment_12(), "rule__Gateway__ProtocolsAssignment_12");
			builder.put(grammarAccess.getGatewayAccess().getProtocolsAssignment_13_1(), "rule__Gateway__ProtocolsAssignment_13_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SmartFarmingGrammarAccess grammarAccess;

	@Override
	protected InternalSmartFarmingParser createParser() {
		InternalSmartFarmingParser result = new InternalSmartFarmingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmartFarmingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartFarmingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}