># Ternary Operator

Ternary operator is a shorthand version of if-else statement. It has three operands and hence the name ternary. General format is:

	condition ? if-true : if-false

The above statement means that if the condition evaluates to true, then execute the statements after the `?` else execute the statements after the `:`.

##### [Example 01](../20-Examples/06-Operators/06-Ternary-Operator/Example-01/)

```java

// Java program to illustrate    
// max of three numbers using    
// ternary operator.    
public class Operators {

	public static void main(String[] args){ 
		int a = 20, b = 10, c = 30, result; 

		// result holds max of three 
		// numbers 
		result = ((a > b) 
					? (a > c) 
							? a 
							: c 
					: (b > c) 
							? b 
							: c); 
		System.out.println("Max of three numbers = "
						+ result); 
	} 
} 
```

##### Output:
        
	Max of three numbers = 30

## External Resources

### Youtube Videos

* [Alex Lee](https://www.youtube.com/watch?v=ln_vMXXXeDI&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=23)