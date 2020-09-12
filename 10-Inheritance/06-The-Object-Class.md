># The Object Class

There is one special class, `Object`, defined by Java. All other classes are subclasses of `Object`. That is, `Object` is a superclass of all other classes. This means that a reference variable of type `Object` can refer to an object of any other class. Also, since arrays are implemented as classes, a variable of type `Object` can also refer to any array.

`Object` defines the following methods, which means that they are available in every object.

|Method|Purpose|
|---|---|
|`Object clone()`|Creates a new object that is the same as the object being cloned.|
|`boolean equals(Object object)`|Determines whether one object is equal to another.|
|`void finalize()`|Called before an unused object is recycled.|
|`Class<?> getClass()`|Obtains the class of an object at run time.|
|`int hashCode()`|Returns the hash code associated with the invoking object.|
|`void notify()`|Resumes execution of a thread waiting on the invoking object.|
|`void notifyAll()`|Resumes execution of all threads waiting on the invoking object.|
|`String toString()`|Returns a string that describes the object.|
|`void wait( )`, `void wait(long milliseconds)`, `void wait(long milliseconds, int nanoseconds)`|Waits on another thread of execution.|

## Exteranl Resources
* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html)
* [JavaTPoint](https://www.javatpoint.com/object-class)
* [GeeksForGeeks](https://www.geeksforgeeks.org/object-class-in-java/)

#### More Examples and Practice Questions

* [CodesDope](https://www.codesdope.com/practice/java-subclass/)
* [JavaConceptOfTheDay](https://javaconceptoftheday.com/java-inheritance-practice-coding-questions/)
* [GeeksForGeeks](https://www.geeksforgeeks.org/java-gq/inheritance-2-gq/)
* [Sanfoundary](https://www.sanfoundry.com/java-mcqs-inheritance/)