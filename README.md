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

## 4. Model Transformation

### Model Refinement (SmartFarmingV2)
We have refined the model from A2 with following changes: 

**Deletion and Addition of Concepts**
- Delete Communication Protocol Concept. Include: Remove the containment reference from Gateway, change the value of Protocol of Sensor and Actuator directly to CommunicationType enum.
- Add Database Concept (added under IoTSystem). 

**Concept Renaming**
- Rename Abstract Concept Service to Utility
- Rename Analytics System to Analytics

**Structural Refinement**
- Rename Attribute ServiceID to UtilityID (from Service to Utility concept)
- Select First Database for Utility from newly created Databases
- Move Devices become under Gateways (change the reference to containment) and remove Devices containment reference from IoTSystem
- Rename Attribute Services to Utilities in Farmer concept. 
- Move Protocol Attribute from Sensor and Actuator to Device

The structure of new metamodel shown in figure below. The new metamodel file can be seen under Transformation Folder -> SmartFarmingV2 (smartFarmingV2.ecore)

![Copy of Sunday Diagram (2)](https://user-images.githubusercontent.com/37994271/153266773-2f600b88-9d38-43a7-b66d-17af4fe47071.jpg)

### Model-to-Model Transformation (SmartFarmingTransformation)
We transformed Farm_Lapen.xmi (smartFarming.ecore) to Output.xmi (smartFarmingV2.ecore) based on above model refinement using ATL. Following configuration is used:

<img width="735" alt="Screen Shot 2022-02-09 at 20 11 11" src="https://user-images.githubusercontent.com/37994271/153263478-a5e98286-2351-4547-9a40-0e97d65fa009.png">

- Input: Farm_Lapen.xmi
<img width="432" alt="Screen Shot 2022-02-09 at 20 10 34" src="https://user-images.githubusercontent.com/37994271/153263527-ae128f07-dd20-4d85-81b0-9f6f610a452f.png">

- Output: Output.xmi
<img width="395" alt="Screen Shot 2022-02-09 at 20 10 48" src="https://user-images.githubusercontent.com/37994271/153263564-4d8d0ebd-fb2e-4cd2-b735-3ddf92f783fe.png">


### Model-To-Text Transformation (SmartFarmingAcceleo)
We transformed Farm_Aquila_New.xmi from SmartFarmingV2 to html text under /html folder using Acceleo. We created 7 template. Following configuration is used. 

<img width="716" alt="Screen Shot 2022-02-09 at 20 15 27" src="https://user-images.githubusercontent.com/37994271/153264102-770642de-78c0-4449-9f62-fca3a51c8d05.png">

- Farm Template (Aquila.html)
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_Aquila html](https://user-images.githubusercontent.com/37994271/153264506-3e3954e9-b772-4913-9f17-ae8bf80eb8cc.png)

- Crop Detail Template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_crop_BR001 html](https://user-images.githubusercontent.com/37994271/153264710-e04c4880-e380-49eb-8b93-46e549180276.png)

- Farmer Detail Template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_farmer_FM001 html](https://user-images.githubusercontent.com/37994271/153264839-b20d96a3-d4a3-43ac-a42d-7be8f76b1c21.png)

- Utility Detail Template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_utility_SER001 html](https://user-images.githubusercontent.com/37994271/153264957-fe8abe81-d307-4596-acf7-808dbd5ae399.png)

- Gateway Detail template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_gateway_GT001 html](https://user-images.githubusercontent.com/37994271/153265143-cbfb62d4-0db2-4018-a2cf-c81e489aab6f.png)

- Database Detail template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_database_001 html](https://user-images.githubusercontent.com/37994271/153265231-0d93df51-9f4a-4ae1-a6c5-f47d7fe302ab.png)

- Device Detail Template
![_Users_mohammadrijal_Documents_SmartFarming_Transformation%20(A3)_SmartFarmingAcceleo_html_device_S002 html](https://user-images.githubusercontent.com/37994271/153265330-b87cfca9-7dba-4018-8655-66150071de88.png)

## 5. xText and Sirius

### Concrete Syntax using xText
We have created XText project using the metamodel structure in A2. The model is in SmartFarmingXText folder with model code generated. There is some changes in the automatically created xtext codes as per the design we opted. From the code, we have created two farm models: Farm_Aquila.farm and Farm_Lappeenranta.farm.

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

We have added two additional layers to give more clear look for the project manager, if the project manager wants to focus on the IoT system he can remove the crop and farmer layers by unchecking the checkbox. And if he wants to see the crops and the farmers responsible for the services he can activate the Farmer and crop layer by checking the boxs.

![image](https://user-images.githubusercontent.com/56352752/153263950-f8781e89-6d8d-41d8-94a0-f9f3cf30ff3f.png)

