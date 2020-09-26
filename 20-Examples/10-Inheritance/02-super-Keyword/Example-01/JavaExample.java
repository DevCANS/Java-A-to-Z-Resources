/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class JavaExample extends ParentClass{
    JavaExample(){
        System.out.println("Constructor of Child");
    }
    JavaExample(String arg){
        super(args);
        System.out.println(args + " passed to constructor of Child");
    }
    void disp(){
        System.out.println("Child Method");
            //Calling the disp() method of parent class
    }
    public static void main(String args[]){
        //Creating the object of child class
	    JavaExample objOne = new JavaExample();
	    objOne.disp();
        JavaExample objTwo = new JavaExample("Arguments");
        objOne.disp();
    }
}