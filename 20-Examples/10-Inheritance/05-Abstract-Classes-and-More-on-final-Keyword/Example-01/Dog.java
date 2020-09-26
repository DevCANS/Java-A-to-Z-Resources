/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

//Dog class extends Animal class
public class Dog extends Animal{

    public void sound(){
     System.out.println("Woof");
    }
    public static void main(String args[]){
     Animal obj = new Dog();
     obj.sound();
    }
}