># Jump Statements

Java supports three jump statements: `break`, `continue`, and `return`. These statements transfer control to another part of your program.

## break Statement

In Java, the `break` statement has three uses.

* It terminates a statement sequence in a `switch` statement. 
* It can be used to exit a loop.
* It can be used as a “civilized” form of goto.

### Using break to Exit a Loop

`break` Statement is a loop control statement which is used to terminate the loop. As soon as the `break` statement is encountered from within a loop, the loop iterations stops there and control returns from the loop immediately to the first statement after the loop.

##### [Example 01](../20-Examples/07-Control-Statements/04-Jump-Statements/Example-01/)

```java
// Using break to exit a loop.
class BreakLoop {
    public static void main(String args[]) {
        for(int i=0; i<100; i++) {
            if(i == 10) 
                break; // terminate loop if i is 10
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
```

##### Output

    i: 0
    i: 1
    i: 2
    i: 3
    i: 4
    i: 5
    i: 6
    i: 7
    i: 8
    i: 9
    Loop complete.

The `break` statement can be used with any of Java’s loops, including intentionally infinite loops.

When used inside a set of nested loops, the `break` statement will only break out of the innermost loop.

### Using break as a Form of Goto

By using this form of `break`, you can, for example, break out of one or more blocks of code. These blocks need not be part of a loop or a `switch`. They can be any block. Further, you can specify precisely where execution will resume, because this form of `break` works with a label.

##### [Example 02](../20-Examples/07-Control-Statements/04-Jump-Statements/Example-02/)

```java
// Using break as a civilized form of goto.
class Break {
    public static void main(String args[]) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) 
                        break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
```

##### Output

    Before the break.
    This is after second block.

##### [Example 03](../20-Examples/07-Control-Statements/04-Jump-Statements/Example-03/)

```java
// Using break to exit from nested loops
class BreakLoop {
    public static void main(String args[]) {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) 
                    break outer; // exit both loops
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete.");
    }
}
```

##### Output

    Pass 0: 0 1 2 3 4 5 6 7 8 9 Loops complete.

## continue Statement

Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration.

The `continue` statement performs such an action. In `while` and `do-while` loops, a continue statement causes control to be transferred directly to the conditional expression that controls the loop. In a `for` loop, control goes first to the iteration portion of the `for` statement and then to the conditional expression.

##### [Example 04](../20-Examples/07-Control-Statements/04-Jump-Statements/Example-04/)

```java
// Demonstrate continue.
class Continue {
    public static void main(String args[]) {
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0)
                continue;
            System.out.println("");
        }
    }
}
```

##### Output

    0 1
    2 3
    4 5
    6 7
    8 9

As with the `break` statement, `continue` may specify a label to describe which enclosing loop to continue.

##### [Example 05](../20-Examples/07-Control-Statements/04-Jump-Statements/Example-05/)

```java
// Using continue with a label.
class ContinueLabel {
    public static void main(String args[]) {
        outer: for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
```

##### Output

    0
    0 1
    0 2 4
    0 3 6 9
    0 4 8 12 16
    0 5 10 15 20 25
    0 6 12 18 24 30 36
    0 7 14 21 28 35 42 49
    0 8 16 24 32 40 48 56 64
    0 9 18 27 36 45 54 63 72 81

## External Sources

### Readings

* JavaTPoint
  * [break](https://www.javatpoint.com/java-break)
  * [continue](https://www.javatpoint.com/java-continue)
* Beginners Book
  * [break](https://beginnersbook.com/2017/08/java-break-statement/)
  * [continue](https://beginnersbook.com/2017/08/java-continue-statement/)
* GeeksForGeeks
  * [break](https://www.geeksforgeeks.org/break-statement-in-java/)
  * [continue](https://www.geeksforgeeks.org/break-and-continue-statement-in-java/)