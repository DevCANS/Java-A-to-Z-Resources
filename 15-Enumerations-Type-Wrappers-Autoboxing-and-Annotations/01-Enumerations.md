># Enumerations

In its simplest form, an enumeration is a list of named constants. In Java, an enumeration defines a class type. By making enumerations into classes, the capabilities of the enumeration are greatly expanded.

## Fundamentals

An enumeration is created using the `enum` keyword.

```java
// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
```

The identifiers `Jonathan`, `GoldenDel`, and so on, are called enumeration constants. Each is implicitly declared as a `public`, `static` `final` member of `Apple`.

Once you have defined an enumeration, you can create a variable of that type. However, even though enumerations define a class type, you do not instantiate an `enum` using `new`.

Two enumeration constants can be compared for equality by using the `==` relational operator.

An enumeration value can also be used to control a `switch` statement. All of the case statements must use constants from the same `enum` as that used by the `switch` expression.

##### [Example 01](../20-Examples/15-Enumerations-Type-Wrappers-Autoboxing-and-Annotations/01-Enumerations/Example-01/)

```java
// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
```

```java
class EnumDemo {
    public static void main(String args[]){
        Apple ap;
        ap = Apple.RedDel;
        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        // Compare two enum values.
        if(ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");
        
        // Use an enum to control a switch statement.
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}
```

##### Output

    Value of ap: RedDel
    ap contains GoldenDel.
    Golden Delicious is yellow.

## values() and valueOf()

All enumerations automatically contain two predefined methods: `values()` and `valueOf()`.

```java
public static enumType[] values()
public static enumType valueOf(String str)
```

The `values()` method returns an array that contains a list of the enumeration constants.

The `valueOf()` method returns the enumeration constant whose value corresponds to the string passed in str.

##### [Example 02](../20-Examples/15-Enumerations-Type-Wrappers-Autoboxing-and-Annotations/01-Enumerations/Example-02/)

```java
// Use the built-in enumeration methods.
// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
```

```java
class EnumDemo {
    public static void main(String args[]){
        Apple ap;
        System.out.println("Here are all Apple constants:");
        // use values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);
        System.out.println();
        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
```

##### Output

    Here are all Apple constants:
    Jonathan
    GoldenDel
    RedDel
    Winesap
    Cortland
    ap contains Winesap

A Java enumeration is a class type. You don't instantiate an `enum` but you can give them constructors, instance variables and methods and even implement interfaces.

Each enumeration constant is an object of its enumeration type. Thus, when you define a constructor for an `enum`, the constructor is called when each enumeration constant is created. Also, each enumeration constant has its own copy of any instance variables defined by the enumeration.

Although you can’t inherit a superclass when declaring an `enum`, all enumerations automatically inherit one: `java.lang.Enum`. This class defines several methods that are available for use by all enumerations.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
* [JavaTPoint](https://www.javatpoint.com/enum-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/enum-in-java/)
* [Beginners Book](https://beginnersbook.com/2014/09/java-enum-examples/)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=A0GHaVRlYAQ&list=PL9DF6E4B45C36D411&index=44)