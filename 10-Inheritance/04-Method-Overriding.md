># Method Overriding

In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.

When a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass.

##### Example 01

```java
class Human{
   //Overridden method
   public void eat(){
      System.out.println("Human is eating");
   }
}
```

```java
class Boy extends Human{
   //Overriding method
   public void eat(){
      System.out.println("Boy is eating");
   }

   public static void main( String args[]) {
      Boy obj = new Boy();
      //This will call the child class version of eat()
      obj.eat();
   }
}
```

##### Output

    Boy is eating

As you can see the method `eat()` has an implementation in `Human`. The subclass `Boy` also have its own implementation of `eat()` which overrides or hides the superclass implementation. When an object of `Boy` is created and `eat()` is called the method implemented by `Boy` is called.

Method overriding is one of the way by which java achieve __Run Time Polymorphism__.The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.

## Rules of Method Overriding

* __Access modifier__: Access modifier of overriden method can be changed to less protected from parent class. For example if a method is `protected` can be changed to `public` but not `private`.
* __Final methods can not be overridden__
* __Static methods can not be overridden (Method Overriding vs Method Hiding)__: When you define a static method with same signature as a static method in base class, it is known as method hiding.
* __Private methods can not be overridden__
* __The overriding method must have same return type (or subtype)__
* __Invoking overridden method from sub-class__: You can call parent class method from the overriden method using `super` keyword.
* __Cannot override constructors__
* __Overriding and synchronized/strictfp method__: The presence of synchronized/strictfp modifier with method have no effect on the rules of overriding, i.e. it’s possible that a synchronized/strictfp method can override a non synchronized/strictfp one and vice-versa.
* __Overriding and Exception Handling__:
  *  If the super-class overridden method does not throw an exception, subclass overriding method can only throws the unchecked exception, throwing checked exception will lead to compile-time error. 
  *  If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.

## Dynamic Method Dispatch

Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.

__Note__: A superclass reference variable can refer to a subclass object.

When an overridden method is called through a superclass reference, Java determines which version of that method to execute based upon the type of the object being referred to at the time the call occurs.

In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.

##### [Example 02](../20-Examples/10-Inheritance/04-Method-Overriding/Example-02/)

```java
// Dynamic Method Dispatch
class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}
```

```java
class B extends A {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
```

```java
class C extends A {
    // override callme()
    void callme() {
        System.out.println("Inside C's callme method");
    }
}
```

```java
class Dispatch {
    public static void main(String args[]) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C
        A r; // obtain a reference of type A
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme
        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }
}
```

##### Output

    Inside A's callme method
    Inside B's callme method
    Inside C's callme method

As the output shows, the version of `callme()` executed is determined by the type of object being referred to at the time of the call. Had it been determined by the type of the reference variable, `r`, you would see three calls to A’s `callme()` method.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/override.html)
* [JavaTPoint](https://www.javatpoint.com/method-overriding-in-java)
* [GeeksForGeeks (Method Overriding)](https://www.geeksforgeeks.org/overriding-in-java/)
* [GeeksForGeeks (Dynamic Method Dispatch)](https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=rVSlCg2ttZ0&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=27)
* [Cave of Programming](https://www.youtube.com/watch?v=wzW-251bGgM&list=PL9DF6E4B45C36D411&index=22)

### More Examples and Practice Questions

Provided in the last chapter of the current section.