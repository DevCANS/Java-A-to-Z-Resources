 /**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Himanshu Gaur
 * 
 */

public class EmpDemo {
	public static void main(String args[]){
		// accessing static variable without object
		Emp.salary = 1000;
		System.out.println(Emp.name + "'s average salary:" + Emp.salary);
	}
}