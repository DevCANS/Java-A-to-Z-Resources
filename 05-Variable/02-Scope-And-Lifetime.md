># Scope And Lifetime

* Scope of a variable is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically) scoped, i.e.scope of a variable can determined at compile time and independent of function call stack.

* Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

## Member Variables (Class Level Scope)

These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class. Let’s take a look at an example:

```java
public class Test{
	// All variables defined directly inside a class 
    // are member variables
    int a;
    private String b
    void method1() {....}
    int method2() {....}
    char c;
}
```

* We can declare class variables anywhere in class, but outside methods.

* Access specified of member variables doesn’t effect scope of them within a class.

* Member variables can be accessed outside a class with following rules


|Modifier|Package|Subclass|World|
|---|---|---|---|
|public|Yes|Yes|Yes|
|protected|Yes|Yes|No|
|Default (no modifier)|Yes|No|No|
|private|No|No|No|

## Local Variables (Method Level Scope)

Variables declared inside a method have method level scope and can’t be accessed outside the method.

```java
public class Test{

    void method1(){
       // Local variable (Method level scope)
       int x;
    }
}
```
__Note__ : Local variables don’t exist after method’s execution is over.

Here’s another example of method scope, except this time the variable got passed in as a parameter to the method:

```java
class Test
{

    private int x;
    public void setX(int x){
        this.x = x;
    }
}
```

The above code uses this keyword to differentiate between the local and class variables.

##### [Example 01](../20-Examples/05-Variable/02-Scope-and-Lifetime/Example-01/)

```java
public class Test { 
	static int x = 11; 
	private int y = 33;

	public void method1(int x){ 
		Test t = new Test(); 
		this.x = 22; 
		y = 44; 

		System.out.println("Test.x: " + Test.x); 
		System.out.println("t.x: " + t.x); 
		System.out.println("t.y: " + t.y); 
		System.out.println("y: " + y); 
	} 

	public static void main(String args[]){
		Test t = new Test(); 
		t.method1(5); 
	} 
}
```

##### Output:

	Test.x:   22
	t.x: 22
	t.y: 33
	y: 44

## Loop Variables (Block Scope)

A variable declared inside pair of brackets `{` and `}` in a method has scope withing the brackets only.

##### [Example 02](../20-Examples/05-Variable/02-Scope-and-Lifetime/Example-02/)

```java
public class Test{

	public static void main(String args[]){
		{ 
			// The variable x has scope within 
			// brackets 
			int x = 10; 
			System.out.println(x); 
		} 
		
		// Uncommenting below line would produce 
		// error since variable x is out of scope. 

		// System.out.println(x); 
	} 
}
```

##### Output 
     
	 10

As another example, consider following program with a for loop.

##### [Example 03](../20-Examples/05-Variable/02-Scope-and-Lifetime/Example-03/)

```java
class Test{

	public static void main(String args[]){
		for (int x = 0; x < 4; x++){
			System.out.println(x); 
		} 

		// Will produce error 
		System.out.println(x); 
	} 
}
```

##### Output:

	11: error: cannot find symbol

        System.out.println(x); 

The right way of doing above is,  

```java
 // Above program after correcting the error 
class Test{

	public static void main(String args[]){
		int x; 
		for (x = 0; x < 4; x++){
			System.out.println(x); 
		} 

		System.out.println(x); 
	} 
}
```

##### Output 

	0  
	1
	2
	3
	4

### Some Important Points about Variable scope in Java:

In general, a set of curly brackets `{ }` defines a scope.

* In Java we can usually access a variable as long as it was defined within the same set of brackets as the code we are writing or within any curly brackets inside of the curly brackets where the variable was defined.

* Any variable defined in a class outside of any method can be used by all member methods.

* When a method has the same local variable as a member, this keyword can be used to reference the current class variable.

* For a variable to be read after the termination of a loop, It must be declared before the body of the loop.

## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/java-variables)
* [GeeksForGeeks](https://www.geeksforgeeks.org/variables-in-java/)

### More Examples and Practice Questions

Provided in the last chapter of current section.