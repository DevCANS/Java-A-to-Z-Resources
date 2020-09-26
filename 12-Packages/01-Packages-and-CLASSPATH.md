># Packages and CLASSPATH

## Packages
Packages are used in Java in order to prevent naming conflicts, to control access, to make searching/locating and usage of classes, interfaces, enumerations and annotations easier, etc. Packages provide a unique identifier to classes so that no name conflict occurs. The package is both a naming and a visibility control mechanism. You can define classes inside a package that are not accessible by code outside that package.

### Defining a Package
To create a package is quite easy: simply include a `package` command as the first statement in a Java source file. Any classes declared within that file will belong to the specified package.

This is the general form of the package statement:

```java
package pkg;
```

Here, `pkg` is the name of the package

It is a good practice to group related classes implemented by you so that a programmer can easily determine that the classes, interfaces, enumerations, and annotations are related.

Since the package creates a new namespace there won't be any name conflicts with names in other packages. Using packages, it is easier to provide access control and it is also easier to locate the related classes.

##### [Example 01](../20-Examples/12-Packages/01-Packages-and-CLASSPATH/Example-01/animals/)

```java
/* File name : Animal.java */
package animals;

interface Animal {
   public void eat();
   public void travel();
}
```
Now, let us implement the above interface in the same package animals −

```java
package animals;
/* File name : MammalInt.java */

public class MammalInt implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
} 
```

Now to compile the program use the command

    javac -d . Animal.java MammalInt.java

To run the program use the fully qualified name

    java animals.MammalInt

##### Output

    Mammal eats
    Mammal travels

Now a package/folder with the name `animals` will be created in the current directory and these class files will be placed in it.

How does the Java run-time system know where to look for packages that you create? The answer has three parts. First, by default, the Java run-time system uses the current working directory as its starting point. Thus, if your package is in a subdirectory of the current directory, it will be found. Second, you can specify a directory path or paths by setting the `CLASSPATH` environmental variable. Third, you can use the -classpath option with java and javac to specify the path to your classes.

For example,

```java
package MyPack
```

In order for a program to find `MyPack`, one of three things must be true. Either the program can be executed from a directory immediately above `MyPack`, or the CLASSPATH must be set to include the path to MyPack, or the `-classpath` option must specify the path to `MyPack` when the program is run via java.
When the second two options are used, the class path must not include `MyPack`, itself. It must simply specify the path to `MyPack`. For example, in a Windows environment, if the path to `MyPack` is

    C:\MyPrograms\Java\MyPack

then the class path to `MyPack` is

    C:\MyPrograms\Java

## External Resources

### Readings

* [Oracel Tutorials](https://docs.oracle.com/javase/tutorial/java/package/index.html)
* [JavaTPoint](https://www.javatpoint.com/package)
* [GeeksForGeeks - Packages](https://www.geeksforgeeks.org/packages-in-java/)
* [GeeksForGeeks - CLASSPATH](https://www.geeksforgeeks.org/classpath-in-java/)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=BT5Nk2aIRJg&list=PL9DF6E4B45C36D411&index=24)