># Nested Interface and Extending Interface

## Extending Interface

One interface can inherit another by use of the keyword `extends`. The syntax is the same as for inheriting classes. When a class implements an interface that inherits another interface, it must provide implementations for all methods required by the interface inheritance chain.

##### Example

```java
// Filename: Sports.java
public interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}
```

```java
// Filename: Football.java
public interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}
```

```java
// Filename: Hockey.java
public interface Hockey extends Sports {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
```

The `Hockey` interface has four methods, but it inherits two from `Sports`; thus, a class that implements `Hockey` needs to implement all six methods. Similarly, a class that implements `Football` needs to define the three methods from `Football` and the two methods from `Sports`.


## Nested Interfaces

An interface can be declared inside a class or another interface as member. Such an interface is called a member interface or a nested interface. A nested interface can be declared as public, private, or protected. This differs from a top-level interface, which must either be declared as public or use the default access level

When a nested interface is used outside of its enclosing scope, it must be qualified by the name of the class or interface of which it is a member. Thus, outside of the class or interface in which a nested interface is declared, its name must be fully qualified.

##### [Example 01](../20-Examples/11-Interfaces/02-Nested-Interface-And-Extending-Interface/Example-01/)

```java
// A nested interface example.
// This class contains a member interface.
class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
```

```java
// B implements the nested interface.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
```

```java
class NestedIFDemo {
    public static void main(String args[]) {
        // use a nested interface reference
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
```

##### Output

    10 is not negative

Notice that A defines a member interface called `NestedIF` and that it is declared public. Next, `B` implements the nested interface by specifying `implements A.NestedIF`

Notice that the name is fully qualified by the enclosing class’ name. Inside the `main()` method, an `A.NestedIF` reference called nif is created, and it is assigned a reference to a `B` object. Because `B` implements `A.NestedIF`, this is legal.


## External Resources

### Readings

[Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
[JavaTPoint](https://www.javatpoint.com/interface-in-java)

### More Examples and Practice Questions

[W3Schools](https://www.w3schools.com/java/java_interface.asp)