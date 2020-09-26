/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class JavaExample{
    static int num;
    static String mystr;
    //static initializer block
    static{
        num = 97;
        mystr = "Static keyword in Java";
    }

    public static void main(String args[]){
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }
}