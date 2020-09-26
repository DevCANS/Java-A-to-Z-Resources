># Creating Threads

## Thread Class and Runnable Interface

Java’s multithreading system is built upon the `Thread` class, its methods, and its companion interface, `Runnable`.

`Thread` encapsulates a thread of execution. Since you can’t directly refer to the ethereal state of a running thread, you will deal with it through its proxy, the `Thread` instance that spawned it.

To create a new thread, your program will either extend `Thread` or implement the `Runnable` interface.

## The Main Thread

When a Java program starts up, one thread begins running immediately. This is usually called the main thread of your program, because it is the one that is executed when your program begins. The main thread is important for two reasons:

* It is the first thread to start and other threads are spawned from this thread.
* It must be the last thread to finish execution because it performs various shutdown actions.
  
Although the main thread is automatically created, it can be controlled through `Thread` object.

## Creating Threads

### Implementing Runnable

The easiest way to create a thread is to create a class that implements the Runnable interface.

To implement Runnable interface, a class need only implement a single method called `run()`.

##### [Example 01](../20-Examples/14-Multithreaded-Programing/02-Creating-Threads/Example-01/)

```java
class NewThread implements Runnable {
    Thread t;
    NewThread() {
        System.out.println("Child thread");
    }
    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
```

After you create a class that implements `Runnable`, you will instantiate an object of type `Thread`.

```java
class ThreadDemo {
    public static void main(String args[ ] ) {
        Thread t1 = new Thread(new NewThread(), "Demo Thread"); // create a new thread'
        t1.start() //starting the thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
```

##### Output

    Child thread
    Main Thread: 5
    Child Thread: 5
    Child Thread: 4
    Main Thread: 4
    Child Thread: 3
    Child Thread: 2
    Main Thread: 3
    Child Thread: 1
    Exiting child thread.
    Main Thread: 2
    Main Thread: 1
    Main thread exiting.


### Extending Thread

The second way to create a thread is to create a new class that extends `Thread`, and then to create an instance of that class. The extending class must override the `run()` method, which is the entry point for the new thread. It must also call `start()` to begin execution of the new thread.

##### [Example 02](../20-Examples/14-Multithreaded-Programing/02-Creating-Threads/Example-02/)

```java
class NewThread extends Thread {
    NewThread() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start(); // Start the thread
    }
    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
```

```java
class ExtendThread {
    public static void main(String args[]) {
        new NewThread(); // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
```

##### Output

This program generates the same output as the preceding version. Notice the call to `super()` inside `NewThread`. This invokes the following form of the `Thread` constructor:

```java
public Thread(String threadName)
```

At this point, you might be wondering why Java has two ways to create child threads, and which approach is better. The answers to these questions turn on the same point. The `Thread` class defines several methods that can be overridden by a derived class. Of these methods, the only one that must be overridden is `run()`. This is, of course, the same method required when you implement `Runnable`. Many Java programmers feel that classes should be extended only when they are being enhanced or modified in some way. So, if you will not be overriding any of Thread’s other methods, it is probably best simply to implement `Runnable`. Also, by implementing `Runnable`, your thread class does not need to inherit `Thread`, making it free to inherit a different class. Ultimately, which approach to use is up to you.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html)
* [JavaTPoint](https://www.javatpoint.com/creating-thread)
* [GeeksForGeeks](https://www.geeksforgeeks.org/multithreading-in-java/)

### Youtube Videos

* [ProgrammingKnowledge - By Exteding Thread](https://www.youtube.com/watch?v=0ySznjdXMEA&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=43)
* [ProgrammingKnowledge - By Implementing Runnable](https://www.youtube.com/watch?v=UXW5a-iHjso&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=44)

### More Examples and Practice Questions

Provided in the last chapter of the current section