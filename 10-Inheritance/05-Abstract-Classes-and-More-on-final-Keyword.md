># Abstract Classes and More on 'final' Keyword

## Abstract Class

An abstract class is a class that is declared abstract using the `abstract` keyword. It may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

Sometimes you will need to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method. That is, sometimes you will want to create a superclass that only defines a generalized form that will be shared by all of its subclasses, leaving it to each subclass to fill in the details. Such a class determines the nature of the methods that the subclasses must implement.

To declare an abstract class, use this general form:

```java
abstract class ClassName
```

An abstract class can have an abstract method as well as concrete methods. Abstract methods have no implementation in the superclass. It is the responsibility of the subclass to implement the method. Abstract method in superclass can be declared using this general form:

```java
abstract return_type name(parameter_list);
```

##### [Example 01](../20-Examples/10-Inheritance/05-Abstract-Classes-and-More-on-final-Keyword/Example-01/)

```java
//abstract parent class
abstract class Animal{
   //abstract method
   public abstract void sound();
}
```

```java
//Dog class extends Animal class
public class Dog extends Animal{

   public void sound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
   }
}
```

##### Output

    Woof


## Using 'final' Keyword with Inheritance

While method overriding is one of Java’s most powerful features, there will be times when you will want to prevent it from occurring. To disallow a method from being overridden, specify `final` as a modifier at the start of its declaration. Methods declared as final cannot be overridden.

##### [Example 02](../20-Examples/10-Inheritance/05-Abstract-Classes-and-More-on-final-Keyword/Example-02/)

```java
class A {
   final void meth() {
      System.out.println("This is a final method.");
   }
}
```

```java
class B extends A {
   void meth() { // ERROR! Can't override.
      System.out.println("Illegal!");
   }
}
```

Because `meth()` is declared as final, it cannot be overridden in `B`. If you attempt to do so, a compile-time error will result.

## Using final to Prevent Inheritance

Sometimes you will want to prevent a class from being inherited. To do this, precede the class declaration with final. Declaring a class as final implicitly declares all of its methods as final, too. As you might expect, it is illegal to declare a class as both abstract and final since an abstract class is incomplete by itself and relies upon its subclasses to provide complete implementations.

```java
final class A {
   //...
}
// The following class is illegal.
class B extends A { // ERROR! Can't subclass A
   //...
}
```

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
* [JavaTPoint](https://www.javatpoint.com/abstract-class-in-java)
* [GeeksForGeeks - Abstract Classes](https://www.geeksforgeeks.org/abstract-classes-in-java/)
* [GeeksForGeeks - abstract Keyword](https://www.geeksforgeeks.org/abstract-keyword-in-java/?ref=rp)
* [GeeksForGeeks - final Keyword](https://www.geeksforgeeks.org/final-keyword-java/?ref=rp)

### Youtube Videos

* [ProgrammmingKnowledge](https://www.youtube.com/watch?v=vcN_mXHPXVA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=28)
* [Cave of Programming](https://www.youtube.com/watch?v=CUC522qMGe8&list=PL9DF6E4B45C36D411&index=38)

### More Examples and Practice Questions

Provided in the last chapter of current section.