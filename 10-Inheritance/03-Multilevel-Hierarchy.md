># Multilevel Hierarchy

In this chapter you will learn more about multilevel hierarchy. It is perfectly acceptable to use a subclass as a superclass of another. For example, given three classes called A, B, and C, C can be a subclass of B, which is a subclass of A. When this type of situation occurs, each subclass inherits all of the traits found in all of its superclasses. In this case, C inherits all aspects of B and A.

##### [Example 01](../20-Examples/10-Inheritance/03-Multilevel-Hierarchy/Example-01/)

```java
// Extend BoxWeight to include shipping costs.
// Start with Box.
class Box {
    private double width;
    private double height;
    private double depth;
    // construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
```

```java
// Add weight.
class BoxWeight extends Box {
    double weight; // weight of box
    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }
    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }
    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
```

```java
// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;
    // construct clone of an object
    Shipment(Shipment ob) { // pass object to constructor
        super(ob);
        cost = ob.cost;
    }
    // constructor when all parameters are specified
    Shipment(double w, double h, double d,
    double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }
    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
```

```java
class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        
        double vol = shipment1.volume();
        
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();

        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
```

##### Output

    Volume of shipment1 is 3000.0
    Weight of shipment1 is 10.0
    Shipping cost: $3.41
    Volume of shipment2 is 24.0
    Weight of shipment2 is 0.76
    Shipping cost: $1.28

Because of inheritance, `Shipment` can make use of the previously defined classes of `Box` and `BoxWeight`, adding only the extra information it needs for its own, specific application. This is part of the value of inheritance; it allows the reuse of code.

This example illustrates one other important point: `super()` always refers to the constructor in the closest superclass. The `super()` in `Shipment` calls the constructor in `BoxWeight`. The `super()` in `BoxWeight` calls the constructor in `Box`. In a class hierarchy, if a superclass constructor requires parameters, then all subclasses must pass those parameters “up the line.” This is true whether or not a subclass needs parameters of its own.

## How Constructors are Executed

In a class hierarchy, constructors complete their execution in order of derivation, from superclass to subclass. Further, since `super()` must be the first statement executed in a subclass’ constructor, this order is the same whether or not `super()` is used. If `super()` is not used, then the default or parameterless constructor of each superclass will be executed.

##### [Example 02](../20-Examples/10-Inheritance/03-Multilevel-Hierarchy/Example-02/)

```java
// Demonstrate when constructors are executed.
// Create a super class.
class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}
```

```java
// Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}
```

```java
// Create another subclass by extending B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}
```

```java
class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
```

##### Output

    Inside A's constructor
    Inside B's constructor
    Inside C's constructor

As you can see, the constructors are executed in order of derivation. Constructors complete their execution in order of derivation. Because a superclass has no knowledge of any subclass, any initialization it needs to perform is separate from and possibly prerequisite to any initialization performed by the subclass. Therefore, it must complete its execution first.