># Arithmetic Operators

 They are used to perform simple arithmetic operations on primitive data types.

|Operator|Description|
|---|---|
|`*`|Multiplication|
|`/`|Division|
|`%`|Modulo|
|`+`|Addition|
|`–`|Subtraction|

##### [Example 01](../20-Examples/06-Operators/02-Arithmetic-Operators/Example-01/)

```java
// Java program to illustrate 

// arithmetic operators 

public class Operators { 

	public static void main(String[] args){

		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		String x = "Thank", y = "You"; 

		// + and - operator 
		System.out.println("a + b = " + (a + b)); 
		System.out.println("a - b = " + (a - b)); 

		// + operator if used with strings 
		// concatenates the given strings. 
		System.out.println("x + y = " + x + y); 

		// * and / operator 
		System.out.println("a * b = " + (a * b)); 
		System.out.println("a / b = " + (a / b)); 

		// modulo operator gives remainder 
		// on dividing first operand with second 
		System.out.println("a % b = " + (a % b)); 

		// if denominator is 0 in division 
		// then Arithmetic exception is thrown. 
		// uncommenting below line would throw 
		// an exception 
		// System.out.println(a/c); 
	} 
} 
```

##### Output:

	a + b = 30   
	a - b = 10   
	x + y = ThankYou   
	a * b = 200  
	a / b = 2  
	a % b = 0

## External Resources

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=ss7BtLrbxp4&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=6)