># Primitive Data Types

## Integers
Java defines four integer types __bytes__, __short__, __int__, and __long__. All of these are signed, positive and negative values. Java does not support unsigned integers.

|Name|Width|Min Value|Max Value|Variable Declaration|
|---|---|---|---|---|
|__long__|64|–9,223,372,036,854,775,808|9,223,372,036,854,775,807| <code>long variableName;</code>|
|__int__|32|–2,147,483,648|2,147,483,647|<code>int variableName;</code>|
|__short__|16|–32,768|32,767|<code>short variableName;</code>|
|__byte__|8|–128|127|<code>byte variableName;</code>|


##### [Example 01](../20-Examples/04-Data-Types/01-Premitive-Types/Example-01/)

```java
// Compute distance light travels using long variables.
class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        
        days = 1000; // specify number of days here
        
        seconds = days * 24 * 60 * 60; // convert to seconds
        
        distance = lightspeed * seconds; // compute distance
        
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
```

##### Output
    In 1000 days light will travel about 16070400000000 miles.

Clearly, the result could not have been held in an int variable.

## Floating-Point Types
Floating-point numbers, also known as real numbers, are used when evaluating expressions
that require fractional precision. For example, calculations such as square root, or
transcendentals such as sine and cosine, result in a value whose precision requires a floatingpoint
type.


|Name|Width|Min Value|Max Value|Variable Declaration|
|---|---|---|---|---|
|__double__|64|4.9e–324|1.8e+308|`double variableName;`|
|__float__|32|1.4e–045|3.4e+038|`float variableName;`|

The value of `float` type ends with 'f' and `double` with a 'd'

##### [Example 02](../20-Examples/04-Data-Types/01-Premitive-Types/Example-02/)

```java    
public class MyClass {
    public static void main(String[] args) {
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);  
    }
}
```

##### Output

    35000.0
    120000.0



## Characters

In Java, the data type used to store characters is char. However, C/C++ programmers
beware: char in Java is not the same as char in C or C++. In C/C++, char is 8 bits wide. This
is not the case in Java. Instead, Java uses Unicode to represent characters. Unicode defines a
fully international character set that can represent all of the characters found in all human
languages. Thus, in Java char is a 16-bit type. The range of a char is 0 to 65,536. There are no
negative chars. The standard set of characters known as ASCII still ranges from 0 to 127 as
always, and the extended 8-bit character set, ISO-Latin-1, ranges from 0 to 255.

##### [Example 03](../20-Examples/04-Data-Types/01-Premitive-Types/Example-03/)

```java
// Demonstrate char data type.
class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 88; // ASCII code for 'X'
        ch2 = 'Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}
```

##### Output

    ch1 and ch2: X Y

Notice that ch1 is assigned the value 88, which is the ASCII (and Unicode) value that
corresponds to the letter X. As mentioned, the ASCII character set occupies the first 127
values in the Unicode character set. For this reason, all the “old tricks” that you may have
used with characters in other languages will work in Java, too.

##### [Example 04](../20-Examples/04-Data-Types/01-Premitive-Types/Example-04/)

```java
// char variables behave like integers.
class CharDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 contains " + ch1);
        ch1++; // increment ch1
        System.out.println("ch1 is now " + ch1);
    }
}
```

##### Output

    ch1 contains X
    ch1 is now Y

## Booleans

Java has a primitive type, called boolean, for logical values. It can have only one of two
possible values, true or false. This is the type returned by all relational operators, as in the
case of a < b. boolean is also the type required by the conditional expressions that govern the
control statements such as if and for.

##### [Example 05](../20-Examples/04-Data-Types/01-Premitive-Types/Example-05/)

```java
// Demonstrate boolean values.
class BoolTest {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // a boolean value can control the if statement
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
```


#### Output

    b is false
    b is true
    This is executed.
    10 > 9 is true


# External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
* [JavaTPoints](https://www.javatpoint.com/java-data-types)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=4ekASokneGU&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=5&t=430s)
* [Alex Lee (int)](https://www.youtube.com/watch?v=3Bf2Y9NBcck&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=7)
* [Alex Lee (long, float, double)](https://www.youtube.com/watch?v=qawwQf6gKpQ&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=8)
* [Alex Lee (booleans)](https://www.youtube.com/watch?v=CHVVEGRGiJU&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=9)
* [Cave of Programming](https://www.youtube.com/watch?v=oPBWC4_Zmj0&list=PL9DF6E4B45C36D411&index=2)

### More Example Programs and Practice Questions

* [w3Resources](https://www.w3resource.com/java-exercises/basic/index.php) Solve Question 1 to 7