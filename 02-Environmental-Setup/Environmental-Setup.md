># Java Installation

##  For Windows

__Step 1__ Download Java SE 8 and install the setup file from [here](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)

__Step 2__ Assuming you have installed Java in `C:\Program Files\java\jdk` directory

* For Windows 8 and above
  * Right-click on 'This PC' and select 'Properties'.
  * In the menu present at the left of the window click on 'Advanced system settings'
  * In the Advanced tab of 'System Properties' window Click 'Environment Variables'
  * In the 'System Variables' select the variable named 'Path' and click on 'Edit'
  * Now click 'Browse' and then select the directory `C:\Program Files\java\jdk\bin'`
* For Windows 7
  * Right-click on 'My Computer' and select 'Properties'.
  * In the menu present at the left of the window click on 'Advanced system settings'
  * Click the 'Environment variables' button under the 'Advanced' tab.
  * Now, alter the 'Path' variable so that it also contains the path to the Java executable. Example, if the path is currently set to `C:\WINDOWS\SYSTEM32`, then change your path to read `C:\WINDOWS\SYSTEM32;C:\Program Files\java\jdk\bin`.

__Verify installation__
Open Command Prompt and run the following command

    java -version

The result will be something like this

    java version "1.8.0_221"
    Java(TM) SE Runtime Environment (build 1.8.0_221-b11)
    Java HotSpot(TM) 64-Bit Server VM (build 25.221-b11, mixed mode) 


## Installing Open JDK 8 on Debian or Ubuntu Systems

Open Terminal and follow the steps

__Update repositories__

    sudo apt-get update

__Install OpenJDK__

    sudo apt-get install openjdk-8-jdk

__Verify the version of JDK__

    java -version

The result will be something like this

    openjdk version "1.8.0_242"
    OpenJDK Runtime Environment (build 1.8.0_242-b09)
    OpenJDK 64-Bit Server VM (build 25.242-b09, mixed mode)

## Hello World program using Java

The first step to learn any programming language is to write a "Hello World" program. Below is a small program which will print "Hello World" in the console.

##### [Example 01](../20-Examples/02-Environmental-Setup/Example-01/)

```java
public class Main{
    /*
    * My first Java program
    */
    public static void main(String[] args){
        System.out.println("Hello World"); // prints Hello World
    }
}
```

Here, `public` is an access modifier which tells that the class/method/variable is accessible from anywhere in the program.

`class` is a keyword used to define a class which is the most basic level of encapsulation.

`main` method should always be declared `public static void` which means it is accessible from anywhere (public), can be called without instantiating the object of `Main` class (static) and its return type is void.

`String[] args`: Java main method. accepts a single argument of type String array. This is also called Java command line arguments.

`System.out.println("Hello World")` will print Hello World in console/terminal.

A Java program should be saved with same name as of the class or interface. Here, the name of the class is `Main` so the file name should be Main.java.

The compiler will try to find the `main` method in the Main class if it is not found, the compiler will throw an error.

To compile the program open cammand prompt/terminal in the working directory and run the following command.

    javac Main.java

The general form of this command is

    javac ClassName.java

The java file name is same as the class name

To run the program type:

    java Main

General form:

    java ClassName

##### Output

    Hello World

## External Resources

### Youtube Videos
* [Installation](https://www.youtube.com/watch?v=IJ-PJbvJBGs)