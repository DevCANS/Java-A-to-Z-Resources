># 'final' Keyword

A field can be declared as `final`. Doing so prevents its contents from being modified, making it, essentially, a constant. This means that you must initialize a `final` field when it is declared. You can do this in one of two ways:

* First, you can give it a value when it is
declared.
* Second, you can assign it a value within a constructor.

##### Example

```java
final int FILE_NEW = 1;
final int FILE_OPEN = 2;
final int FILE_SAVE = 3;
final int FILE_SAVEAS = 4;
final int FILE_QUIT = 5;
```

Subsequent parts of your program can now use `FILE_OPEN`, etc., as if they were constants, without fear that a value has been changed. It is a common coding convention to choose all uppercase identifiers for `final` fields, as this example shows.

In addition to fields, both method parameters and local variables can be declared `final`.

Declaring a parameter `final` prevents it from being changed within the method. 

Declaring a local variable `final` prevents it from being assigned a value more than once.

The keyword final can also be applied to methods, but its meaning is substantially different than when it is applied to variables. This additional usage of final is described in the next section, when inheritance is described.

## External Resources

* [Oracel Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/final.html)
* [JavaTPoint](https://www.javatpoint.com/final-keyword)
* [GeeksForGeeks](https://www.geeksforgeeks.org/final-keyword-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=aN8znC-ME-w&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=24)