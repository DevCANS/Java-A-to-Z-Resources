># Methods

A method is a collection of statements that perform some specific task and return the result to the caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping the code. In Java, every method must be part of some class.

A method has the following general form:

```java
modifier returnType methodName(parameterList) throws ExceptionList {
    // method body
}
```

Generally, method declarations have six components, in order:

* __Modifiers__: Such as public, private, protected and default.
* __The return type__: The data type of the value returned by the method or void if does not return a value.
* __The method name__: The rules for field names apply to method names as well, but the convention is a little different.
* __The parameter list in parenthesis__: a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, `()`. If there are no parameters, you must use empty parentheses.
* __An exception lis__: The exceptions a method can throw. It can be none also. If that so, you don't need to mention `throws` keyword and exception list. You will learn about these in Exception Handling.
* __The method body__: The method's code, including the declaration of local variables, goes here.

Methods having return type other than `void` must end with a return statement and must return a value to the calling routine.

```java
return value;
```

##### [Example 01](../20-Examples/08-Classes-and-Objects/03-Methods/Example-01/)

```java
// This program includes a method inside the box class.
class Box {
    double width;
    double height;
    double depth;
    // display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}
```

```java
class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /* assign different values to mybox2's
        instance variables */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // display volume of first box
        mybox1.volume();
        // display volume of second box
        mybox2.volume();
    }
}
```

##### Output

    Volume is 3000.0
    Volume is 162.0

## Method Overloading

Method Overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different.

##### [Example 02](../20-Examples/08-Classes-and-Objects/03-Methods/Example-02/)

```java
class DisplayOverloading{
    public void disp(char c){
         System.out.println(c);
    }
    public void disp(char c, int num){
         System.out.println(c + " "+num);
    }
}
```

```java
class Sample{
   public static void main(String args[]){
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
```

##### Output

    a
    a 10

In the above example – method `disp()` is overloaded based on the number of parameters – We have two methods with the name disp but the parameters they have are different. Both are having different number of parameters.

Method overloading can also be done when same number of parameters are there but different data types or when the order of parameters are changed.

## Objects as Parameters

An object can also be sent as parameters to a method in the same way as premitive types.

##### [Example 03](../20-Examples/08-Classes-and-Objects/03-Methods/Example-03/)

```java
class Volume{
    public static double findVolume(Box box){
        double area = box.width * box.height * box.depth;
        return area;
    }
}
```

__Note__: A `static` method belongs to the class and are not associated with objects so it can be directly accessed without creating an object of `Volume`. 

```java
class Box {
    double width;
    double height;
    double depth;
}
```

```java
class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /* assign different values to mybox2's
        instance variables */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        int vol = Volume.findVolume(mybox1);
        System.out.println("Box 1 volume is " + vol);

        vol = Volume.findVolume(mybox2);
        System.out.println("Box 2 volume is " + vol);
    }
}
```

##### Output

    Box 1 volume is 3000.0
    Box 2 volume is 162.0

An object can also be returned from a method by specifying appropriate return type as name of the class.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
* [JavaTPoint](https://www.javatpoint.com/method-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/methods-in-java/)
* [Beginners Book - Overloading](https://beginnersbook.com/2013/05/method-overloading/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=o5dcpcuyuIA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=16)
* [ProgrammingKnowledge - Parameters](https://www.youtube.com/watch?v=c7iU8ZFA9gQ&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=17)
* [ProgramminKnowledge - Overloading](https://www.youtube.com/watch?v=pBe4hLdrMHA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=20)
* [Cave of Programming](https://www.youtube.com/watch?v=-eoNHtILOs4&list=PL9DF6E4B45C36D411&index=14)
* [Cave of Programming - Parameters](https://www.youtube.com/watch?v=fXVI4xuvozg&list=PL9DF6E4B45C36D411&index=16)