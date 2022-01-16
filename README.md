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
    * Constraints
    * Custom Datatypes
  ### 2. MPS
    * Metamodels
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

![image](https://user-images.githubusercontent.com/56352752/149663702-f7147cd1-9f53-4cd7-bf65-9374d2b5e9b7.png)

### Relationships
As you can see from the above diagram,all metamodels have different types of relationships among them.
Source Concepts	Relation Name	Target Concept	Type	Multiplicity	Note
Farm	Contains	IoT System	Containment	[1..1]	
Farm	Contains	Crops	Containment	[1..N]	
Farm	Contains	Farmers	Containment	[1..N]	
IoT System	Contains	Services	Containment	[1..N]	
IoT System	Contains	Gateway	Containment	[1..N]	
IoT System	Contains	Device	Containment	[1...N]	
Analytics	Specialization	Service	Inheritance		
Monitoring System	Specialization	Service	Inheritance		
Controlling System	Specialization	Service	Inheritance		
Gateway 	Contains	Communication Protocol	Containment	[1..N]	
Sensor	Specialization	Device	Inheritance		
Actuator	Specialization	Device	Inheritance		
Sensor	use	Communication Protocol	Association	[1..1]	
Actuator	use	Communication Protocol	Association	[1..1]	
Farmer	manage	Service	Association	[1..N]	
Monitoring System	use	Sensor	Association	[1..N]	
Controlling System	use	Actuator	Association	[1..N]	
Monitoring System	trigger	Controlling System	Association	[1..1]	
Gateway 	manage	Sensor			
Gateway 	manage 	Actuator			
