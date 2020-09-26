># Synchronizaion

When you start two or more threads within a program, there may be a situation when multiple threads try to access the same resource and finally they can produce unforeseen result due to concurrency issues. For example, if multiple threads try to write within a same file then they may corrupt the data because one of the threads can override data or while one thread is opening the same file at the same time another thread might be closing the same file. you need some way to ensure that the resource will be used by only one thread at a time. The process by which this is achieved is called synchronization.

A _monitor_ is an object that is used as a mutually exclusive lock. Only one thread can own a monitor at a given time. When a thread acquires a lock, it is said to have entered the monitor. All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor. These other threads are said to be waiting for the monitor. A thread that owns a monitor can reenter the same monitor if it so desires.

Java programming language provides a very handy way of creating threads and synchronizing their task by using synchronized blocks. You keep shared resources within this block. Following is the general form of the synchronized statement:

## Synchronized Method

To enter an object’s _monitor_, just call a method that has been modified with the `synchronized` keyword. While a thread is inside a synchronized method, all other threads that try to call it (or any other synchronized method) on the same instance have to wait. To exit the monitor and relinquish control of the object to the next waiting thread, the owner of the monitor simply returns from the synchronized method.

```java
synchronized returnType methodName(parameters)
```

##### [Example 01](../20-Examples/14-Multithreaded-Programing/05-Synchronization/Example-01/)

This example does not use synchronization.

```java
// This program is not synchronized.
class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
```

```java
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
       target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}
```

```java
class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
```

##### Output

    Hello[Synchronized[World]
    ]
    ]

As you can see, by calling `sleep()`, the `call()` method allows execution to switch to another thread. This results in the mixed-up output of the three message strings. In this program, nothing exists to stop all three threads from calling the same method, on the same object, at the same time. This is known as a _race condition_, because the three threads are racing each other to complete the method.

To fix the preceding program, you must serialize access to `call()`. That is, you must
restrict its access to only one thread at a time. To do this, you simply need to precede `call()`’s
definition with the keyword `synchronized`, as shown here:

```java
// This program in synchronized
class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
```

##### Output

    [Hello]
    [Synchronized]
    [World]


## The synchronized Statement

Using synchronized methods is an easy and effective means of achieving synchronisation but it will not work in all cases. Sometimes you can not synchronize the method. For example, you don't have access to the code. In this type of case `synchronized` statements helpful. simply put calls to the methods defined by this class inside a `synchronized` block.

```java
synchronized(objRef) {
    // statements to be synchronized
}
```

##### [Example 02](../20-Examples/14-Multithreaded-Programing/05-Synchronization/Example-02/)

```java
// This program uses a synchronized block.
class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
```

```java
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    // synchronize calls to call()
    public void run() {
        synchronized(target) { // synchronized block
            target.call(msg);
        }
    }
}
```

```java
class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
```

Here, the `call()` method is not modified by `synchronized`. Instead, the `synchronized` statement is used inside `Caller`’s `run()` method. This causes the same correct output as the preceding example, because each thread waits for the prior one to finish before proceeding.

## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html)
* [JavaTPoint - Synchronized method](https://www.javatpoint.com/synchronization-in-java)
* [JavaTPoint - Synchronized block](https://www.javatpoint.com/synchronized-block-example)

### More Examples and Practice Problems

Provided in the last chapter of the current section.