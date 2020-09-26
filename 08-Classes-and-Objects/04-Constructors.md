># Constructors

A constructor initializes an object immediately upon creation. It has the same name as the class in which it resides and is syntactically similar to a method. Once defined, the constructor is automatically called when the object is created, before the `new` operator completes.

Typically, you will use a constructor to give initial values to the instance variables defined by the class, or to perform any other start-up procedures required to create a fully formed object.

All classes have constructors, whether you define one or not, because Java automatically provides a default constructor that initializes all member variables. However, once you define your own constructor, the default constructor is no longer used.

__Syntax__

```java
class MyClass{
   // Membr variables...

   //This is the constructor
   MyClass(){
   }
   
   // Methods...
}
```

Constructors look a little strange because they have no return type, not even void. This is because the implicit return type of a class’ constructor is the class type itself.

##### [Example 01](../20-Examples/08-Classes-and-Objects/04-Constructors/Example-01/)

```java
/* Here, Box uses a constructor to initialize the
dimensions of a box.
*/
class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
```

```java
class BoxDemo {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
```

##### Output

    Constructing Box
    Constructing Box
    Volume is 1000.0
    Volume is 1000.0

## Default Constructor

If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf. This constructor is known as default constructor. You would not find it in your source code(the java file) as it would be inserted into the code during compilation and exists in .class file.

If you implement any constructor then you no longer receive a default constructor from Java compiler.

## Parameterized Constructor

While the `Box()` constructor in the preceding example does initialize a Box object, it is not very useful - all boxes have the same dimensions. You need is a way to construct Box objects of various dimensions. To do this you need to put parameters in constructors.

##### [Example 02](../20-Examples/08-Classes-and-Objects/04-Constructors/Example-02/)

```java
/* Here, Box uses a parameterized constructor to
initialize the dimensions of a box.
*/
class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
```

```java
class BoxDemo {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
```

##### Output

    Volume is 3000.0
    Volume is 162.0

The values `10`, `20`, and `15` are passed to the `Box()` constructor when `new` creates the object. Thus, `mybox1`’s copy of `width`, `height`, and `depth` will contain the values `10`, `20`, and `15`, respectively.

## The `this` Keyword

Sometimes a method will need to refer to the object that invoked it. To allow this, Java defines the `this` keyword. `this` can be used inside any method to refer to the current object. That is, `this` is always a reference to the object on which the method was invoked. You can use `this` anywhere a reference to an object of the current class’ type is permitted.

```java
// A redundant use of this.
Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
}
```

This version of `Box()` operates exactly like the earlier version.

As you know, it is illegal in Java to declare two local variables with the same name inside the same or enclosing scopes. Interestingly, you can have local variables, including formal parameters to methods, which overlap with the names of the class’ instance variables. However, when a local variable has the same name as an instance variable, the local variable hides the instance variable.

Because `this` lets you refer directly to the object, you can use it to resolve any namespace collisions that might occur between instance variables and local variables. In the above example, the version of `Box()`, which uses `width`, `height`, and `depth` for parameter names and then uses `this` to access the instance variables by the same name

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
* [JavaTPoint](https://www.javatpoint.com/java-constructor)
* [GeeksForGeeks](https://www.geeksforgeeks.org/constructors-in-java/)
* [Beginners Book](https://beginnersbook.com/2013/03/constructors-in-java/)
* [JavaTPoint - 'this' Keyword](https://www.javatpoint.com/this-keyword)
* [GeeksForGeeks - 'this' Keyword](https://www.geeksforgeeks.org/this-reference-in-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=0Jc_rT7t1W8&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=19)
* [Cave of Programming](https://www.youtube.com/watch?v=oSiN1J_G01Q&list=PL9DF6E4B45C36D411&index=18)
* [Alex Lee](https://www.youtube.com/watch?v=G1Iln3PSrUg&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=4)