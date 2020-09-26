># Access Control

Classes and packages are both means of encapsulating and containing the name space and scope of variables and methods. Packages act as containers for classes and other subordinate packages. Classes act as containers for data and code. The class is Java’s smallest unit of abstraction. Because of the interplay between classes and packages, Java addresses four categories of visibility for class members:

* Subclasses in the same package
* Non-subclasses in the same package
* Subclasses in different packages
* Classes that are neither in the same package nor subclasses

The three access modifiers, `private`, `public`, and `protected`, provide a variety of ways to produce the many levels of access required by these categories.

||Private|Default/ No Modifier|Protected|Public|
|---|---|---|---|---|
|Same class|Yes|Yes|Yes|Yes|
|Same package subclass|No|Yes|Yes|Yes|
|Same package non-subclass|No|Yes|Yes|Yes|
|Different package subclass|No|No|Yes|Yes|
|Different package non-subclass|No|No|No|Yes|


##### Example
The following example shows all combinations of the access control modifiers.

This is file __Protection.java__:
```java
package p1;
public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    public Protection() {
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
```

This is file __Derived.java__:

```java
package p1;
class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        // class only
        // System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
```

This is file __SamePackage.java__:

```java
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        // class only
        // System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
```

The source for the first package defines three classes: Protection, Derived, and `SamePackage`. The first class defines four `int` variables in each of the legal protection modes. The variable `n` is declared with the default protection, `n_pri` is private, `n_pro` is protected, and `n_pub` is public.

Each subsequent class in this example will try to access the variables in an instance of this class. The lines that will not compile due to access restrictions are commented out. Before each of these lines is a comment listing the places from which this level of protection would allow access.

The second class, Derived, is a subclass of Protection in the same package, `p1`. This grants Derived access to every variable in Protection except for `n_pri`, the private one. The third class, `SamePackage`, is not a subclass of Protection, but is in the same package and also has access to all but `n_pri`.

This is file __Protection2.java__:

```java
package p2;
class Protection2 extends p1.Protection {
    Protection2() {
        System.out.println("derived other package constructor");
        // class or package only
        // System.out.println("n = " + n);
        // class only
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
```

This is file __OtherPackage.java__:

```java
package p2;
class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");
        // class or package only
        // System.out.println("n = " + p.n);
        // class only
        // System.out.println("n_pri = " + p.n_pri);
        // class, subclass or package only
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
```

The two classes defined in `p2` cover the other two conditions that are affected by access control. The first class, `Protection2`, is a subclass of `p1.Protection`. This grants access to all of __p1.Protection__’s variables except for `n_pri` (because it is private) and `n`, the variable declared with the default protection. Remember, the default only allows access from within the class or the package, not extrapackage subclasses. Finally, the class `OtherPackage` has access to only one variable, `n_pub`, which was declared public.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
* [JavaTPoint](https://www.javatpoint.com/access-modifiers)
* [GeeksForGeeks](https://www.geeksforgeeks.org/access-modifiers-java/)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=3n1cvoDL1qw&list=PL9DF6E4B45C36D411&index=25)

### More Examples and Practice Questions
