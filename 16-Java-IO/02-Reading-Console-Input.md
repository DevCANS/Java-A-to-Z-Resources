># Reading Console Input

In Java, console input is accomplished by reading from `System.in`. To obtain a characterbased stream that is attached to the console, wrap `System.in` in a `BufferedReader` object. `BufferedReader` supports a buffered input stream.

```java
BufferedReader(Reader inputReader)
```

Here, `inputReader` is the stream that is linked to the instance of `BufferedReader` that is being created.

`InputStreamReader` converts bytes to characters. To obtain an InputStreamReader object that is linked to `System.in`, use the following constructor:

```java
InputStreamReader(InputStream inputStream)
```

Putting it all together, the following line of code creates a BufferedReader that is connected to the keyboard:

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

## Reading Characters

To read a character from a BufferedReader, use read( ). The version of read( ) that we will be using is

```java
int read( ) throws IOException
```

Each time that `read()` is called, it reads a character from the input stream and returns it as an integer value. It returns –1 when the end of the stream is encountered. As you can see, it can throw an `IOException`.

##### [Example 01](../20-Examples/16-Java-IO/02-Reading-Console-Input/Example-01/)

```java
// Use a BufferedReader to read characters from the console.
import java.io.*;
class BRRead {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new
        BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
```

##### Output

    Enter characters, 'q' to quit.
    123abcq
    1
    2
    3
    a
    b
    c
    q


## Reading Strings

To read a string from the keyboard, use the version of `readLine()` that is a member of the `BufferedReader` class. Its general form is shown here:

```java
String readLine() throws IOException
```

##### [Example 02](../20-Examples/16-Java-IO/02-Reading-Console-Input/Example-02/)

```java
// A tiny editor.
import java.io.*;
class TinyEdit {
    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for(int i=0; i<100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) 
                break;
        }
        System.out.println("\nHere is your file:");
        // display the lines
        for(int i=0; i<100; i++) {
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
```

##### Output

    Enter lines of text.
    Enter 'stop' to quit.
    This is line one.
    This is line two.
    Java makes working with strings easy.
    Just create String objects.
    stop
    Here is your file:
    This is line one.
    This is line two.
    Java makes working with strings easy.
    Just create String objects.


## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/io/cl.html)
* [JavaTPoint](https://www.javatpoint.com/java-bufferedreader-class)
* [GeeksForGeeks - Scanner Class](https://www.geeksforgeeks.org/scanner-class-in-java/)
* [GeeksForGeeks - Scanner vs BufferedReader](https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/)

### More Examples and Practice Questions

Provided in the last chapter of current section.