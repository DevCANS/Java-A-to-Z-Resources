># Object Oriented Paradigm

The Object Oriented Programming ( OOPs ) can be defined as a programming model or paradigm that emphasizes or focus mainly on objects. The object oriented programming considers data important rather than actions (functions). Object Oriented Programming is not a programming language rather than it is a programming model that the programming languages follow.

## Definitions

* __Objects__: Objects are real world entities which have their own properties and behaviours. Basically everything you touch or feel is an object.
* __Class__: Class is a blueprint for the objects. The behaviours and properties of the objects are decided from the class.
* __Properties__: They are the attributes of an object. In object oriented programming they are the vriables or class members which describes the class.
* __Behaviour__: The behavior of an object is defined by its methods, which are the functions and subroutines defined within the object class. Without class methods, a class would simply be a structure. Methods determine what type of functionality a class has, how it modifies its data, and its overall behavior.

##### Example

A car has basic attributes like 'Model', 'Brand', 'Max Speed', 'Transmission'. These are the properties of a car which gives a unique identity to the car.

Now, the car can have some behaviours like 'Start', 'Apply Brakes', 'Accelerate'. These are the some functionality that describes the behaviour of the car.

__Class Car__

Properties:

    Model
    Brand
    Max Speed
    Transmission

Behaviours:

    start()
    applyBrakes()
    accelerate()

This class provides a blue print which describe how a car should look and behave but doesn't actually give a complete feel of a car.

Now, consider a Car having:

    Model = i8
    Brand = BMW
    Max Speed = 155 mph
    Transmission = Automatic

Now looking at this you know what car it actually is. This is called an object of the class Car. A class can have different values for its properties and each constitutes an object which are different for each other. Every car object will have the same behaviour but will implement in their own way.

## OOPS vs Functional Programing

|Object Oriented Programming|Functional Programming|
|---|---|
|This programming paradigm is based on object oriented concept. Classes are used where instance of objects are created.|This programming paradigm emphasizes on the use of functions where each function performs a specific task.|
|Fundamental elements used are objects and methods and the data used here are mutable data.|Fundamental elements used are variables and functions.The data in the functions are immutable(cannot be changed after creation).|
|Importance is given to data rather than procedures.|Importance is not given to data but to functions.|
|Provides data hiding through access modifiers|No access modifiers hence no data hiding|

## Advantages of OOP
* OOPs makes development and maintenance easier, whereas, in a procedure-oriented programming language, it is not easy to manage if code grows as project size increases.
* OOPs provides data hiding, whereas, in a procedure-oriented programming language, global data can be accessed from anywhere.
* OOPs provides the ability to simulate real-world event much more effectively. We can provide the solution of real word problem if we are using the Object-Oriented Programming language.

## External Resources

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
* [JavaTPoint](https://www.javatpoint.com/java-oops-concepts)