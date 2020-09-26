># Class Fundamentals

The class forms the basis for object-oriented programming in Java. Any concept you wish to implement in a Java program must be encapsulated within a class.

A class is a user defined data type. It is a blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.

A class is declared by use of the `class` keyword. A simplified general form of a class definition is shown here:

```java
class classname {
    Type instanceVariable1;
    Type instanceVariable2;
    // ...
    Type instanceVariableN;

    Type methodName1(parameterList) {
        // body of method
    }
    Type methodName2(parameterList) {
        // body of method
    }
    // ...
    Type methodNameN(parameterList) {
        // body of method
    }
}
```

Collectively, the methods and variables defined within a class are called members of the class.

Variables defined within a class are called _instance variables_ because each instance of the class (that is, each object of the class) contains its own copy of these variables. Thus, the data for one object is separate and unique from the data for another.

Here is a class called `Box` that defines three instance variables: `width`, `height`, and `depth`.

```java
class Box {
    double width;
    double height;
    double depth;
}
```

As stated, a class defines a new type of data. In this case, the new data type is called `Box`.

To create an object of type `Box` you will use the `new` keyword.

```java
Box myBox = new Box();
```

This statement will create a new instance, `myBox`, of `Box`. Each time you create an instance of the class it creates an object of it having its own copy of instance variables defined by the class.

To access the variables, you will use the dot (`.`) operator.

```java
myBox.width = 100;
```

This assigns the value `100` to the copy of `width` that is contained within the `myBox` object.

##### [Example 01](../20-Examples/08-Classes-and-Objects/01-Class-Fundamentals/Example-01/)

```java
/* A program that uses the Box class.
Call this file BoxDemo.java
*/
class Box {
    double width;
    double height;
    double depth;
}
// This class declares an object of type Box.
class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;
        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}
```

You should call the file that contains this program `BoxDemo.java`, because the `main()` method is in the class called `BoxDemo`, not the class called `Box`. When you compile this program, you will find that two `.class` files have been created, one for `Box` and one for `BoxDemo`. The Java compiler automatically puts each class into its own .class file. It is not necessary for both the `Box` and the `BoxDemo` class to actually be in the same source file. You could put each class in its own file, called `Box.java` and `BoxDemo.java`, respectively, which is the recommeded way.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
* [JavaTPoint](https://www.javatpoint.com/object-and-class-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/classes-objects-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=ZHLdVRXIuC8&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=19)
* [Cave of Programming](https://www.youtube.com/watch?v=OHw2t8BaIUg&list=PL9DF6E4B45C36D411&index=14)
* [Alex Lee](https://www.youtube.com/watch?v=vjjjGkXpX_I&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=10)
