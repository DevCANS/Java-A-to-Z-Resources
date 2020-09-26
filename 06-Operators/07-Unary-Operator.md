># Unary Operator

Unary operators need only one operand. They are used to increment, decrement or negate a value.

|Operator|Description|
|---|---|
|`–`|Unary minus, used for negating the values.|
|`+`|Unary plus, used for giving positive values. Only used when deliberately converting a negative value to positive.|
|`++`|Increment operator, used for incrementing the value by 1. There are two varieties of increment operator.|
||Post-Increment : Value is first used for computing the result and then incremented.|
||Pre-Increment : Value is incremented first and then result is computed.|
|`--`|Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operator.|
||Post-decrement : Value is first used for computing the result and then decremented.|
||Pre-Decrement : Value is decremented first and then result is computed.|
|`!`|Logical not operator, used for inverting a boolean value.|

##### [Example 01](../20-Examples/06-Operators/07-Unary-Operator/Example-01/)

```java
// Java program to illustrate    
// unary operators    

public class Operators {

	public static void main(String[] args){

		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		boolean condition = true; 

		// pre-increment operator 
		// a = a+1 and then c = a; 
		c = ++a; 
		System.out.println("Value of c (++a) = " + c); 

		// post increment operator 
		// c=b then b=b+1 
		c = b++; 
		System.out.println("Value of c (b++) = " + c); 

		// pre-decrement operator 
		// d=d-1 then c=d 
		c = --d; 
		System.out.println("Value of c (--d) = " + c); 

		// post-decrement operator 
		// c=e then e=e-1 
		c = e--; 
		System.out.println("Value of c (e--) = " + c); 

		// Logical not operator 
		System.out.println("Value of !condition ="
						+ !condition); 
	} 
} 
```

##### Output:

	Value of c (++a) = 21   
	Value of c (b++) = 10   
	Value of c (--d) = 19   
	Value of c (e--) = 40   
	Value of !condition =false