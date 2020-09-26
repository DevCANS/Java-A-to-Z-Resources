># `switch`

A switch statement allows a variable to be tested for equality against a list of values. Each value is called a `case`, and the variable being switched on is checked for each case. As such, it often provides a better alternative than a large series of `if-else-if` statements. Here is the general form of a switch statement:

```java
switch (expression) {
    case value1:
        // statement sequence
        break;
    case value2:
        // statement sequence
        break;
    .
    .
    .
    case valueN :
        // statement sequence
        break;
    default:
        // default statement sequence
}
```

Each value specified in the `case` statements must be a unique constant expression (such as a literal value). Duplicate `case` values are not allowed. The type of each value must be compatible with the type of expression.

The `break` statement is used inside the switch to terminate a statement sequence. When a `break` statement is encountered, execution branches to the first line of code that follows the entire `switch` statement.

If none of the constants matches the value of the expression, then the `default` statement is executed. However, the `default` statement is optional. If no `case` matches and no `default` is present, then no further action is taken.

##### [Example 01](../20-Examples/07-Control-Statements/02-switch/Example-01/)

```java
// A simple example of the switch.
class SampleSwitch {
    public static void main(String args[]) {
        for(int i=0; i<6; i++)
        switch(i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
            case 3:
                System.out.println("i is three.");
                break;
            default:
                System.out.println("i is greater than 3.");
        }
    }
}
```

##### Output

    i is zero.
    i is one.
    i is two.
    i is three.
    i is greater than 3.
    i is greater than 3.

The `break` statement is optional. If you omit the `break`, execution will continue on into the next `case`. It is sometimes desirable to have multiple cases without `break` statements between them.

##### [Example 02](../20-Examples/07-Control-Statements/02-switch/Example-02/)

```java
class Switch {
    public static void main(String args[]) {
        int month = 3;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Month";
        }
        System.out.println("April is in the " + season + ".");
    }
}
```

##### Output

    March is in the Spring

You can use a `switch` as part of the statement sequence of an outer `switch`. This is called a
nested `switch`. Since a `switch` statement defines its own block, no conflicts arise between the `case` constants in the inner `switch` and those in the outer `switch`.

In summary, there are three important features of the `switch` statement to note:

* The `switch` differs from the `if` in that `switch` can only test for equality, whereas `if` can evaluate any type of `Boolean` expression. That is, the `switch` looks only for a match between the value of the expression and one of its `case` constants.
* No two `case` constants in the same `switch` can have identical values. Of course, a `switch` statement and an enclosing outer `switch` can have `case` constants in common.
* A `switch` statement is usually more efficient than a set of nested `if`s

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
* [JavaTPoint](https://www.javatpoint.com/java-switch)
* [GeeksForGeeks](https://www.geeksforgeeks.org/switch-statement-in-java/)
* [Biginners Book](https://beginnersbook.com/2017/08/java-switch-case/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=L5_7XQR0r0w&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=10)
* [Cave of Programming](https://www.youtube.com/watch?v=oLpUfseieuE&list=PL9DF6E4B45C36D411&index=9)
* [Alex Lee](https://www.youtube.com/watch?v=O4KGYGQvHmw&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=8)