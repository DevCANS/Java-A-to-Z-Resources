># Loops

## while Loops

The `while` loop is Java’s most fundamental loop statement. It repeats a statement or block while its controlling expression is true. Here is its general form:

```java
while(condition) {
    // body of loop
}
```

The condition can be any `Boolean` expression. The body of the loop will be executed as long as the conditional expression is true. When condition becomes false, control passes to the next line of code immediately following the loop.

##### [Example 01](../20-Examples/07-Control-Statements/03-Loops/Example-01/)

```java
// Demonstrate the while loop.
class While {
    public static void main(String args[]) {
        int n = 10;
        while(n > 0) {
            System.out.println("tick " + n);
            n--;
        }
    }
}
```

##### Output

    tick 10
    tick 9
    tick 8
    tick 7
    tick 6
    tick 5
    tick 4
    tick 3
    tick 2
    tick 1

Since the `while` loop evaluates its conditional expression at the top of the loop, the body of the loop will not execute even once if the condition is false to begin with.

## do-while Loop

sometimes it is desirable to execute the body of a loop at least once, even if the conditional expression is false to begin with. In other words, there are times when you would like to test the termination expression at the end of the loop rather than at the beginning. The `do-while` loop always executes its body at least once, because its conditional expression is at the bottom of the loop. Its general form is:

```java
do {
    // body of loop
} while (condition);
```

Each iteration of the `do-while` loop first executes the body of the loop and then evaluates the conditional expression. If this expression is true, the loop will repeat. Otherwise, the loop terminates.

##### [Example 02](../20-Examples/07-Control-Statements/03-Loops/Example-02/)

```java
// Demonstrate the do-while loop.
class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("tick " + n);
            n--;
        } while(n > 0);
    }
}
```

##### Output

    tick 10
    tick 9
    tick 8
    tick 7
    tick 6
    tick 5
    tick 4
    tick 3
    tick 2
    tick 1

The do-while loop is especially useful when you process a menu selection, because you will usually want the body of a menu loop to execute at least once.

## for Loop

The general form of the traditional for statement:

```java
for(initialization; condition; iteration) {
    // body
}
```

It consists of four parts:

* __Initialization__: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
* __Condition__: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
* __Body__: The statement of the loop is executed each time until the second condition is false.
* __Iteration__: It increments or decrements the variable value. It is an optional condition.

##### [Example 03](../20-Examples/07-Control-Statements/03-Loops/Example-03/)

```java
// Demonstrate the for loop.
class ForTick {
    public static void main(String args[]) {
        int n;
        for(n=10; n>0; n--)
            System.out.println("tick " + n);
    }
}
```

##### Output

    tick 10
    tick 9
    tick 8
    tick 7
    tick 6
    tick 5
    tick 4
    tick 3
    tick 2
    tick 1

### Declaring Loop Control Variables Inside the for Loop

Often the variable that controls a `for` loop is needed only for the purposes of the loop and is not used elsewhere. When this is the case, it is possible to declare the variable inside the initialization portion of the `for`.

##### [Example 04](../20-Examples/07-Control-Statements/03-Loops/Example-04/)

```java
// Declare a loop control variable inside the for.
class ForTick {
    public static void main(String args[]) {
        // here, n is declared inside of the for loop
        for(int n=10; n>0; n--)
            System.out.println("tick " + n);
    }
}
```

### Multiple Initialization

There will be times when you will want to include more than one statement in the initialization and iteration portions of the `for` loop. To allow two or more variables to control a `for` loop, Java permits you to include multiple statements in both the initialization and iteration portions of the `for`. Each statement is separated from the next by a comma.

##### [Example 05](../20-Examples/07-Control-Statements/03-Loops/Example-05/)

```java
// Using the comma.
class Comma {
    public static void main(String args[]) {
        int a, b;
        for(a=1, b=4; a<b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
```

##### Output

    a = 1
    b = 4
    a = 2
    b = 3

## for-each Loop

A `for-each` style loop is designed to cycle through a collection of objects, such as an array, in strictly sequential fashion, from start to finish.

Java adds the `for-each` capability by enhancing the `for` statement. The advantage of this approach is that no new keyword is required, and no preexisting code is broken. The `for-each` style of `for` is also referred to as the enhanced `for` loop.

__Syntax__:

```java
for(type itrVar : collection) 
    statement-block
```

Here, `type` specifies the data type and `itrVar` specifies the name of an iteration variable that will receive the elements from a collection, one at a time, from beginning to end. The collection being cycled through is specified by collection.

##### [Example 06](../20-Examples/07-Control-Statements/03-Loops/Example-06/)

```java
// Use a for-each style for loop.
class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        // use for-each style for to display and sum the values
        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
```

##### Output

    Value is: 1
    Value is: 2
    Value is: 3
    Value is: 4
    Value is: 5
    Value is: 6
    Value is: 7
    Value is: 8
    Value is: 9
    Value is: 10
    Summation: 55

As this output shows, the `for-each` style for automatically cycles through an array in sequence from the lowest index to the highest.

## External Resources

### Readings

* Oracle Tutorials
  * [while and do-while Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
  * [for and for-each Loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
* JavaTPoint
  * [while Loop](https://www.javatpoint.com/java-while-loop)
  * [do-while Loop](https://www.javatpoint.com/java-do-while-loop)
  * [for Loop](https://www.javatpoint.com/java-for-loop)
  * [for-each Loop](https://www.javatpoint.com/for-each-loop)
* Biginners Book
  * [while Loop](https://beginnersbook.com/2015/03/while-loop-in-java-with-examples/)
  * [do-while Loop](https://beginnersbook.com/2015/03/do-while-loop-in-java-with-example/)
  * [for Loop](https://beginnersbook.com/2015/03/for-loop-in-java-with-example/)

### Youtube Videos

* ProgrammingKnowledge
  * [while Loop](https://www.youtube.com/watch?v=apW3UWr_dhA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=11)
  * [do-while Loop](https://www.youtube.com/watch?v=xwvdENKCkLg&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=12)
  * [for Loop](https://www.youtube.com/watch?v=z-QgsXkYqjc&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=14)
* Cave of Programming
  * [while Loop](https://www.youtube.com/watch?v=vnAYHVwrO4c&list=PL9DF6E4B45C36D411&index=4)
  * [do-while Loop](https://www.youtube.com/watch?v=EjSIHm6azO0&list=PL9DF6E4B45C36D411&index=8)
  * [for Loop](https://www.youtube.com/watch?v=42QGewg7AU4&list=PL9DF6E4B45C36D411&index=5)
* Alex Lee
  * [while Loop](https://www.youtube.com/watch?v=SGJ9DpxGCkY&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=13)
  * [for Loop](https://www.youtube.com/watch?v=3jMaKlNBjug&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=16)

### More Examples and Practice Questions

* [BeginWithJava](http://www.beginwithjava.com/java/loops/questions.html)
* [GeeksForGeeks](https://www.geeksforgeeks.org/output-java-programs-set-40-loop/)
* [CodesDope](https://www.codesdope.com/practice/java-loop-loop-loop/)