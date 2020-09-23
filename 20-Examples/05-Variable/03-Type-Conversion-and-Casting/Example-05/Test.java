 /**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

//Java program to illustrate Type promotion in Expressions 

class Test{
	public static void main(String args[]){

		byte b = 42; 
		char c = 'a'; 
		short s = 1024; 
		int i = 50000; 
		float f = 5.67f; 
		double d = .1234; 
		
		// The Expression 
		double result = (f * b) + (i / c) - (d * s); 
		
		//Result after all the promotions are done 
		System.out.println("result = " + result); 
	}
}