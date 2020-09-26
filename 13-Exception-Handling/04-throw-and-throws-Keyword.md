># 'throw' and 'throws' Keyword

## throw

The `throw` keyword is used to throw an exception explicitly. Only object of `Throwable` class or its sub classes can be thrown. Program execution stops on encountering `throw` statement, and the closest `catch` statement is checked for matching type of exception.

```java
throw ThrowableInstance
```

Here, `ThrowableInstance` must be an object of type `Throwable` or a subclass of `Throwable`. Primitive types, such as `int` or `char`, as well as non-Throwable classes, such as `String` and `Object`, cannot be used as exceptions. There are two ways you can obtain a Throwable object: using a parameter in a `catch` clause or creating one with the `new` operator.

##### [Example 01](../20-Examples/13-Exception-Handling/04-throw-and-throws-Keyword/Example-01/)

```java
// Demonstrate throw.
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
```

This program gets two chances to deal with the same error. First, `main()` sets up an exception context and then calls `demoproc()`. The `demoproc()` method then sets up another exception-handling context and immediately throws a new instance of `NullPointerException`, which is caught on the next line. The exception is then rethrown.

##### Output

    Caught inside demoproc.
    Recaught: java.lang.NullPointerException: demo


The program also illustrates how to create one of Java’s standard exception objects.

```java
throw new NullPointerException("demo");
```

Here, `new` is used to construct an instance of `NullPointerException`. Many of Java’s built-in run-time exceptions have at least two constructors: one with no parameter and one that takes a string parameter. When the second form is used, the argument specifies a string that describes the exception. This string is displayed when the object is used as an argument to `print()` or `println()`. It can also be obtained by a call to `getMessage()`, which is defined by `Throwable`.

## throws

The throws keyword is used to declare the list of exception that a method may throw during execution of program. Any method that is capable of causing exceptions must list all the exceptions possible during its execution, so that anyone calling that method gets a prior knowledge about which exceptions are to be handled. A method can do so by using the throws keyword.

```java
type methodName(parameter_list) throws exception_list{
    // body of method
}
```

Here, exception-list is a comma-separated list of the exceptions that a method can throw.

##### [Example 02](../20-Examples/13-Exception-Handling/04-throw-and-throws-Keyword/Example-02/)

```java
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
```

##### Output

    inside throwOne
    caught java.lang.IllegalAccessException: demo


## throw VS throws

|throw|throws|
|-----|------|
|Used to explicitly throw an exception|Used to declare an exception|
|Checked exceptions cannot be propagated using throw only|Checked exceptions can be propagated|
|followed by an instance of Throwable class or one of its sub-classes|followed by one or more Exception class names separated by commas|
|used within a method|used with method signature (method declaration)|
|Cannot throw multiple exceptions|can declare multiple exceptions (separated by commas) using throws keyword|

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html)
* JavaTPoint
  * [throw](https://www.javatpoint.com/throw-keyword)
  * [Exception Propagation](https://www.javatpoint.com/exception-propagation)
  * [throws](https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=5pPPtRtCBHw&list=PL9DF6E4B45C36D411&index=35)

### More Examples and Practice Questions

Provided in the last chapter of this section