># 'static' Keyword

When a number of objects are created from the same class blueprint, they each have their own distinct copies of instance variables.

Sometimes, you want to have variables that are common to all objects. This is accomplished with the `static` modifier.

When a member is declared `static`, it can be accessed before any objects of its class are created, and without reference to any object. You can declare both methods and variables to be static. The most common example of a static member is `main()`. `main()` is declared as static because it must be called before any objects exist.

static modifier in Java is applicable for the following:

* Blocks
* Variables
* Methods
* Nested Classes

## Static Variables

The `static` keyword is used to create variables that will exist independently of any instances created for the class. Only one copy of the static variable exists regardless of the number of instances of the class.

Static variables are also known as class variables. Local variables cannot be declared static.

## Static Methods

The `static` keyword is used to create methods that will exist independently of any instances created for the class.

Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all the data from parameters and compute something from those parameters, with no reference to variables.

Methods declared as static have several restrictions:
* They can only directly call other `static` methods.
* They can only directly access static data.
* They cannot refer to `this` or `super` in any way. (The keyword `super` relates to inheritance and is described in the next section.)

Class variables and methods can be accessed using the class name followed by a dot and the name of the variable or method.

##### [Example 01](../20-Examples/09-More-on-Classes/01-static-Keyword/Example-01/)

```java
//Java Program to demonstrate the use of a static method.  
class Student{  
    int rollno;  
    String name;  
    //static variable
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){
        college = "BBDIT";  
    }
    //constructor to initialize the variable  
    Student(int r, String n){
        rollno = r;  
        name = n;  
    }
    //method to display values  
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
```

```java
//Test class to create and display the values of object  
public class TestStaticMethod{
    public static void main(String args[]){
        Student.change();//calling change method
        //creating objects
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        Student s3 = new Student(333,"Sonoo");
        //calling display method  
        s1.display();
        s2.display();
        s3.display();
    }
}
```

##### Output

    111 Karan BBDIT
    222 Aryan BBDIT
    333 Sonoo BBDIT

## Initializer Block

Instance initializer block works are used to initialize the properties of an object. 

* It is invoked before the constructor is invoked. 
* It is invoked every time an object is created.
* They are typically placed above the constructors within braces.
* We can also have multiple Initializer Blocks in a single class. If compiler finds multiple Initializer Blocks, then they all are executed from top to bottom i.e. the Initializer Blocks which is written at top will be executed first.
* You can have Initializer Blocks in parent class also. Iinitializer block code runs immediately after the call to `super()` in a constructor. The compiler executes parents class’s Initializer Blocks before executing current class’s Initializer Blocks.

##### [Example 02](../20-Examples/09-More-on-Classes/01-static-Keyword/Example-02/)

```java
// Java program to illustrate 
// Initializer Block 
// with super() 

//Parent Class
class B {
	B(){ 
		System.out.println("B-Constructor Called"); 
	}
    //initializer block
	{ 
		System.out.println("B-Initializer Block"); 
	} 

} 

// Child class 
class A extends B {
	A(){ 
		super(); 
		System.out.println("A-Constructor Called"); 
	}
    //initializer block
	{ 
		System.out.println("A-Initializer Block"); 
	}
	
	// main function 
	public static void main(String[] args){ 
		A a = new A(); 
	}
}
```

##### Output

    B-Initializer Block
    B-Constructor Called
    A-Initializer Block
    A-Constructor Called

## Static Initializer Block

Instance variables are initialized using initialization blocks. However, the static initialization blocks can only initialize the static instance variables. These blocks are only executed once when the class is loaded. There can be multiple static initialization blocks in a class that is called in the order they appear in the program.

##### [Example 03](../20-Examples/09-More-on-Classes/01-static-Keyword/Example-03/)

```java
class JavaExample{
    static int num;
    static String mystr;
    //static initializer block
    static{
        num = 97;
        mystr = "Static keyword in Java";
    }

    public static void main(String args[]){
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }
}
```

##### Output

    Value of num: 97
    Value of mystr: Static keyword in Java

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)
* [JavaTPoint](https://www.javatpoint.com/static-keyword-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/static-keyword-java/)

### Youtube Videos

* [ProgrammingKnowledge - 'static' Keyword](https://www.youtube.com/watch?v=n4axao9LWWE&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=22)
* [ProgrammingKnowledge - 'static' Keyword Examples](https://www.youtube.com/watch?v=G9octOBgSf4&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=22)

### More Examples and Practice Questions

* [GeeksForGeeks - Quiz](https://www.geeksforgeeks.org/output-java-programs-set-48-static-keyword/)