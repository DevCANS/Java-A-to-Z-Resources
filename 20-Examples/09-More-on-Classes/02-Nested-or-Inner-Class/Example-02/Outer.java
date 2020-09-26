/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

// Define an inner class within a for loop.
class Outer{
    int outer_x = 100;
    void test(){
        for(int i=0; i<10; i++){
            class Inner{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}