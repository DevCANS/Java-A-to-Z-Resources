># Inheritance Basics

The process by which one class acquires the properties(data members) and functionalities(methods) of another class is called inheritance. The aim of inheritance is to provide the reusability of code so that a class has to write only the unique features and rest of the common properties and functionalities can be extended from the another class.

## Definitions

* __Parent/Base/Super Class__: The class whose properties and functionalities are used(inherited) by another class is known as parent class, super class or Base class.
* __Child/Derived/Sub Class__: The class that inherits the other class is known as sub class. The subclass can add its own fields and methods in addition to the superclass fields and methods.

Inheritance allows reuse of code, it improves reusability in your java application.

__Note__: The biggest advantage of Inheritance is that the code that is already present in base class need not be rewritten in the child class.

To inherit a class, you simply incorporate the definition of one class into another by using
the `extends` keyword.

## Types of Inheritance

* __Single Inheritance__: In single inheritance, subclasses inherit the features of one superclass. In image below, the class A serves as a base class for the derived class B.
* __Multilevel inheritance__: It refers to a child and parent class relationship where a class extends the child class. For example class C extends class B and class B extends class A.
* __Hierarchical inheritance__: refers to a child and parent class relationship where more than one classes extends the same class. For example, classes B, C & D extends the same class A.
* __Multiple Inheritance__: It refers to the concept of one class extending more than one classes, which means a child class has two parent classes. For example class C extends both classes A and B. __Java doesn’t support multiple inheritance__.
* __Hybrid inheritance__: Combination of more than one types of inheritance in a single program. For example class A & B extends class C and another class D extends class A then this is a hybrid inheritance example because it is a combination of single and hierarchical inheritance.

![Inheritance types](images/types_of_inheritance.png)

##### [Example 01](../20-Examples/10-Inheritance/01-Basics/Example-01/)

```java
// Create a superclass.
class A {
    int i, j;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
```

```java
// Create a subclass by extending class A.
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}
```

```java
class SimpleInheritance {
    public static void main(String args []) {
        A superOb = new A();
        B subOb = new B();
        // The superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();
        /* The subclass has access to all public members of
        its superclass. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}
```

##### Output

    Contents of superOb:
    i and j: 10 20
    Contents of subOb:
    i and j: 7 8
    k: 9
    Sum of i, j and k in subOb:
    i+j+k: 24

The subclass `B` includes all of the members of its superclass, `A`. This is why `subOb` can access `i` and `j` and call `showij()`. Also, inside `sum()`, `i` and `j` can be referred to directly, as if they were part of `B`.

Even though `A` is a superclass for `B`, it is also a completely independent, stand-alone class. Being a superclass for a subclass does not mean that the superclass cannot be used by itself. Further, a subclass can be a superclass for another subclass.

Although a subclass includes all of the members of its superclass, it cannot access those
members of the superclass that have been declared as private.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
* [JavaTPoint](https://www.javatpoint.com/inheritance-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/inheritance-in-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=lz1Cx6GzOuc&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=25)

### More Examples and Practice Questions

Provided in the last chapter of current section