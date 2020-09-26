># Generic Methods, Constructors and Interfaces

## Generic Methods

You can write a single generic method declaration that can be called with arguments of different types. Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately.

This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared. Static and non-static generic methods are allowed, as well as generic class constructors.

##### [Example 01](../20-Examples/17-Generics/02-Generic-Methods-Constructors-and-Interfaces/Example-01/)

```java
public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}

}
```

```java
public class GenericsMethods {

	//Java Generic Method
	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]){
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("Hello");
		
		GenericsType<String> g2 = new GenericsType<>();
		g2.set("Hello");
		
		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		//above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		//This feature, known as type inference, allows you to invoke a generic method as 
        //an ordinary method, without specifying a type between angle brackets.
		//Compiler will infer the type that is needed

        System.out.println("Are the strings equal? " + isEqual);
	}
}
```

##### Output

    Are the strings equal? true

Notice the `isEqual()` method signature showing syntax to use generics type in methods. Also, notice how to use these methods in our java program. you can specify type while calling these methods or you can invoke them like a normal method. Java compiler is smart enough to determine the type of variable to be used, this facility is called type inference.

### Bounded Type Parameters

To declare a bounded type parameter, list the type parameter’s name, followed by the extends keyword, followed by its upper bound. Similar to bounded type classes

```java
public static <T extends Comparable<T>> int compare(T t1, T t2){
	return t1.compareTo(t2);
}
```

## Generic Constructors

Since constructors are special type of methods,it is possible for constructors to be generic, even if their class is not.

##### [Example 02](../20-Examples/17-Generics/02-Generic-Methods-Constructors-and-Interfaces/Example-02/)

```java
// Use a generic constructor.
class GenCons {
    private double val;
    // A generic constructor
    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }
    void showval() {
        System.out.println("val: " + val);
    }
}
```

```java
class GenConsDemo {
    public static void main(String args[]) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test.showval();
        test2.showval();
    }
}
```

##### Output

    val: 100.0
    val: 123.5

## Generic Interfaces

In addition to generic classes and methods, you can also have generic interfaces. Generic interfaces are specified just like generic classes.

##### [Example 03](../20-Examples/17-Generics/02-Generic-Methods-Constructors-and-Interfaces/Example-03/)

```java
// A generic interface example.
// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
```

```java
// Now, implement MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) { 
        vals = o; 
    }
    // Return the minimum value in vals.
    public T min() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }
    // Return the maximum value in vals.
    public T max() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }
}
```

```java
class GenIFDemo {
    public static void main(String args[]) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());
        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}
```

##### Output

    Max value in inums: 8
    Min value in inums: 2
    Max value in chs: w
    Min value in chs: b

Pay special attention to the way that the type parameter `T` is declared by `MyClass` and then passed to `MinMax`. Because `MinMax` requires a type that implements `Comparable`, the implementing class (`MyClass` in this case) must specify the same bound. Furthermore, once this bound has been established, there is no need to specify it again in the implements clause. In fact, it would be wrong to do so.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/methods.html)
* [JavaTPoint](https://www.javatpoint.com/generics-in-java)