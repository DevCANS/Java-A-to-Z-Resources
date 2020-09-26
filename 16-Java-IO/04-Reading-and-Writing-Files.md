># Reading and Writing Files

Two of the most often-used stream classes are `FileInputStream` and `FileOutputStream`, which create byte streams linked to files. To open a file, you simply create an object of one of these classes, specifying the name of the file as an argument to the constructor. Although both classes support additional constructors, the following are the forms that we will be using:

```java
FileInputStream(String fileName) throws FileNotFoundException
FileOutputStream(String fileName) throws FileNotFoundException
```

`FileNotFoundException` is thrown. For output streams, if the file cannot be opened or created, then `FileNotFoundException` is thrown. `FileNotFoundException` is a subclass of `IOException`. When an output file is opened, any preexisting file by the same name is destroyed.

When you are done with a file, you must close it. This is done by calling the `close()` method, which is implemented by both `FileInputStream` and `FileOutputStream`. It is shown here:

```java
void close( ) throws IOException
```

Closing a file releases the system resources allocated to the file, allowing them to be used by another file. Failure to close a file can result in “memory leaks” because of unused resources remaining allocated.

## Reading a File

##### [Example 01](../20-Examples/16-Java-IO/04-Reading-and-Writing-Files/Example-01/)

```java
/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
*/
import java.io.*;
class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        // First, confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        // Attempt to open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error Reading File");
        }
        // Close the file.
        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("Error Closing File");
        }
    }
}
```

Although the preceding example closes the file stream after the file is read, there is a variation that is often useful. The variation is to call `close()` within a `finally` block. In this approach, all of the methods that access the file are contained within a `try` block, and the `finally` block is used to close the file. This way, no matter how the `try` block terminates, the file is closed.

```java
try {
    do {
        i = fin.read();
        if(i != -1)
            System.out.print((char) i);
    } while(i != -1);
} catch(IOException e) {
    System.out.println("Error Reading File");
} finally {
    // Close file on the way out of the try block.
    try {
        fin.close();
    } catch(IOException e) {
        System.out.println("Error Closing File");
    }
}
```

Sometimes it’s easier to wrap the portions of a program that open the file and access the file within a single `try` block (rather than separating the two) and then use a `finally` block to close the file.

To write to a file, you can use the write( ) method defined by FileOutputStream. Its simplest form is shown here:

## Writing a File

To write to a file, you can use the `write()` method defined by `FileOutputStream`. Its simplest form is shown here:

```java
void write(int byteval) throws IOException
```

##### [Example 02](../20-Examples/16-Java-IO/04-Reading-and-Writing-Files/Example-02/)

```java
/* Copy a file.
To use this program, specify the name
of the source file and the destination file.
For example, to copy a file called FIRST.TXT
to a file called SECOND.TXT, use the following
command line.
java CopyFile FIRST.TXT SECOND.TXT
*/
import java.io.*;
class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        // First, confirm that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        // Copy a File.
        try {
        // Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) 
                    fout.write(i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if(fin != null) 
                    fin.close();
            } catch(IOException e2) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) 
                    fout.close();
            } catch(IOException e2) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
```

In the program, notice that two separate `try` blocks are used when closing the files. This ensures that both files are closed, even if the call to `fin.close()` throws an exception.

Files can be automatically closed using `try-with-resources` block as described [here](../13-Exception-Handling/07-Chained-Exception-and-Other-Features.md#try-with-resources).

## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/java-io)
* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html)
* [GeeksForGeeks](https://www.geeksforgeeks.org/java-io-input-output-in-java-with-examples/)

### Youtube Videos

* [ProgrammingKnowledge - Reading File](https://www.youtube.com/watch?v=7ICZGNFD28g&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=39)
* [ProgrammingKnowledge - Writing File](https://www.youtube.com/watch?v=fgjIk7qQong&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=38)
* [Cave of Programming - Reading File](https://www.youtube.com/watch?v=FHDNwJmus3k&list=PL9DF6E4B45C36D411&index=33)
* [Cave of Programming - Reading File (FileReader and Buffered Reader)](https://www.youtube.com/watch?v=I6q0WN8ssyw&list=PL9DF6E4B45C36D411&index=39)
* [Cave of Programming - Writing File](https://www.youtube.com/watch?v=weAwTh5iiMY&list=PL9DF6E4B45C36D411&index=41)


### More Examples and Practice Questions

* [W3Resources](https://www.w3resource.com/java-exercises/io/index.php)
* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/io/QandE/questions.html)
* JavaTPoint Quizes
  * [Quiz 1](https://www.javatpoint.com/directload.jsp?val=97)
  * [Quiz 2](https://www.javatpoint.com/directload.jsp?val=98)
  * [Quiz 3](https://www.javatpoint.com/directload.jsp?val=99)
  * [Quiz 4](https://www.javatpoint.com/directload.jsp?val=100)

