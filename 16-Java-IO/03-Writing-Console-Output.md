># Writing Console Output

Console output is most easily accomplished with `print()` and `println()`, described earlier, which are used in most of the examples in this book. These methods are defined by the class `PrintStream` (which is the type of object referenced by `System.out`).

Because `PrintStream` is an output stream derived from `OutputStream`, it also implements the low-level method `write()`. Thus, `write()` can be used to write to the console.

##### [Example 01](../20-Examples/16-Java-IO/03-Writing-Console-Output/Example-01/)

```java
// Demonstrate System.out.write().
class WriteDemo {
    public static void main(String args[]) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}
```

##### Output

    A

## The PrintWriter Class

For realworld programs, the recommended method of writing to the console when using Java is through a `PrintWriter` stream. `PrintWriter` is one of the character-based classes. Using a character-based class for console output makes internationalizing your program easier.

```java
PrintWriter(OutputStream outputStream, boolean flushingOn)
```

To write to the console by using a PrintWriter, specify System.out for the output stream and automatic flushing.

##### [Example 02](../20-Examples/16-Java-IO/03-Writing-Console-Output/Example-02/)

```java
// Demonstrate PrintWriter
import java.io.*;
public class PrintWriterDemo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
```
##### Output

    This is a string
    -7
    4.5E-7

## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/java-printwriter-class)
* [GeeksForGeeks - Formated Output](https://www.geeksforgeeks.org/formatted-output-in-java/)

### More Examples and Practice Questions

Provided in the last chapter of current section.