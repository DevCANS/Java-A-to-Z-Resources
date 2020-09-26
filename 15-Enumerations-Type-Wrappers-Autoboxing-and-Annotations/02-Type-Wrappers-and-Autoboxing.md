># Type Wrappers

Java uses primitive types (also called simple types), such as `int` or `double`, to hold the basic data types supported by the language. Primitive types, rather than objects, are used for these quantities for the sake of performance. Using objects for these values would add an unacceptable overhead to even the simplest of calculations. Thus, the primitive types are not part of the object hierarchy, and they do not inherit Object.

Type Wrapper classes are those whose objects wraps a primitive data type within them. The type wrappers are `Double`, `Float`, `Long`, `Integer`, `Short`, `Byte`, `Character`, and `Boolean`. These classes offer a wide array of methods that allow you to fully integrate the primitive types into Java’s object hierarchy.

* A wrapper class wraps (encloses) around a primitive datatype and gives it an object appearance. Wherever the primitive datatype is required as an object type, this type wrapper can be used.
* Wrapper classes include methods to unwrap the object and give back the data type.
* The type wrappers classes are part of java.lang package.
* Each primitive type has a corresponding wrapper class.

|Primitive Type|Wrapper Class|
|---|---|
|double|Double|
|float|Float|
|long|Long|
|int|Integer|
|short|Short|
|byte|Byte|
|char|Character|
|boolean|Boolean|

##### [Example 01](../20-Examples/15-Enumerations-Type-Wrappers-Autoboxing-and-Annotations/02-Type-Wrappers-and-Autoboxing/Example-01/)

```java
// Demonstrate a type wrapper.
class Wrap {
    public static void main(String args[]) {
        Integer iOb = new Integer(100);
        int i = iOb.intValue();
        System.out.println(i + " " + iOb); // displays 100 100
    }
}
```

##### Output

    100 100

## Autoboxing and Unboxing

__Autoboxing__: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double etc.

__Unboxing__: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc.

##### [Example 02](../20-Examples/15-Enumerations-Type-Wrappers-Autoboxing-and-Annotations/02-Type-Wrappers-and-Autoboxing/Example-02/)

```java
// Autoboxing/unboxing occurs inside expressions.
class AutoBox {
    public static void main(String args[]) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Original value of iOb: " + iOb);
        // The following automatically unboxes iOb,
        // performs the increment, and then reboxes
        // the result back into iOb.
        ++iOb;
        System.out.println("After ++iOb: " + iOb);
        // Here, iOb is unboxed, the expression is
        // evaluated, and the result is reboxed and
        // assigned to iOb2.
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);
        // The same expression is evaluated, but the
        // result is not reboxed.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }
}
```

##### Output

    Original value of iOb: 100
    After ++iOb: 101
    iOb2 after expression: 134
    i after expression: 134

## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/wrapper-class-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/wrapper-classes-java/)
* [Beginners Book](https://beginnersbook.com/2017/09/wrapper-class-in-java/)