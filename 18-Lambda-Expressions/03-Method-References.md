># Method References

A method reference provides a way to refer to a method without executing it. It relates to lambda expressions because it, too, requires a target type context that consists of a compatible functional interface.

## Method Reference to static Methods

To create a static method reference, use this general syntax:

```java
ClassName::methodName
```

##### [Example 01]((../20-Examples/18-Lambda-Expressions/03-Method-References/Example-01/))

```java
// Demonstrate a method reference for a static method.

// A functional interface for string operations.
interface StringFunc {
    String func(String n);
}
```

```java
// This class defines a static method called strReverse().
class MyStringOps {
    // A static method that reverses a string.
    static String strReverse(String str) {
        String result = "";
        int i;
        
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        
        return result;
    }
}
```

```java
class MethodRefDemo {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including a method reference.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String args[]){
        String inStr = "Lambdas add power to Java";
        String outStr;
        // Here, a method reference to strReverse is passed to stringOp().
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
```

##### Output

    Original string: Lambdas add power to Java
    String reversed: avaJ ot rewop dda sadbmaL

Here, a reference to the static method `strReverse()`, declared inside `MyStringOps`, is passed as the first argument to `stringOp()`. This works because strReverse is compatible with the `StringFunc` functional interface. Thus, the expression `MyStringOps::strReverse` evaluates to a reference to an object in which strReverse provides the implementation of `func()` in `StringFunc`.

## Method References to Instance Methods

To pass a reference to an instance method on a specific object, use this basic syntax:

```java
objRef::methodName
```

##### [Example 02](../20-Examples/18-Lambda-Expressions/03-Method-References/Example-02/)

```java
// Demonstrate a method reference to an instance method
// A functional interface for string operations.
interface StringFunc {
    String func(String n);
}
```

```java
// Now, this class defines an instance method called strReverse().
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
```

```java
class MethodRefDemo {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including method references.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]){
        String inStr = "Lambdas add power to Java";
        String outStr;
        // Create a MyStringOps object.
        MyStringOps strOps = new MyStringOps();
        // Now, a method reference to the instance method strReverse
        // is passed to stringOp().
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
```

##### Output

    Original string: Lambdas add power to Java
    String reversed: avaJ ot rewop dda sadbmaL

In the program, `strReverse()` is now an instance method of `MyStringOps`. Inside `main()`, an instance of `MyStringOps` called `strOps` is created. This instance is used to create the method reference to `strReverse` in the call to `stringOp`, as shown again, here:

```java
outStr = stringOp(strOps::strReverse, inStr);
```

One other point: you can refer to the superclass version of a method by use of super, as shown here:

```java
super::name
```

## Constructor References

Similar to the way that you can create references to methods, you can create references to constructors. Here is the general form of the syntax that you will use:

```java
classname::new
```

##### [Example 03](../20-Examples/18-Lambda-Expressions/03-Method-References/Example-03/)

```java
// Demonstrate a Constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClass reference.
interface MyFunc {
    MyClass func(int n);
}
```

```java
class MyClass {
    private int val;
    // This constructor takes an argument.
    MyClass(int v) { 
        val = v;
    }
    // This is the default constructor.
    MyClass() {
        val = 0;
    }
    // ...
    int getVal(){
        return val;
    };
}
```

```java
class ConstructorRefDemo{
    public static void main(String args[]){
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyFunc myClassCons = MyClass::new;
        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);
        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}
```

##### Output

    val in mc is 100

In the program, notice that the `func()` method of `MyFunc` returns a reference of type `MyClass` and has an int parameter. Next, notice that `MyClass` defines two constructors. The first specifies a parameter of type `int`. The second is the default, parameterless constructor.

## External Resources

### Readings

* [Jenkov Tutorial](http://tutorials.jenkov.com/java/lambda-expressions.html)
* [Beginners Book](https://beginnersbook.com/2017/10/method-references-in-java-8/)