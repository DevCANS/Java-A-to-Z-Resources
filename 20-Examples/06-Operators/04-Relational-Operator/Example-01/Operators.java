/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

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