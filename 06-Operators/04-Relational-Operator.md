# Relational Operators

These operators are used to check for relations like equality, greater than, less than. They return boolean result after the comparison and are extensively used in looping statements as well as conditional if else statements. General format is,


__variable__   relation_operator _value_ 

Some of the relational operators are-

* __==, Equal to__ : returns true of left hand side is equal to right hand side.

* __!=, Not Equal to__ : returns true of left hand side is not equal to right hand side.

* __<, less than__ : returns true of left hand side is less than right hand side.

* __<=, less than or equal to__ : returns true of left hand side is less than or equal to right hand side.

* __'>' Greater than__ : returns true of left hand side is greater than right hand side.

* __'>=', Greater than or equal to__ : returns true of left hand side is greater than or equal to right hand side.

##### Example

```java
// Java program to illustrate 

// relational operators 

public class operators { 

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