# Relational Operators

These operators are used to check for relations like equality, greater than, less than. They return boolean result after the comparison and are extensively used in looping statements as well as conditional if else statements. General format is,

	variable relation_operator value; 

Some of the relational operators are:

|Operator|Operator Name|Description|
|---|---|---|
|`==`|Equal to|Returns true of left hand side is equal to right hand side.|
|`!=`|Not equal to|Returns true of left hand side is not equal to right hand side.|
|`<`|Less than|Returns true of left hand side is less than right hand side.|
|`<=`|Less than or equal to|Returns true of left hand side is less than or equal to right hand side.|
|`>`|Greater than|Returns true of left hand side is greater than right hand side.|
|`>=`|Greater than or equal to|Returns true of left hand side is greater than or equal to right hand side.|

##### [Example 01](../20-Examples/06-Operators/04-Relational-Operator/Example-01)

```java
// Java program to illustrate 

// relational operators 

public class Operators { 

	public static void main(String[] args){
		int a = 20, b = 10; 
		String x = "Thank", y = "Thank"; 
		int ar[] = { 1, 2, 3 }; 
		int br[] = { 1, 2, 3 }; 
		boolean condition = true; 

		// various conditional operators 
		System.out.println("a == b :" + (a == b)); 
		System.out.println("a < b :" + (a < b)); 
		System.out.println("a <= b :" + (a <= b)); 
		System.out.println("a > b :" + (a > b)); 
		System.out.println("a >= b :" + (a >= b)); 
		System.out.println("a != b :" + (a != b)); 

		// Arrays cannot be compared with 
		// relational operators because objects 
		// store references not the value 
		System.out.println("x == y : " + (ar == br)); 

		System.out.println("condition==true :"
						+ (condition == true)); 
	} 
} 
```

##### Output:

	a == b :false   
	a < b :false   
	a <= b :false   
	a > b :true   
	a >= b :true   
	a != b :true   
	x == y : false   
	condition==true :true

## External Resources

* [Alex Lee](https://www.youtube.com/watch?v=jRdPsDjW8DY&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=11)