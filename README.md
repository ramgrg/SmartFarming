# IoT Systems in Smart Farming
This is a repository for Model Driven Engineering(MDE) Project that models IoT system in Smart farming technology, particularly Closed Environment Farming(CEF).

The repository Contains four projects within:

  * MPS Platform - for defining the metamodels within IoT for Smart Farming.
  * EMF Platform -  for defining the metamodels within IoT for Smart Farming.
  * Accelio (ATL) - for model transformation 
  * xText and Sirius - for development of textual and graphical editors. 

How to use the project:
  * MPS: MPS Project is under folder MPS -> SmartFarming. 
  * EMF: EMF Project is under folder EMF -> SmartFarming. Register smartFarming.ecore to be able to open the instances first time. 

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
  ### 4. Model Transformation in Epsilon 
    * Refactoring and Refining of Metamodels
    * Model to Model Transformation using ATL
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
<img width="819" alt="Screen Shot 2022-01-17 at 22 22 52" src="https://user-images.githubusercontent.com/37994271/149833063-703ad60d-4771-4aba-9c0c-638ad1f91e6f.png">

## 2. MPS

### Metamodels
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

1. Farm_Aquila
![image](https://user-images.githubusercontent.com/8501541/149832459-a6bb7d12-0603-4cd6-a56b-64d8944556ed.png)


2. Farm_Lappeenranta
![image](https://user-images.githubusercontent.com/8501541/149832642-00ddcad1-c231-41a0-9f17-d77b069e93a3.png)


## 3. EMF

### Metaclasses
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

1. Farm_Aquila.xmi
<img width="361" alt="Screen Shot 2022-01-17 at 22 24 56" src="https://user-images.githubusercontent.com/37994271/149833135-be99b838-3b65-4ec5-8cff-5540307f48f2.png">

2. Farm_Lapen.xmi
<img width="380" alt="Screen Shot 2022-01-17 at 22 25 42" src="https://user-images.githubusercontent.com/37994271/149833220-f8e3030e-5353-480b-a59d-b83a5d10458c.png">


### Constraints, Operations, and Derived Field
We used OCL to define the constraints for our metaclasses. There are 12 constraints, 3 derived properties and 4 operations.

**Constraints (Invariants)**

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

**Operations**

Sensor
- isUsed() -> show if currently the Sensor is used by Monitoring service or not. It will return boolean value. 

Actuator
- isUsed() -> show if currently the Actuator is used by Controlling service or not. It will return boolean value. 

Monitoring
- calculateAverage(type: SensorType) -> calcute the average value of the Sensors that are being monitored. It will return ecore::EFloat. 
- checkCondition() -> Show monitoring condition based on the average value from the Sensors that are being monitored. It will return Enumeration value of MonitoringCondition. It is applicable for Monitoring service which has type of Nutrients and EnvironmentalSafety. For example, the EC Sensors has average value 70 and PH sensor has average value 1.70 will return Healthy condition.

## 4. Model Transformation in Epsilon
## 5. xText and Sirius

### Concrete Syntax using xText
We have created XText project using the model created in A2. There is some changes in the automatically created xtext codes as per the design we opted. From the code, we have created two farm models:Farm_Aquila.farm and Farm_Lappeenranta.farm.

Following is the screenshots of the farm we have created:
![Lappeenranta_Farm](https://user-images.githubusercontent.com/8501541/153247682-6b474cd5-109b-4325-8419-452fa34a0236.png)
![Aquila_Farm](https://user-images.githubusercontent.com/8501541/153248131-17c0788e-e1fc-4eb2-b9ed-2833589a9d12.png)


### Graphical Editor using Sirius

We have designed a graphical editor to visualize and edit our domain models using Sirius. In this task we have created nodes to represent metamodel concepts and relational edges to represent the relationship among concepts and palette operators to create such nodes and edges. For this task we have considered Project Management Viewpoint which considers 7 metaclasses and the relationship among them.

![image](https://user-images.githubusercontent.com/56352752/153251491-93640757-478f-42ab-8b79-d518f5cd4178.png)


**Nodes**

	- the Person with hat icon represents Farmer in our system
	- The big Light-Gray Rectangle container represents IoTSystem 
	- The Gears Icon represent Services
	- The Blue chip represents Devices
	- The small gray rectanlgular container represents Gateway
	- The connected chip icon inside the Gateway represents the communication protocols-> Gateway
	- The crops icon represent Crops
	
**Edges**

	- Gray-Arrow represents Operate relationship -> connects Farmer to Services
	- Red-Dot-Arrow represents Monitor relationship -> connects Monitoring service with Sensors
	- Blue-Dot-Arrow represents Control relationship -> connects Controlling service with Actuators
	- Green-Dash-and-Dot-Arrow represents Uses relationship -> connects Devices with communication protocol
	
**Pallete Section**

	- For this section we have added six node operators and three edge operators in pallete.
	
![image](https://user-images.githubusercontent.com/56352752/153256896-624010a6-2d7d-4f0b-b982-a059e40d1135.png)
	
**Node Operators**

	- Add Farmer - to add a new Farmer to our smart farming system
	- Add Monitoring  - to add the Monitoring Service to our IoT System
	- Add Controlling - to add  Controlling Service to our IoT System 
	- Add Sensor - to add more Sensors to our IoT System
	- Add Actuator -  to add more Actuators to our IoT System
	- Add Crop - to add the crop we want to grow in our Smart farming
	
**Edge Operators** 

We have added edge operators to represent the relationship among the defferent Conceps of domain

	- Add Operator relation -  to add a relationship between the service and the farmer operating it.
	- Add Monitor relation - to add a relationship between the monitoring service and the sensors it uses for that operation.
	- Add Control relation - to add a relationship between the controlling service and the actuators it uses for that operation.
	
**Additional Layer** 

	- We have added two additional layers to give more clear look for the project manager, if the project manager wants to focus on the IoT system he can remove the crop and farmer layers by unchecking the checkbox. And if he wants to see the crops and the farmers responsible for the services he can activate the Farmer and crop layer by checking the boxs.

![image](https://user-images.githubusercontent.com/56352752/153263950-f8781e89-6d8d-41d8-94a0-f9f3cf30ff3f.png)

