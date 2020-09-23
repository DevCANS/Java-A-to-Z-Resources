/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

public class StringMethods{
    public static void main(String[] args) {
        String str = "Hello World";
        int len = str.length();
        System.out.println("Length of string is " + len);

        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1.concat(str2);

        System.out.println(str3);
        System.out.println(str1 + str2);
        System.out.println("Hello".concat(str2));
        System.out.println("Hello" + "World");

        String str4 = "Hello World";
        System.out.println(str4.charAt(0));
        System.out.println(str4.cahrtAt(6));

    }
}