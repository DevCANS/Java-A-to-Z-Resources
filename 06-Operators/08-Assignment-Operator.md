# Assignment Operator

 ‘ __=__ ’ Assignment operator is used to assign a value to any variable. It has a right to left associativity, i.e value given on right hand side of operator is assigned to the variable on the left and therefore right hand side value must be declared before using it or should be a constant.

General format of assignment operator is,

__variable = value;__   


In many cases assignment operator can be combined with other operators to build a shorter version of statement called Compound Statement   

For example, instead of a = a+5, we can write a += 5.

* __' += '__, for adding left operand with right operand and then assigning it to variable on the left.

* __' -= '__, for subtracting left operand with right operand and then assigning it to variable on the left.

* __' *= '__, for multiplying left operand with right operand and then assigning it to variable on the left.

* __' /= '__, for dividing left operand with right operand and then assigning it to variable on the left.

* __' %= '__, for assigning modulo of left operand with right operand and then assigning it to variable on the left.
```java
int a = 5;   
a += 5; //a = a+5;
```

##### Example

```java
// Java program to illustrate    
// assignment operators    

public class operators {

	public static void main(String[] args){
		int a = 20, b = 10, c, d, e = 10, f = 4, g = 9; 

		// simple assignment operator 
		c = b; 
		System.out.println("Value of c = " + c); 

		// This following statement would throw an exception 
		// as value of right operand must be initialised 
		// before assignment, and the program would not 
		// compile. 
		// c = d; 

		// instead of below statements, shorthand 
		// assignment operators can be used to 
		// provide same functionality. 
		a = a + 1; 
		b = b - 1; 
		e = e * 2; 
		f = f / 2; 
		System.out.println("a, b, e, f = " + a + ", "
						+ b + ", " + e + ", " + f); 
		a = a - 1; 
		b = b + 1; 
		e = e / 2; 
		f = f * 2; 

		// shorthand assignment operator 
		a += 1; 
		b -= 1; 
		e *= 2; 
		f /= 2; 
		System.out.println("a, b, e, f ("
						+ "using shorthand operators)= "
						+ a + ", " + b + ", "
						+ e + ", " + f); 
	}
}
```

##### Output:

	Value of c = 10   
	a, b, e, f = 21, 9, 20, 2   
	a, b, e, f (using shorthand operators)= 21, 9, 20, 2