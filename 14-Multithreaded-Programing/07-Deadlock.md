># Deadlock

Deadlock in Java is a condition where two or more threads are blocked forever, waiting for each other.

This usually happens when multiple threads need the same locks but obtain them in different orders. Multithreaded Programming in Java suffers from the deadlock situation because of the `synchronized` keyword.

Deadlock is a difficult error to debug for two reasons:
* In general, it occurs only rarely, when the two threads time-slice in just the right way.
* It may involve more than two threads and two synchronized objects. (That is, deadlock can occur through a more convoluted sequence of events than just described.)

##### [Example 01](../20-Examples/14-Multithreaded-Programing/07-Deadlock/Example-01/)

```java
// An example of deadlock.
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("A Interrupted");
        }
    
        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}
```

```java
class B {
    synchronized void bar(A a) {    
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("B Interrupted");
        }
        
        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}
```

```java
class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    
    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }
    
    public static void main(String args[]) {
        new Deadlock();
    }
}
```
##### Output

    MainThread entered A.foo
    RacingThread entered B.bar
    MainThread trying to call B.last()
    RacingThread trying to call A.last()


Because the program has deadlocked, you need to press ctrl-c to end the program. You can see a full thread and monitor cache dump by pressing ctrl-break on a PC. You will see that RacingThread owns the monitor on b, while it is waiting for the monitor on a. At the same time, MainThread owns a and is waiting to get b. This program will never complete. As this example illustrates, if your multithreaded program locks up occasionally, deadlock is one of the first conditions that you should check for.

## Avoiding Deadlocks

There are some methods by which we can avoid this condition. We can’t completely remove its possibility but we can reduce.

* __Avoid Nested Locks__: This is the main reason for dead lock. Dead Lock mainly happens when we give locks to multiple threads. Avoid giving lock to multiple threads if we already have given to one.
* __Avoid Unnecessary Locks__: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
* __Using Thread Join__: Dead lock condition appears when one thread is waiting other to finish. If this condition occurs we can use Thread.join with maximum time you think the execution will take.

## External Resources

### Readings

* [GeeksForGeeks - Deadlocks in Java](https://www.geeksforgeeks.org/deadlock-in-java-multithreading/)
* [GeeksForGeeks - Deadlock](https://www.geeksforgeeks.org/introduction-of-deadlock-in-operating-system/)

### More Examples and Practice Questions
* [JavaTPoint Quiz on Multithreading 1](https://www.javatpoint.com/directload.jsp?val=90)
* [JavaTPoint Quiz on Multithreading 2](https://www.javatpoint.com/directload.jsp?val=91)
* [Interview Questions - DZone](https://dzone.com/articles/top-15-java-multithreading-concurrency-interview-q)
* [GeeksForGeeks - Practice Code](https://www.geeksforgeeks.org/output-of-java-programs-set-46-multi-threading/)
* [GeeksForGeeks - Practice Code](https://www.geeksforgeeks.org/output-of-java-program-set-16-threads/)