 /**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

public class Test{
	public static void main(String args[]){
		{ 
			// The variable x has scope within 
			// brackets 
			int x = 10; 
			System.out.println(x); 
		} 
		
		// Uncommenting below line would produce 
		// error since variable x is out of scope. 

		// System.out.println(x); 
	} 
}