># Lambda Expression Fundamentals

A _lambda expression_ is, essentially, an anonymous (that is, unnamed) method. However, this method is not executed on its own. Instead, it is used to implement a method defined by a functional interface. Thus, a lambda expression results in a form of anonymous class. Lambda expressions are also commonly referred to as _closures_.

__Lambda Expression Syntax__

```java
(argument_list) -> {body} 
```

Java lambda expression is consisted of three components.
* __Argument-list__: It can be empty or non-empty as well.
* __Arrow-token__: It is used to link arguments-list and body of expression.
* __Body__: It contains expressions and statements for lambda expression.

Java defines two types of lambda bodies. One consists of a single expression, and the other type consists of a block of code.

##### Example

```java
() -> 123.45
```

This lambda expression takes no parameters, thus the parameter list is empty. It returns the constant value `123.45`. Therefore, it is similar to the following method:

```java
double myMeth() { return 123.45; }
```

##### Example

```java
() -> Math.random() * 100
```

This lambda expression obtains a pseudo-random value from Math.random( ), multiplies it by 100, and returns the result. It, too, does not require a parameter.

##### Example

```java
(n) -> (n % 2) == 0
```

This lambda expression returns `true` if the value of parameter `n` is even. Although it is possible to explicitly specify the type of a parameter, such as `n` in this case, often you won’t need to do so because in many cases its type can be inferred.

## Functional Interface

A _functional interface_ is an interface that contains one and only one abstract method. An interface method is abstract only if it does not specify a default implementation. Because nondefault interface methods are implicitly `abstract`, there is no need to use the abstract modifier.

##### Example

```java
//Here is an example of a functional interface:
interface MyNumber {
    double getValue();
}
```

In this case, the method `getValue()` is implicitly abstract, and it is the only method defined by `MyNumber`. Thus, `MyNumber` is a functional interface, and its function is defined by `getValue()`.

Now lets create a reference to the functional interface `MyNumber`

```java
// Create a reference to a MyNumber instance.
MyNumber myNum;
```

Next, a lambda expression is assigned to that interface reference:

```java
// Use a lambda in an assignment context.
myNum = () -> 123.45;
```

When a lambda expression occurs in a target type context, an instance of a class is automatically created that implements the functional interface.

When that method is called through the target, the lambda expression is executed. Thus, a lambda expression gives us a way to transform a code segment into an object.

```java
// Call getValue(), which is implemented by the previously assigned
// lambda expression.
System.out.println("myNum.getValue());
```

Because the lambda expression assigned to myNum returns the value `123.45`, that is the value obtained when `getValue()` is called.

__Points to Remember__

* The type and number of the lambda expression’s parameters must be compatible with the method’s parameters.
* The return types must be compatible.
* Any exceptions thrown by the lambda expression must be acceptable to the method.

##### [Example 01](../20-Examples/18-Lambda-Expressions/01-Lambda-Expression-Fundamentals/Example-01/)

```java
// Demonstrate a lambda expression that takes two parameters.
interface NumericTest2 {
    boolean test(int n, int d);
}
```

```java
class LambdaDemo {
    public static void main(String args[]){
        // This lambda expression determines if one number is
        // a factor of another.
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
```

##### Output

    2 is a factor of 10
    3 is not a factor of 10

## Block Lambda Expression

The body of the lambdas shown in the preceding examples consist of a single expression. These types of lambda bodies are referred to as expression bodies, and lambdas that have expression bodies are sometimes called expression lambdas.

Java supports a second type of lambda expression in which the code on the right side of the lambda operator consists of a block of code that can contain more than one statement. This type of lambda body is called a _block body_. Lambdas that have block bodies are sometimes referred to as _block lambdas_.

Aside from allowing multiple statements, block lambdas are used much like the expression lambdas just discussed. One key difference, however, is that you must explicitly use a return statement to return a value.

##### [Example 02](../20-Examples/18-Lambda-Expressions/01-Lambda-Expression-Fundamentals/Example-02/)

```java
// A block lambda that computes the factorial of an int value.
interface NumericFunc {
    int func(int n);
}
```

```java
class BlockLambdaDemo {
    public static void main(String args[]){
        // This block lambda computes the factorial of an int value.
        NumericFunc factorial = (n) -> {
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

    The factorial of 3 is 6
    The factorial of 5 is 120

## External Resources

### Readings

* [JavaTPoinnt](https://www.javatpoint.com/java-lambda-expressions)
* [GeeksForGeeks](https://www.geeksforgeeks.org/lambda-expressions-java-8/)