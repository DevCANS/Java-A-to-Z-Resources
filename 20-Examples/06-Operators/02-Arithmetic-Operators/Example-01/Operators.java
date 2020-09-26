/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

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