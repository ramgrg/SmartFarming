# IoT Systems in Smart Farming
This is a repository for Model Driven Engineering(MDE) Project that models IoT system in Smart farming technology, particularly Closed Environment Farming(CEF).

The repository Contains four projects within:

  * MPS Platform - for defining the metamodels within IoT for Smart Farming.
  * EMF Platform -  for defining the metamodels within IoT for Smart Farming.
  * Epsilon (ETL and EGL) - for model transformation
  * xText and Sirius - for development of textual and graphical editors.

## Table Of Content
  ### 1. Describing Domain Specific Concepts
    * MetaClasses
    * Relationships
  ### 2. MPS
    * Metamodels
    * Custom Datatypes
    * Concrete Syntax
    * Constraints
  ### 3. EMF
    * Metamodel in EMF
    * Dynamic Instances
    * Constraints, Operations and Drived fields in OCL
  ### 4. Model Transformation in Epsilon(ETL and EGL)
    * Refactoring and Refining of Metamodels
    * Model to Model Transformation
    * Model to Text Transformation
  ### 5. xText and Sirius
    * Concrete Syntax using xText
    * Graphical Editor using Sirius

## 1. Describing Domain Specific Concepts
Smart Farming can mean different things, Since we are focusing on IoT systems for Smart farming, we considered an application that maximizes the use of IoT devices, i.e. Controlled Environment Farming(CEF). Controlled Environment Farming(CEF) is a type of smart farming, Which is indoor and all the agricultural metrics are monitored and controlled to give the maximum harvest. 

### MetaClassess
We have identified 13 main metamodel concepts to describe of specfic domain. 

![image](https://user-images.githubusercontent.com/56352752/149790437-baa812d1-f0be-4adf-bac9-d06704225dbc.png)

### Relationships
As you can see from the above diagram,all metamodels have different types of relationships among them.

![image](https://user-images.githubusercontent.com/56352752/149663976-e324733e-de9a-4526-8aa1-6eff20638f87.png)

## 2. MPS

### Metamodels (14 Metaclass)
We have defined 13 metaclass concepts in MPS based on Domain Specific Concepts above. 
- Farm (Root)
- Farmer
- Crop
- IoTSystem
- Service (Abstract)
- AnalyticsSystem
- ControlSystem
- MonitoringSystem
- Gateway
- CommunicationProtocol
- Device (Abstract)
- Actuator
- Sensor

Beside of 13 main metaclasses, we also have defined additional 4 metaclass concepts for handling multiple reference in MPS: 
- ServiceReference
- DeviceReference
- SensorReference
- ActuatorReference

### Custom Data Type
For custom data type, we have defined 11 Enumerations and 4 constrained string data types.

Enumeration
- ActuatorType
- AnalyticType
- CommunicationType
- ControlActions
- ControlType
- CropGroup
- MonitoringConditions
- MonitoringMetrics
- OutputType
- SensorState
- SensorType

Constrained String DataType
- Email
- IPAddress
- PhoneNumber
- Double
	
### Constraints
We have defined total 7 constraints which have feedback message for each own. 

Farm_Constraints:
- Farm Size must be greater than zero

Farmer_Constraints:
- Farmer_ID must be unique

Crop_Constraints: 
- Seed_Code of Crop should be unique

Service_Constraints: 
- Service_ID must be unique

Gateway_Constraints:
- Gateway_ID must be unique

Device_Constraints:
- Device_ID must be unique
	
Sensor_Constraints
- Negative value is only allowed for Temperature sensors

### Concrete Syntax

We have created two model instances which represent the concrete syntax of our metamodel: Farm_Aquila and Farm_Lappeenranta. 
//Image

## 3. EMF

### Metaclass
In EMF, we have defined same 13 main metaclass concepts from Domain Specific Concepts in smartFarming.ecore. 
- Farm (Root)
- Farmer
- Crop
- IoTSystem
- Service (Abstract)
- AnalyticsSystem
- Controlling
- Monitoring
- Gateway
- Communication Protocol
- Device (Abstract)
- Actuator
- Sensor

In addition, we have defined 1 metaclasses called Named to accommodate name field. 11 Enumerations are also defined with the same value with MPS Enumeration. 

### Dynamic Instances
We have created two dynamic instances in the form of XMI: Farm_Aquila.xmi and Farm_Lapen.xmi. In order to open it first time, you need to register ecore package first. 

//Image of Instance

### Constraints, Operations, and Derived Field
We used OCL to define the constraints for our metaclasses. There are 12 constraints, 3 derived properties and 4 operations.

**Constraints (Invariant)**

Named
- MustHaveName -> Named and its inherited class cannot be undefined

Farm
- ValidSize -> Farm Size value must be greater than zero

Crop
- CropUniqueID -> Crop SeedCode must be unique

Farmer
- FarmerUniqueID -> Farmer ID must be unique
- FarmerMustHaveID -> Farmer ID cannot be undefined

Service
- ServiceUniqueID -> Service ID must be unique
- ServiceMustHaveID -> Service ID cannot be undefined

Device
- DeviceUniqueID -> Device ID must be unique
- DeviceMustHaveID -> Device ID cannot be undefined

Gateway
- GatewayUniqueID -> Gateway ID must be unique
- GatewayMustHaveID -> Gateway ID cannot be undefined

Sensor
- SensorMinusConstraints -> Sensor negative value only allowed for temperature sensors

**Derived Properties**

Service
- PIC -> Show person in charge for a service. Derived from relation Farmer with Service. 

Communication Protocol
- SensorNumber -> Show number of Sensor using respective communication protocol. Derived from relation Sensor with Communication Protocol. 
- ActuatorNumber -> Show number of Actuator using respective communication protocol. Derived from relation Actuator with Communication Protocol.

**Operation**

Sensor
- isUsed() -> show if currently the Sensor is used by Monitoring service or not. It will return boolean value. 

Actuator
- isUsed() -> show if currently the Actuator is used by Controlling service or not. It will return boolean value. 

Monitoring
- calculateAverage(type: SensorType) -> calcute the average value of the Sensors that are being monitored. It will return ecore::EFloat. 
- checkCondition() -> Show monitoring condition based on the average value from the Sensors that are being monitored. It will return Enumeration value of MonitoringCondition. It is applicable for Monitoring service which has type of Nutrients and EnvironmentalSafety. For example, the EC Sensors has average value 70 and PH sensor has average value 1.70 will return Healthy condition.
