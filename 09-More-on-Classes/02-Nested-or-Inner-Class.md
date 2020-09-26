># Nested or Inner Class

In Java, it is possible to define a class within another class, such classes are known as nested classes or Inner classes. They enable you to logically group classes that are only used in one place, thus this increases the use of __encapsulation__, and creates more readable and maintainable code.

There are two types of nested classes: static and non-static. A static nested class is one that has the static modifier applied. Because it is static, it must access the non-static members of its enclosing class through an object. That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes are seldom used.

The most important type of nested class is the inner class. An inner class is a non-static nested class. It has access to all of the variables and methods of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.

##### [Example 01](../20-Examples/07-Control-Statements/01-if-Statement/Example-03/)

```java
// Demonstrate an inner class.
class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
```

```java
class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
```

##### Output

    display: outer_x = 100

In the program, an inner class named `Inner` is defined within the scope of class `Outer`. Therefore, any code in class `Inner` can directly access the variable `outer_x`. An instance method named `display()` is defined inside `Inner`. This method displays `outer_x` on the standard output stream. The `main()` method of `InnerClassDemo` creates an instance of class `Outer` and invokes its `test()` method. That method creates an instance of class `Inner` and the `display()` method is called.

It is important to realize that an instance of `Inner` can be created only in the context of class `Outer`. The Java compiler generates an error message otherwise. In general, an inner class instance is often created by code within its enclosing scope, as the example does.

As explained, an inner class has access to all of the members of its enclosing class, but the reverse is not true. Members of the inner class are known only within the scope of the inner class and may not be used by the outer class.

It is also possible to define inner classes within any block scope. For example, you can define a nested class within the block defined by a method or even within the body of a `for` loop

##### [Example 02](../20-Examples/09-More-on-Classes/02-Nested-or-Inner-Class/Example-02/)

```java
// Define an inner class within a for loop.
class Outer{
    int outer_x = 100;
    void test(){
        for(int i=0; i<10; i++){
            class Inner{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
```

```java
class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
```

##### Output

    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100
    display: outer_x = 100

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)
* [JavaTPoint](https://www.javatpoint.com/java-inner-class)
* [GeeksForGeeks Link 1](https://www.geeksforgeeks.org/nested-classes-java/)
* [GeeksForGeeks Link 2](https://www.geeksforgeeks.org/inner-class-java/)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=DZWlO1jCVas&list=PL9DF6E4B45C36D411&index=43)