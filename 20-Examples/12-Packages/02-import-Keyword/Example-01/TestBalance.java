/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

import MyPack.*;
class TestBalance {
    public static void main(String args[]) {
        /* 
        * Because Balance is public, you may use Balance 
        * class and call its constructor. 
        */
        Balance test = new Balance("J. J. Jaspers", 99.88);

        test.show(); // you may also call show()
    }
}