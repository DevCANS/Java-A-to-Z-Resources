 /**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

// Java program to illustrate    
// max of three numbers using    
// ternary operator.    
public class operators {

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