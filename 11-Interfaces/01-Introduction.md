># Interfaces

Another way to achieve abstraction in Java, is with interfaces.
An `interface` is a completely **abstract class** that is used to group related methods with empty bodies. The interface may also contain constants, default methods, static methods, and nested types. Only default and static methods can have bodies.

Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.

Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.

An interface is most useful when you want to the class implementing an interface to implement the behaviour of interface. On implementing an interface the class is forced to perform the behaviour.

For example an inteface called `Car` has method `accelerate`, if a class say `SUV` implements `Car` must implement the behaviour. This ensures that all the cars must have a behaviour called `accelerate`.

An interface is similar to a class in following ways:
* An interface can contain any number of methods
* An interface must be declared public or default
* An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.
* The byte code of an interface appears in a .class file.
* Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.

However an interface is different from a class in several ways:
* An interface can not be instantiated
* Does not have constructors
* All methods in an interface are abstract
* An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
* An interface is not extended by a class; it is implemented by a class.
* A class can implement multiple interfaces

## 'interface' Keyword

An interface is declared using `interface` keyword. An interface has following properties:
* An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
* Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
* Methods in an interface are implicitly public.

##### Example
```java
// interface is declared using 'interface' keyword
public interface Car{
    // declaring abstract methods
    // no need to use 'abstract' keyword
    // by default they are abstract in an interface
    public void start();
    public void accelerate();
    public void stop();
}
```

## 'implements' keyword

When a class implements an interface, you can think of the class agreeing to perform specific behaviors of the interface. If a class does not perform all the behaviours of the interface, the class must be declared abstract.

A class can implement an interface using the keyword `implements`.

##### [Example 01](../20-Examples/11-Interfaces/01-Introduction/Example-01/)

```java
public class SUV implements Car{

    // implementing behaviours of the interface Car

    public void start(){
        System.out.println("SUV started");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }

    public void stop(){
        System.out.println("SUV is stopped");
    }

    public static void main(String[] args){
        SUV suv = new SUV();

        suv.start();
        suv.accelerate();
        suv.stop();
    }
}
```
##### Output

    SUV started
    Accelerating
    SUV stopped


When overriding methods defined in interfaces, there are several rules to be followed

* Checked exceptions should not be declared on implementation methods other than the ones declared by the interface method or subclasses of those declared by the interface method.
* The signature of the interface method and the same return type or subtype should be maintained when overriding the methods.
* An implementation class itself can be abstract and if so, interface methods need not be implemented.
* An interface can extend another interface in the same way a class extends anothere class
* A class can implement multiple interfaces. Each interface name should be separated by a comma `,`

    ```java    
    public class A implements B, C, D{
        // implementation of methods of B, C and D
    }
    ```

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
* [JavaTPoint](https://www.javatpoint.com/interface-in-java)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=HxmP7ZVUeGU&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=29)
* [Cave of Programming](https://www.youtube.com/watch?v=UumX4mQKQlA&list=PL9DF6E4B45C36D411&index=23)

### More Examples and Practice Questions

* [W3Schools](https://www.w3schools.com/java/java_interface.asp)