># 'super' Keyword

There will be times when you will want to create a superclass will keep the details of its implementation to itself (that is, that keeps its data members private). In this case, there would be no way for a subclass to directly access or initialize these variables on its own. Since encapsulation is a primary attribute of OOP, it is not surprising that Java provides a solution to this problem. Whenever a subclass needs to refer to its immediate superclass, it can do so by use of the keyword `super`.

## Calling Superclass Constructor

When an object of subclass is created the child class constructor is called which calls the parent class constructor automatically. The call to the parent class constructor is the first thing that is executed inside parent class constructor.

A subclass can call a constructor defined by its superclass by use of the following form of super:

```java
super(arg-list);
```

##### [Example 01](../20-Examples/10-Inheritance/02-super-Keyword/Example-01/)

```java
class ParentClass{
    //Parent class constructor
    ParentClass(){
        System.out.println("Constructor of Parent");
    }

    ParentClass(String arg){
        System.out.println(args + " passed to constructor of parent as argument.");
    }

    void disp(){
        System.out.println("Parent Method");
    }
}
```

```java
class JavaExample extends ParentClass{
    JavaExample(){
        System.out.println("Constructor of Child");
    }
    JavaExample(String arg){
        super(args);
        System.out.println(args + " passed to constructor of Child");
    }
    void disp(){
        System.out.println("Child Method");
            //Calling the disp() method of parent class
    }
    public static void main(String args[]){
        //Creating the object of child class
	    JavaExample objOne = new JavaExample();
	    objOne.disp();
        JavaExample objTwo = new JavaExample("Arguments");
        objOne.disp();
    }
}
```

##### Output

    Constructor of Parent
    Constructor of Child
    Child Method
    Arguments passed to constructor of parent as argument.
    Arguments passed to constructor of Child
    Child Method


## Accessing Members of Superclass

The second form of `super` acts somewhat like this, except that it always refers to the superclass of the subclass in which it is used. This usage has the following general form:

```java
super.member
```

This second form of super is most applicable to situations in which member names of a subclass hide members by the same name in the superclass.

##### [Example 02](../20-Examples/10-Inheritance/02-super-Keyword/Example-02/)

```java
// Using super to overcome name hiding.
class A {
    int i;
}
```

```java
// Create a subclass by extending class A.
class B extends A {
    int i; // this i hides the i in A
    B(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
```

```java
class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
```

##### Output

    i in superclass: 1
    i in subclass: 2

Although the instance variable `i` in `B` hides the `i` in `A`, super allows access to the `i` defined in the superclass.

Methods of superclass can also be accessed in the same way.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/super.html)
* [JavaTPoint](https://www.javatpoint.com/super-keyword)
* [GeeksForGeeks](https://www.geeksforgeeks.org/super-keyword/)

### More Examples and Practice Questions

Provided in the last chapter of current section.