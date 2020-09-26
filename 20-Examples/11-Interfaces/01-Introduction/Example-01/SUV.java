/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

public class SUV implements Car{

    // implementing behaviours of the interface Car
    public void start(){
        System.out.println("SUV started");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }

    public void stop(){
        System.out.println("SUV is stopped");
    }

    public static void main(String[] args){
        SUV suv = new SUV();

        suv.start();
        suv.accelerate();
        suv.stop();
    }
}