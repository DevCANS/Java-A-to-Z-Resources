># Chained Exceptions and Other Features

The chained exception feature allows you to associate another exception with an exception. This second exception describes the cause of the first exception. For example, imagine a situation in which a method throws an ArithmeticException because of an attempt to divide by zero. However, the actual cause of the problem was that an I/O error occurred, which caused the divisor to be set improperly. Although the method must certainly throw an ArithmeticException, since that is the error that occurred, you might also want to let the calling code know that the underlying cause was an I/O error. Chained exceptions let you handle this, and any other situation in which layers of exceptions exist.

To allow chained exceptions, two constructors and two methods were added to `Throwable`.

```java
Throwable(Throwable causeExc)
Throwable(String msg, Throwable causeExc)
```

In the first form, `causeExc` is the exception that causes the current exception. That is, `causeExc` is the underlying reason that an exception occurred. The second form allows you to specify a description at the same time that you specify a cause exception. These two constructors have also been added to the `Error`, `Exception`, and `RuntimeException` classes.

The chained exception methods supported by `Throwable` are `getCause()` and `initCause()`.

```java
Throwable getCause( )
Throwable initCause(Throwable causeExc)
```
The `getCause()` method returns the exception that underlies the current exception. If there is no underlying exception, null is returned. The `initCause()` method associates `causeExc` with the invoking exception and returns a reference to the exception.

You can associate a cause with an exception after the exception has been created. However, the cause exception can be set only once. Thus, you can call `initCause()` only once for each exception object. Furthermore, if the cause exception was set by a constructor, then you can’t set it again using `initCause()`.

##### [Example 01](../20-Examples/13-Exception-Handling/07-Chained-Exception-and-Other-Features/Example-01/)

```java
// Demonstrate exception chaining.
class ChainExcDemo {
    static void demoproc() {
        // create an exception
        NullPointerException e = new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " +
            e.getCause());
        }
    }
}
```

##### Output

    Caught: java.lang.NullPointerException: top layer
    Original cause: java.lang.ArithmeticException: cause

In this example, the top-level exception is `NullPointerException`. To it is added a cause exception, `ArithmeticException`. When the exception is thrown out of `demoproc()`, it is caught by `main()`. There, the top-level exception is displayed, followed by the underlying exception, which is obtained by calling `getCause()`.

## try-with-resources

A resource is an object that must be closed once your program is done using it. For example, a File resource or JDBC resource for a database connection or a Socket connection resource. Before Java 7, there was no auto resource management and we should explicitly close the resource once our work is done with it.

The `try-with-resources` statement automatically closes all the resources at the end of the statement. 

```java
try (resource declaration) {
  // use of the resource
} catch (ExceptionType e1) {
  // catch block
}
```

##### [Example 02](../20-Examples/13-Exception-Handling/07-Chained-Exception-and-Other-Features/Example-02/)

```java
import java.io.*;

class Main {
  public static void main(String[] args) {
    String line;
    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    }
  }
}
```

##### Output
Output if the test.txt file is not found.

    IOException in try-with-resources block =>test.txt (No such file or directory)

Output if the test.txt file is found.

    Entering try-with-resources block
    Line =>test line


### try-with-resources with multiple resources

We can declare more than one resource in the `try-with-resources` statement by separating them with a semicolon `;`

##### [Example 03](../20-Examples/13-Exception-Handling/07-Chained-Exception-and-Other-Features/Example-03/)

```java
import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws IOException{
    try (Scanner scanner = new Scanner(new File("testRead.txt")); 
      PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
      while (scanner.hasNext()) {
        writer.print(scanner.nextLine());
      }
    }
  }
}
```

## Multi-catch

The `multi-catch` feature allows two or more exceptions to be caught by the same catch clause. 

To use a `multi-catch`, separate each exception type in the `catch` clause with the `OR` operator. Each `multi-catch` parameter is implicitly `final`.

```java
try{
    // your code
}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
    // process exception
}
```

##### [Example 04](../20-Examples/13-Exception-Handling/07-Chained-Exception-and-Other-Features/Example-04/)

```java
// Demonstrate the multi-catch feature.
class MultiCatch {
    public static void main(String args[]) {
        int a=10, b=0;
        int vals[] = { 1, 2, 3 };
        try {
            int result = a / b; // generate an ArithmeticException
            // vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
            // This catch clause catches both exceptions.
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch.");
    }
}
```

The program will generate an `ArithmeticException` when the division by zero is attempted. If you comment out the division statement and remove the comment symbol from the next line, an `ArrayIndexOutOfBoundsException` is generated. Both exceptions are caught by the single catch statement.

## External Resources

### Readings

* [Oracle Tutorials - Chained Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/chained.html)
* [Oracle Tutorials - try-with-resources](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)
* [GeeksForGeeks - multi-catch](https://www.geeksforgeeks.org/multicatch-in-java/?ref=lbp)

### More Examples and Practice Questions and Quizes

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/questions.html)
* [JavaTPoint Quiz 1](https://www.javatpoint.com/directload.jsp?val=89)
* [JavaTPoint Quiz 2](https://www.javatpoint.com/directload.jsp?val=96)
* [JavaTPoint Quiz 3](https://www.javatpoint.com/directload.jsp?val=101)
* [GeeksForGeeks](https://www.geeksforgeeks.org/output-java-program-set-12exception-handling/)