># Control Statements

Decision Making in programming is similar to decision making in real life. In programming also we face some situations where we want a certain block of code to be executed when some condition is fulfilled.
A programming language uses control statements to control the flow of execution of program based on certain conditions. These  are used to cause the flow of execution to advance and branch based on changes to the state of a program.


## if statements

`if` statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

__Syntax:__

```java
if(condition){
   // Statements to execute if   
   // condition is true
}
```

Here, condition after evaluation will be either true or false. `if` statement accepts boolean values – if the value is true then it will execute the block of statements under it.

If we do not provide the curly braces `{` and `}` after `if(condition)` then by default `if` statement will consider the immediate one statement to be inside its block.

For example:

```java
if(condition)
    statement1;  
statement2;     

// Here if the condition is true, if block    
// will consider only statement1 to be inside    
// its block.
```

##### [Example 01](../20-Examples/07-Control-Statements/01-if-Statement/Example-01/)

```java
// Java program to illustrate If statement    
class IfDemo{

	public static void main(String args[]){
		int i = 10; 

		if (i > 15) 
			System.out.println("10 is less than 15"); 

		// This statement will be executed 
		// as if considers one statement by default 
		System.out.println("I am Not in if"); 
	} 
} 
```

##### Output

    I am Not in if

## if-else statement

The `if` statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the `else` statement. We can use the `else` statement with `if` statement to execute a block of code when the condition is false.   

__Syntax__:
 
```java
if (condition){
    // Executes this block if
    // condition is true
}else{

    // Executes this block if
    // condition is false
} 
```

##### [Example 02](../20-Examples/07-Control-Statements/01-if-Statement/Example-02/)

```java
// Java program to illustrate if-else statement  

class IfElseDemo{
	public static void main(String args[]){

		int i = 10; 

		if (i < 15) 
			System.out.println("i is smaller than 15"); 
		else
			System.out.println("i is greater than 15"); 
	} 
}
```

##### Output:

	i is smaller than 15

## Nested if 

A nested `if` is an `if` statement that is the target of another `if` or `else`. Nested `if` statements means an if statement inside an `if` statement. Yes, java allows us to nest `if` statements within `if` statements. i.e, we can place an `if` statement inside another `if` statement.

__Syntax__:

```java
if (condition1){
   // Executes when condition1 is true
   if (condition2){
      // Executes when condition2 is true
   }
}
```

##### [Example 03](../20-Examples/07-Control-Statements/01-if-Statement/Example-03/)

```java
// Java program to illustrate nested-if statement 

class NestedIfDemo{
	public static void main(String args[]){
		int i = 10; 

		if (i == 10){
			// First if statement 
			if (i < 15) 
				System.out.println("i is smaller than 15"); 

			// Nested - if statement 
			// Will only be executed if statement above 
			// it is true 
			if (i < 12) 
				System.out.println("i is smaller than 12 too"); 
			else
				System.out.println("i is greater than 15"); 
		} 
	} 
} 
```

##### Output:

	i is smaller than 15
	i is smaller than 12 too


## if-else ladder

Here, a user can decide among multiple options.The `if` statements are executed from the top down. As soon as one of the conditions controlling the `if` is true, the statement associated with that `if` is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final `else` statement will be executed.

```java
if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;
```

##### [Example 04](../20-Examples/07-Control-Statements/01-if-Statement/Example-04/)

```java
// Java program to illustrate if-else-if ladder 

class IfElseIfDemo{
	public static void main(String args[]){
		int i = 20; 

		if (i == 10) 
			System.out.println("i is 10"); 
		else if (i == 15) 
			System.out.println("i is 15"); 
		else if (i == 20) 
			System.out.println("i is 20"); 
		else
			System.out.println("i is not present"); 
	} 
} 
```

##### Output:

	i is 20

## External Resources

### Youtube Videos

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
* [JavaTPoint](https://www.javatpoint.com/java-if-else)
* [GeeksForGeeks](https://www.geeksforgeeks.org/java-if-else-statement-with-examples/)
* [BeginnersBook](https://beginnersbook.com/2017/08/if-else-statement-in-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=WZXq5_9_JDs&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=8)
* [Cave of Programming](https://www.youtube.com/watch?v=jjx5mJOcLqM&list=PL9DF6E4B45C36D411&index=6)
* [Alex Lee](https://www.youtube.com/watch?v=yvWnj_HfG6s&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=10)

### More Examples and Practice Questions

* [CodesDope](https://www.codesdope.com/practice/java-decide-if-or-else/)