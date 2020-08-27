># Strings

Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. You will learn more about arrays in comming sections.

#### Creating a String

The most basic way of creating a string is

    String str = "Hello World";

As with any other objects in Java Strings can also created using 'new' keyword

    public class StringExample{
        public static void main(String[] args){
            // creating character array
            char[] arr = {'h','e','l','l','o'};
            // creating a String object
            String str = new String(arr);
            System.out.println(str);
        }
    }

#### Output

    hello

You will learn about Onjects and 'new' keyword in Objects and Classes section.

#### Some String Methods

##### Lenght of String

    String str = "Hello World";
    int len = str.length();
    System.out.println();

##### Output

    11

##### Concatenating two strings

    String str1 = "Hello";
    String str2 = "World";

    String str3 = str1.concat(str2);
    
    System.out.println(str3);
    System.out.println(str1 + str2);
    System.out.println("Hello".concat(str2));
    System.out.println("Hello" + "World");


##### Output

    HelloWorld
    HelloWorld
    HelloWorld
    HelloWorld


##### To get character at given index

Since a String is internally a character array index starts with 0

    String str = "Hello World";
    System.out.println(str.charAt(0));
    System.out.println(str.cahrtAt(6));

##### Output

    H
    W

># External Resources

[Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/data/strings.html)
[JavaTPoint](https://www.javatpoint.com/java-string)

### More Examples and Practice Questions

[W3Resources](https://www.w3resource.com/java-exercises/string/index.php) Solve Questions 1, 2, 7, 11, 12, 13 and 14

If you are confident enough you can try solving other questions also.
