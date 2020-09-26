/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

class VarCapture {
    public static void main(String args[]){
        // A local variable that can be captured.
        int num = 10;
        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = num + n;
            // However, the following is illegal because it attempts
            // to modify the value of num.
            // num++;
            return v;
        };
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        // num = 9;
    }
}