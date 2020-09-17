># Automatic Type Promotion

In addition to assignments, there is another place also where a certain type conversions may occur, in expressions. To see why, consider this. In an expression, the precision required of an intermediate value will sometimes exceed the range of either the operand. For example, try the following expression :

```java
byte  a = 40;

byte  b = 50;

byte  c = 100;

int  d = a * b / c;
```

The output of the intermediate term, `a * b` easily exceeds the range of either of its `byte` operands.

To handle this type of problem, Java automatically promotes each `byte`, `short`, or `char` operand to `int` when evaluating an expression. It means that the subexpression `a * b` is performed using integers, not `bytes`. Thus, `2000`, the result of the intermediate expression, `50 * 40`, is legal even though `a` and `b` both are specified as type `byte`.

As useful as the automatic promotions are, they can cause confusing compile-time errors also. For example, this seemingly correct code causes a problem :

```java
byte b = 50;

b = b * 2;      // Error! Can't assign an int to a byte!
```

The code is attempting to store `50*2`, an absolutely valid `byte` value, back into a `byte` variable. However, because the operands were automatically promoted to an `int` when the expression was evaluated, the result has also been promoted to `int`. Therefore, the result of the expression is now of type `int`, which cannot be assigned to a `byte` without the use of a cast. This is true even if, as in this case, the value being assigned would still fit in the target type.


In case where you understand the effect of overflow, you should use an explicit cast, such as

```java
byte b = 50;

b = (byte) (b * 2);
```

which yields the correct value of `100`.

## External Resources

#### More Examples and Practice Questions

* [CodesDope](https://www.codesdope.com/practice/java-operators/)
* [GeeksForGeeks - Quiz 1](https://www.geeksforgeeks.org/output-java-programs-set-21-type-conversions/?ref=lbp)
* [GeeksForGeeks - Quiz 2](https://www.geeksforgeeks.org/output-java-programs-set-45-static-instance-variables/)