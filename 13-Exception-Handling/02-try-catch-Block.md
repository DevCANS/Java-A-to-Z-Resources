># try-catch Block

A method catches an exception using a combination of the try and catch keywords. A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code, and the syntax for using try/catch looks like the following −

```java
try {
   // Protected code
} catch (ExceptionName e1) {
   // Catch block
}
```

The part of code which can throw an exception is put inside try block. Immediately following the try block, include a catch clause that specifies the exception type that you wish to catch.

##### [Example 01](../20-Examples/13-Exception-Handling/02-try-catch-block/Example-01/)

```java
class Exc2 {
    public static void main(String args[]) {
        int d, a;
        try { // monitors a block of code.
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) { // catch divide-by-zero error
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}
```

##### Output

    Division by zero.
    After catch statement.

Notice that the call to println( ) inside the try block is never executed. Once an exception is thrown, program control transfers out of the try block into the catch block. Put differently, catch is not “called,” so execution never “returns” to the try block from a catch. Thus, the line "This will not be printed." is not displayed. Once the catch statement has executed, program control continues with the next line in the program following the entire try/catch mechanism.

## Displaying a Description of an Exception

`Throwable` overrides the `toString()` method (defined by `Object`) so that it returns a string containing a description of the exception. You can display this description in a `println()` statement by simply passing the exception as an argument. For example, the `catch` block in the preceding program can be rewritten like this:

```java
catch (ArithmeticException e) {
    System.out.println("Exception: " + e);
    a = 0; // set a to zero and continue
}
```
When this version is substituted in the program, and the program is run, each divide-by-zero error displays the following message:

    Exception: java.lang.ArithmeticException: / by zero

While it is of no particular value in this context, the ability to display a description of an exception is valuable in other circumstances—particularly when you are experimenting with exceptions or when you are debugging.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/exceptions/handling.html)
* [JavaTPoint](https://www.javatpoint.com/try-catch-block)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=YCalEDpu2oA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=36)
* [Cave of Programming](https://www.youtube.com/watch?v=yqwQQnUW3p8&list=PL9DF6E4B45C36D411&index=34)
* [Alex Lee](https://www.youtube.com/watch?v=ceGnVDrMy1A&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=12)

#### More Examples and Practice Questions

Provided in the last chapter of this section