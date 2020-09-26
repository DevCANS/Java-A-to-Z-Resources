># Access Control

Encapsulation links data with the code that manipulates it. However, encapsulation provides another important attribute: _access control_. Through encapsulation, you can control what parts of a program can access the members of a class. By controlling access, you can prevent misuse.

How a member can be accessed is determined by the _access modifier_ attached to its declaration. Java supplies a rich set of access modifiers. Some aspects of access control are related mostly to inheritance or packages.

Java’s access modifiers are `public`, `private`, and `protected`. Java also defines a `default` access level.

When a member of a class is modified by `public`, then that member can be accessed by any other code. When a member of a class is specified as `private`, then that member can only be accessed by other members of its class.

In the classes developed so far, all members of a class have used the `default` access mode. However, this is not what you will typically want to be the case. Usually, you will want to restrict access to the data members of a class—allowing access only through methods. Also, there will be times when you will want to define methods that are `private` to a class. Usually classes are declared as `public`.

##### [Example 01](../20-Examples/08-Classes-and-Objects/05-Access-Control/Example-01/)

```java
/* This program demonstrates the difference between
public and private.
*/
class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access
    // methods to access c
    void setc(int i) { // set c's value
        c = i;
    }
    int getc() { // get c's value
        return c;
    }
}
```

```java
class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();
        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;
        // This is not OK and will cause an error
        // ob.c = 100; // Error!
        // You must access c through its methods
        ob.setc(100); // OK
        System.out.println("a, b, and c: " + ob.a + " " +
        ob.b + " " + ob.getc());
    }
}
```

As you can see, inside the Test class, `a` uses `default` access, which for this example is the same as specifying `public`. `b` is explicitly specified as `public`. Member `c` is given `private` access. This means that it cannot be accessed by code outside of its class. So, inside the `AccessTest` class, `c` cannot be used directly. It must be accessed through its public methods: `setc()` and `getc()`.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
* [JavaTPoint](https://www.javatpoint.com/access-modifiers)
* [GeeksForGeeks](https://www.geeksforgeeks.org/access-modifiers-java/)