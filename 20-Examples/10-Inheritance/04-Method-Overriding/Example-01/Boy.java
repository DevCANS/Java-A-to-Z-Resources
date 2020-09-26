/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class Boy extends Human{
    //Overriding method
    public void eat(){
       System.out.println("Boy is eating");
    }
 
    public static void main( String args[]) {
       Boy obj = new Boy();
       //This will call the child class version of eat()
       obj.eat();
    }
}