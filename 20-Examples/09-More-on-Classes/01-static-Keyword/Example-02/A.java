/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

// Java program to illustrate 
// Initializer Block 
// with super() 

// Child class 
Child class 
class A extends B 
{ 
	A(){ 
		super(); 
		System.out.println("A-Constructor Called"); 
	}
    //initializer block
	{ 
		System.out.println("A-Initializer Block"); 
	}
	
	// main function 
	public static void main(String[] args){ 
		A a = new A(); 
	} 
} 