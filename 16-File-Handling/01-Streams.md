># Streams

Java programs perform I/O through streams. A stream is an abstraction that either produces or consumes information. All these streams represent an input source and an output destination. The stream in the `java.io` package supports many data such as primitives, object, localized characters, etc. Java defines two types of streams: _byte_ and _character_.

## The Byte Stream Classes

Byte streams provide a convenient means for handling input and output of bytes. Byte streams are used, for example, when reading or writing binary data. At the top there are two abstract classes: `InputStream` and `OutputStream`


|Stream Class|Meaning|
|---|---|
|`BufferedInputStream`|Buffered input stream|
|`BufferedOutputStream`|Buffered output stream|
|`ByteArrayInputStream`|Input stream that reads from a byte array|
|`ByteArrayOutputStream`|Output stream that writes to a byte array|
|`DataInputStream`|An input stream that contains methods for reading the Java standard data types|
|`DataOutputStream`|An output stream that contains methods for writing the Java standard data types|
|`FileInputStream`|Input stream that reads from a file|
|`FileOutputStream`|Output stream that writes to a file|
|`FilterInputStream`|Implements InputStream|
|`FilterOutputStream`|Implements OutputStream|
|`InputStream`|Abstract class that describes stream input|
|`ObjectInputStream`|Input stream for objects|
|`ObjectOutputStream`|Output stream for objects|
|`OutputStream`|Abstract class that describes stream output|
|`PipedInputStream`|Input pipe|
|`PipedOutputStream`|Output pipe|
|`PrintStream`|Output stream that contains `print()` and `println()`|
|`PushbackInputStream`|Input stream that supports one-byte “unget,” which returns a byte to the input stream|
|`SequenceInputStream`|Input stream that is a combination of two or more input streams that will be read sequentially, one after the other|

The abstract classes `InputStream` and `OutputStream` define several key methods that the other stream classes implement. Two of the most important are `read()` and `write()`, which, respectively, read and write bytes of data.

## The Character Stream Classes

Character streams provide a convenient means for handling input and output of characters. They use Unicode and, therefore, can be internationalized. Also, in some cases, character streams are more efficient than byte streams. At the top are two abstract classes: `Reader` and `Writer`.

|Streams|Meaning|
|---|---|
|`BufferedReader`|Buffered input character stream|
|`BufferedWriter`|Buffered output character stream|
|`CharArrayReader`|Input stream that reads from a character array|
|`CharArrayWriter`|Output stream that writes to a character array|
|`FileReader`|Input stream that reads from a file|
|`FileWriter`|Output stream that writes to a file|
|`FilterReader`|Filtered reader|
|`FilterWriter`|Filtered writer|
|`InputStreamReader`|Input stream that translates bytes to characters|
|`LineNumberReader`|Input stream that counts lines|
|`OutputStreamWriter`|Output stream that translates characters to bytes|
|`PipedReader`|Input pipe|
|`PipedWriter`|Output pipe|
|`PrintWriter`|Output stream that contains `print()` and `println()`|
|`PushbackReader`|Input stream that allows characters to be returned to the input stream|
|`Reader`|Abstract class that describes character stream input|
|`StringReader`|Input stream that reads from a string|
|`StringWriter`|Output stream that writes to a string|
|`Writer`|Abstract class that describes character stream output|

The abstract classes `Reader` and `Writer` define several key methods that the other stream classes implement. Two of the most important methods are `read()` and `write()`, which read and write characters of data, respectively.

## The Predefined Streams

All Java programs automatically import the `java.lang` package. This package defines a class called `System`, which encapsulates several aspects of the run-time environment. `System` also contains three predefined stream variables: `in`, `out`, and `err`. These fields are declared as `public`, `static`, and `final` within
`System`.

* `System.out` refers to the standard output stream. By default, this is the console.
* `System.in` refers to standard input, which is the keyboard by default.
* `System.err` refers to the standard error stream, which also is the console by default.

`System.in` is an object of type `InputStream`; `System.out` and `System.err` are objects of type `PrintStream`. These are byte streams, even though they are typically used to read and write characters from and to the console.

## External Resources

* [Oracel Tutorials](https://docs.oracle.com/javase/tutorial/essential/io/)
* [JavaTPoint](https://www.javatpoint.com/java-io)
* [GeeksForGeeks](https://www.geeksforgeeks.org/character-stream-vs-byte-stream-java/)

#### More Examples and Practice Questions

Provided in the last chapter of current section.