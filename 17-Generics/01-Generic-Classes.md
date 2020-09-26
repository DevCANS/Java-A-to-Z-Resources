># Generics Classes

“Java Generics” is a technical term denoting a set of language features related to the definition and use of generic types and methods . In java, Generic types or methods differ from regular types and methods in that they have type parameters.

Parameterized types are important
because they enable you to create classes, interfaces, and methods in which the type of data
upon which they operate is specified as a parameter. Using generics, it is possible to create a single class, for example, that automatically works with different types of data. A class, interface, or method that operates on a parameterized type is called generic, as in generic class or generic method.

## Generic Classes

##### [Example 01](../20-Examples/17-Generics/01-Generic-Classes/Example-01/)

```java
// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<T> {
    T ob; // declare an object of type T
    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }
    // Return ob.
    T getob() {
        return ob;
    }
    // Show type of T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
```

```java
// Demonstrate the generic class.
class GenDemo {
    public static void main(String args[]) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;
        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
        iOb = new Gen<Integer>(88);
        // Show the type of data used by iOb.
        iOb.showType();
        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String> ("Generics Test");
        // Show the type of data used by strOb.
        strOb.showType();
        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}
```

##### Output

    Type of T is java.lang.Integer
    value: 88
    Type of T is java.lang.String
    value: Generics Test

Here, `T` is the name of a type parameter. This name is used as a placeholder for the actual type that will be passed to `Gen` when an object is created. Thus, `T` is used within `Gen` whenever the type parameter is needed.

Whenever a type parameter is being declared, it is specified within angle brackets.

Next, T is used to declare an object called ob, as shown here:

```java
T ob; // declare an object of type T
```

As explained, `T` is a placeholder for the actual type that will be specified when a Gen object is created. Thus, ob will be an object of the type passed to `T`. For example, if type `String` is passed to `T`, then in that instance, ob will be of type `String`.

Now, consider Gen's constructor

```java
Gen(T o) {
    ob = o;
}
```

It's parameter is of type `T` which means the actual type of `o` is determined by the type passed to `T` when a `Gen` object is created.

The type parameter `T` can also be used to specify the return type of a method, as is the
case with the `getob()` method, shown here:

```java
T getob() {
    return ob;
}
```

The `GenDemo` class demonstrates the generic `Gen` class. It first creates a version of `Gen` for integers, as shown here:

```java
Gen<Integer> iOb
```

In this case, `Integer` is a type argument that is passed to `Gen`’s type parameter, `T`. This effectively creates a version of `Gen` in which all references to `T` are translated into references to `Integer`.

The next line assigns to `iOb` a reference to an instance of an `Integer` version of the `Gen` class:

```java
iOb = new Gen<Integer>(88);
```

When declaring an instance of a generic type, the type argument passed to the type parameter must be a reference type. You cannot use a primitive type, such as int or char. For example, with `Gen`, it is possible to pass any class type to `T`, but you cannot pass a primitive type to a type parameter.

##### [Example 02](../20-Examples/17-Generics/01-Generic-Classes/Example-02/)

You can declare more than one type parameter in a generic type. To specify two or more type parameters, simply use a comma-separated list.

```java
// A simple generic class with two type
// parameters: T and V.
class TwoGen<T, V> {
    T ob1;
    V ob2;
    // Pass the constructor a reference to
    // an object of type T and an object of type V.
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    // Show types of T and V.
    void showTypes() {
        System.out.println("Type of T is " +
        ob1.getClass().getName());
        System.out.println("Type of V is " +
        ob2.getClass().getName());
    }
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }
}
```

```java
// Demonstrate TwoGen.
class SimpGen {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj =
        new TwoGen<Integer, String>(88, "Generics");
        // Show the types.
        tgObj.showTypes();
        // Obtain and show values.
        int v = tgObj.getob1();
        System.out.println("value: " + v);
        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}
```

##### Output

    Type of T is java.lang.Integer
    Type of V is java.lang.String
    value: 88
    value: Generics


## Bounded Types

Sometimes it is useful to limit the types that can be passed to a type parameter. For example, assume that you want to create a generic class that contains a method that returns the average of an array of numbers. Thus, you want to specify the type of the numbers generically, using a type parameter.

##### [Example 03](../20-Examples/17-Generics/01-Generic-Classes/Example-03/)

```java
// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number> {
    T[] nums; // array of Number or subclass
        // Pass the constructor a reference to
        // an array of type Number or subclass.
    Stats(T[] o) {
        nums = o;
    }
    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
}
```

```java
// Demonstrate Stats.
class BoundsDemo {
    public static void main(String args[]) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        // This won't compile because String is not a
        // subclass of Number.
        // String strs[] = { "1", "2", "3", "4", "5" };
        // Stats<String> strob = new Stats<String>(strs);
        // double x = strob.average();
        // System.out.println("strob average is " + v);
    }
}
```

##### Output

    Average is 3.0
    Average is 3.3


Because the type `T` is now bounded by `Number`, the Java compiler knows that all objects of type `T` can call `doubleValue()` because it is a method declared by `Number`. This is, by itself, a major advantage. However, as an added bonus, the bounding of `T` also prevents nonnumeric `Stats` objects from being created.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
* [JavaTPoint](https://www.javatpoint.com/generics-in-java)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=rOBtgaXaba0&list=PL9DF6E4B45C36D411&index=30)