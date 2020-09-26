/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class B extends A {
    void meth() { // ERROR! Can't override.
       System.out.println("Illegal!");
    }
}