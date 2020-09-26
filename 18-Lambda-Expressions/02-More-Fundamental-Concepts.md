># More Lambda Expression Funtamentals

## Generic Functional Interfaces

A lambda expression, itself, cannot specify type parameters. Thus, a lambda expression cannot be generic.

Because of type inference, all lambda expressions exhibit some “generic-like” qualities.

However, the functional interface associated with a lambda expression can be generic. In this case, the target type of the lambda expression is determined, in part, by the type argument or arguments specified when a functional interface reference is declared.

##### [Example 01](../20-Examples/18-Lambda-Expressions/02-More-Fundamental-Concepts/Example-01/)

```java
// Use a generic functional interface with lambda expressions.
// A generic functional interface.
interface SomeFunc<T> {
    T func(T t);
}
```

```java
class GenericFunctionalInterfaceDemo {
    public static void main(String args[]){
        // Use a String-based version of SomeFunc.
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
        
        // Now, use an Integer-based version of SomeFunc.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i <= n; i++)
            result = i * result;
            return result;
        };
        
        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
    }
}
```

##### Output

    Lambda reversed is adbmaL
    Expression reversed is noisserpxE
    The factoral of 3 is 6
    The factoral of 5 is 120

Here, `T` specifies both the return type and the parameter type of `func()`. This means that it is compatible with any lambda expression that takes one parameter and returns a value of the same type.

## Passing Lambda Expression as Arguments

To pass a lambda expression as an argument, the type of the parameter receiving the lambda expression argument must be of a functional interface type compatible with the lambda.

##### [Example 02](../20-Examples/18-Lambda-Expressions/02-More-Fundamental-Concepts/Example-02/)

```java
// Use lambda expressions as an argument to a method.
interface StringFunc {
    String func(String n);
}
```

```java
class LambdasAsArgumentsDemo {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed a reference to
    // any instance of that interface, including the instance created
    // by a lambda expression.
    // The second parameter specifies the string to operate on.
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String args[]){
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Here is input string: " + inStr);
        
        // Here, a simple expression lambda that uppercases a string
        // is passed to stringOp( ).
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);
        
        // This passes a block lambda that removes spaces.
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for(i = 0; i < str.length(); i++)
            if(str.charAt(i) != ' ')
            result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("The string with spaces removed: " + outStr);
        
        // Of course, it is also possible to pass a StringFunc instance
        // created by an earlier lambda expression. For example,
        // after this declaration executes, reverse refers to an
        // instance of StringFunc.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
                return result;
        };
        // Now, reverse can be passed as the first parameter to stringOp()
        // since it refers to a StringFunc object.
        System.out.println("The string reversed: " + stringOp(reverse, inStr));
    }
}
```

##### Output

    Here is input string: Lambdas add power to Java
    The string in uppercase: LAMBDAS ADD POWER TO JAVA
    The string with spaces removed: LambdasaddpowertoJava
    The string reversed: avaJ ot rewop dda sadbmaL

## Lambda Expression and Exceptions

A lambda expression can throw an exception. However, it if throws a checked exception, then that exception must be compatible with the exception(s) listed in the throws clause of the abstract method in the functional interface.

##### [Example 03](../20-Examples/18-Lambda-Expressions/02-More-Fundamental-Concepts/Example-03/)

```java
// Throw an exception from a lambda expression.
interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}
```

```java
class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}
```

```java
class LambdaExceptionDemo {
    public static void main(String args[]) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };
        // This block lambda computes the average of an array of doubles.
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if(n.length == 0)
            throw new EmptyArrayException();
            for(int i=0; i < n.length; i++)
            sum += n[i];
            return sum / n.length;
        };
        
        System.out.println("The average is " + average.func(values));
        // This causes an exception to be thrown.
        System.out.println("The average is " + average.func(new double[0]));
    }
}
```

##### Output

    The average is 2.5
    Exception in thread "main" EmptyArrayException: Array Empty
            at LambdaExceptionDemo.lambda$main$0(LambdaExceptionDemo.java:15)
            at LambdaExceptionDemo.main(LambdaExceptionDemo.java:23) 

The first call to `average.func()` returns the value 2.5. The second call, which passes a zero-length array, causes an `EmptyArrayException` to be thrown. Remember, the inclusion of the throws clause in `func()` is necessary. Without it, the program will not compile because the lambda expression will no longer be compatible with `func()`.

## Lambda Expression and Variable Capture

A Java lambda expression is capable of accessing variables declared outside the lambda function body under certain circumstances. For example, a lambda expression can use an instance or static variable defined by its enclosing class.

When a lambda expression uses a local variable from its enclosing scope, a special situation is created that is referred to as a variable capture. In this case, a lambda expression may only use local variables that are effectively final.

An effectively final variable is one whose value does not change after it is first assigned. There is no need to explicitly declare such a variable as final, although doing so would not be an error.

Java lambdas can capture the following types of variables:
* Local Variables
* Instance Variables
* Static Variables

##### Example 04

```java
// An example of capturing a local variable from the enclosing scope.
interface MyFunc {
    int func(int n);
}
```

```java
class VarCapture {
    public static void main(String args[]){
        // A local variable that can be captured.
        int num = 10;
        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = num + n;
            // However, the following is illegal because it attempts
            // to modify the value of num.
            // num++;
            return v;
        };
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        // num = 9;
    }
}
```

If `num` were to be modified, either inside the lambda or outside of it, `num` would lose its effectively final status. This would cause an error, and the program would not compile.

## External Resources

### Readings

* [Jenkov Tutorials](http://tutorials.jenkov.com/java/lambda-expressions.html)