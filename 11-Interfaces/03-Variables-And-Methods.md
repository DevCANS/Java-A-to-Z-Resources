># Variables And Methods in Interface

## Variables

You can use interfaces to import shared constants into multiple classes by simply declaring an interface that contains variables that are initialized to the desired values. When you include that interface in a class (that is, when you “implement” the interface), all of those variable names will be in scope as constants. (This is similar to using a header file in C/C++ to create a large number of #defined constants or const declarations.) If an interface contains no methods, then any class that includes such an interface doesn’t actually implement anything. It is as if that class were importing the constant fields into the class name space as final variables. The next example uses this technique to implement an automated “decision maker”:

##### [Example 01](../20-Examples/11-Interfaces/03-Variables-and-Methods/Example-01/)

```java
interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}
```

```java
import java.util.Random;

class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 30)
            return NO; // 30%
        else if (prob < 60)
            return YES; // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON; // 13%
        else
            return NEVER; // 2%
    }
}
```

```java
class AskMe implements SharedConstants {
    public static void answer(int result) {
        switch(result) {
            case NO:
            System.out.println("No");
            break;
            case YES:
            System.out.println("Yes");
            break;
            case MAYBE:
            System.out.println("Maybe");
            break;
            case LATER:
            System.out.println("Later");
            break;
            case SOON:
            System.out.println("Soon");
            break;
            case NEVER:
            System.out.println("Never");
            break;
        }
    }

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
```

##### Output

    Later
    Soon
    No
    Yes


Notice that this program makes use of one of Java’s standard classes: Random. This class provides pseudorandom numbers. It contains several methods that allow you to obtain random numbers in the form required by your program. In this example, the method `nextDouble()` is used. It returns random numbers in the range 0.0 to 1.0. In this sample program, the two classes, Question and AskMe, both implement the `SharedConstants` interface where `NO`, `YES`, `MAYBE`, `SOON`, `LATER`, and `NEVER` are defined. Inside each class, the code refers to these constants as if each class had defined or inherited them directly. Here is the output of a sample run of this program. Note that the results are different each time it is run.

## Methods

#### Default Methods
Starting from Java 8 an interface can have a default method which provides an implementation of an interface method.

An interface default method is defined similar to the way a method is defined by a class. The primary difference is that the declaration is preceded by the keyword `default`.

##### [Example 02](../20-Examples/11-Interfaces/03-Variables-and-Methods/Example-02/)

```java
public interface MyIF {

    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();

    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {
        return "Default String";
    }
}
```

Because `getString()` includes a default implementation, it is not necessary for an implementing class to override it. In other words, if an implementing class does not provide its own implementation, the default is used.

```java
// Implement MyIF.
class MyIFImp implements MyIF {
    // Only getNumber() defined by MyIF needs to be implemented.
    // getString() can be allowed to default.
    public int getNumber() {
        return 100;
    }
}
```

```java
// Use the default method.
class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();
        
        // Can call getNumber(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println(obj.getNumber());
        
        // Can also call getString(), because of default implementation:
        System.out.println(obj.getString());
    }
}
```

##### Output

    100
    Default String


Thus, for `getString()`, implementation by a class is optional. (Of course, its implementation by a class will be required if the class uses `getString()` for some purpose beyond that supported by its default.)

#### Static Methods

Starting from Java 8 another new capability to interface was added: the ability to define one or more static methods. Like static methods in a class, a static method defined by an interface can be called independently of any object. Static interface methods are not inherited by either an implementing class or a subinterface.


## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)