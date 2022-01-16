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

![image](https://user-images.githubusercontent.com/56352752/149663976-e324733e-de9a-4526-8aa1-6eff20638f87.png)

### Constaints
	* Farm size can't be negative or zero
	* Farmer ID must be unique
	* Seed Code of Crop should be unique
	* Service ID must be unique
	* Gateway ID must be unique
	* Device ID must be unique
	* Negative value is only allowed to temprature sensors
### Custome DataTypes
	$ Email
	$ IP Address
	$ Phone number
	$ Double

	
