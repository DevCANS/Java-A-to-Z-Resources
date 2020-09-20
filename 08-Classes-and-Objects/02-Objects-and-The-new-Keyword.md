># Objects and The 'new' Keyword

Obtaining objects of a class is a two-step process. First, you must declare a variable of the class type. This variable does not define an object. Instead, it is simply a variable that can refer to an object. Second, you must acquire an actual, physical copy of the object and assign it to that variable. You can do this using the `new` operator.

The `new` operator dynamically allocates (that is, allocates at run time) memory for an object and returns a reference to it. This reference is, more or less, the address in memory of the object allocated by `new`. This reference is then stored in the variable.

```java
Box myBox; // declare reference to object
myBox = new Box(); // allocate a Box object
```

These two steps is combined and can be rewritten as:

```java
Box myBox = new Box();
```

## The `new` Keyword

As just explained, the `new` operator dynamically allocates memory for an object. It has this
general form:

```java
classVar = new classname ( );
```

It is important to understand that `new` allocates memory for an object during run time. The advantage of this approach is that your program can create as many or as few objects as it needs during the execution of your program. However, since memory is finite, it is possible that new will not be able to allocate memory for an object because insufficient memory exists. If this happens, a run-time exception will occur.

Object reference variables act differently than you might expect when an assignment takes place. For example,

```java
Box b1 = new Box();
Box b2 = b1;
```

You might think that `b2` is being assigned a reference to a copy of the object referred to by
`b1`. That is, you might think that `b1` and `b2` refer to separate and distinct objects. However,
this would be wrong. Instead, after this fragment executes, `b1` and `b2` will both refer to the
same object.

The assignment of `b1` to `b2` did not allocate any memory or copy any part of the original object. It simply makes `b2` refer to the same object as does `b1`. Thus, any changes made to the object through `b2` will affect the object to which `b1` is referring, since they are the same object.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
* [JavaTPoint](https://www.javatpoint.com/object-and-class-in-java)
* [GeeksForGeeks](https://www.geeksforgeeks.org/classes-objects-java/)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=ZHLdVRXIuC8&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=19)
* [Cave of Programming](https://www.youtube.com/watch?v=OHw2t8BaIUg&list=PL9DF6E4B45C36D411&index=14)
* [Alex Lee](https://www.youtube.com/watch?v=vjjjGkXpX_I&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=10)