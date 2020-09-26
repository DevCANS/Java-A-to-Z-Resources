># Built-in Exceptions and Custom Exceptions

Inside the standard package java.lang, Java defines several exception classes. A few have been used by the preceding examples. The most general of these exceptions are subclasses of the standard type RuntimeException. As previously explained, these exceptions need not be included in any method’s throws list. In the language of Java, these are called unchecked exceptions because the compiler does not check to see if a method handles or throws these exceptions.

|Exception|Meaning|
|---|---|
|`ArithmeticException`|Arithmetic error, such as divide-by-zero.|
|`ArrayIndexOutOfBoundsException`|Array index is out-of-bounds.|
|`ArrayStoreException`|Assignment to an array element of an incompatible type.|
|`ClassCastException`|Invalid cast.|
|`EnumConstantNotPresentException`|An attempt is made to use an undefined enumeration value.|
|`IllegalArgumentException`|llegal argument used to invoke a method.|
|`IllegalMonitorStateException`|Illegal monitor operation, such as waiting on an unlocked thread.|
|`IllegalStateException`|Environment or application is in incorrect state.|
|`IllegalThreadStateException`|Requested operation not compatible with current thread state.|
|`IndexOutOfBoundsException`|Some type of index is out-of-bounds.|
|`NegativeArraySizeException`|Array created with a negative size.|
|`NullPointerException`|Invalid use of a null reference.|
|`NumberFormatException`|Invalid conversion of a string to a numeric format.|
|`SecurityException`|Attempt to violate security.|
|`StringIndexOutOfBounds`|Attempt to index outside the bounds of a string.|
|`TypeNotPresentException`|Type not found.|
|`UnsupportedOperationException`|An unsupported operation was encountered.|


Those exceptions defined by java.lang that must be included in a method’s throws list if that method can generate one of these exceptions and does not handle it itself. These are called checked exceptions.

|Exception|Meaning|
|---|---|
|`ClassNotFoundException`|Class not found.|
|`CloneNotSupportedException`|Attempt to clone an object that does not implement the Cloneable interface.|
|`IllegalAccessException`|Access to a class is denied.|
|`InstantiationException`|Attempt to create an object of an abstract class or interface.|
|`InterruptedException`|One thread has been interrupted by another thread.|
|`NoSuchFieldException`|A requested field does not exist.|
|`NoSuchMethodException`|A requested method does not exist.|
|`ReflectiveOperationException`|Superclass of reflection-related exceptions.|

## Custom Exceptions

In java we can create our own exception class and throw that exception using throw keyword. These exceptions are known as user-defined or custom exceptions. This is quite easy to do: just define a subclass of Exception (which is, of course, a subclass of Throwable).

The Exception class does not define any methods of its own. It does, of course, inherit those methods provided by Throwable. Thus, all exceptions, including those that you create, have the methods defined by Throwable available to them.

### Creating Custom Exceptions

* Create a new class whose name should end with `Exception` like `ClassNameException`. This is a convention to differentiate an exception class from regular ones.
* Make the class extends one of the exceptions which are subtypes of the `java.lang.Exception` class. Generally, a custom exception class always extends directly from the `Exception` class.
* Create a constructor with a `String` parameter which is the detail message of the exception. In this constructor, simply call the super constructor and pass the message.
* Sometimes it is better to override `toString()`. The version of `toString()` defined by `Throwable` (and inherited by `Exception`) first displays the name of the exception followed by a colon, which is then followed by your description. By overriding `toString()`, you can prevent the exception name and colon from being displayed. This makes for a cleaner output, which is desirable in some cases.

##### [Example 01](../20-Examples/13-Exception-Handling/06-Built-in-Exceptions-and-Custom-Exceptions/Example-01/)

```java
// This program creates a custom exception type.
class MyException extends Exception {
    private int detail;
    
    public MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
```

```java 
class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }
}
```

This example defines a subclass of Exception called `MyException`. This subclass is quite simple: It has only a constructor plus an overridden `toString()` method that displays the value of the exception.

##### Output

    Called compute(1)
    Normal exit
    Called compute(20)
    Caught MyException[20]

## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/custom-exception)
* [GeeksForGeeks](https://www.geeksforgeeks.org/g-fact-32-user-defined-custom-exception-in-java/)

### More Examples and Practice Questions

Provided in the last chapter of this section