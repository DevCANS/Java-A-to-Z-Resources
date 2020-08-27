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

    public class Main{
        /*
        * My first Java program
        */
        public static void main(String[] args){
            System.out.println("Hello World"); // prints Hello World
        }
    }