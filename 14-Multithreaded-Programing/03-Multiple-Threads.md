># Multiple Threads

## Creating Multiple Threads

So far, you have been using only two threads: the main thread and one child thread. However, your program can spawn as many threads as it needs. For example, the following program creates three child threads:

##### [Example 01](../20-Examples/14-Multithreaded-Programing/03-Multiple-Threads/Example-01/)

```java
// Create multiple threads.
class NewThread implements Runnable {
    String name; // name of thread
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }
    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}
```

```java
class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThread("One"); // start threads
        new NewThread("Two");
        new NewThread("Three");
        try {
        // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
```

##### Output

    New thread: Thread[One,5,main]
    New thread: Thread[Two,5,main]
    New thread: Thread[Three,5,main]
    One: 5
    Two: 5
    Three: 5
    One: 4
    Two: 4
    Three: 4
    One: 3
    Three: 3
    Two: 3
    One: 2
    Three: 2
    Two: 2
    One: 1
    Three: 1
    Two: 1
    One exiting.
    Two exiting.
    Three exiting.
    Main thread exiting.

As you can see, once started, all three child threads share the CPU. Notice the call to `sleep(10000)` in `main()`. This causes the main thread to sleep for ten seconds and ensures that it will finish last. However, this is hardly a satisfactory solution, and it also raises a larger question: How can one thread know when another thread has ended? Fortunately, `Thread` provides a means by which you can answer this question.

## isAlive() and join()

The `isAlive()` method returns `true` if the thread upon which it is called is still running. It returns `false` otherwise.

While `isAlive()` is occasionally useful, the method that you will more commonly use to wait for a thread to finish is called `join()`

```java
final void join() throws InterruptedException
```

This method waits until the thread on which it is called terminates.

##### Example 02

```java
// Using join() to wait for threads to finish.
class NewThread implements Runnable {
    String name; // name of thread
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }
    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
```
```java
class DemoJoin {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
```
##### Output

    New thread: Thread[One,5,main]
    New thread: Thread[Two,5,main]
    New thread: Thread[Three,5,main]
    Thread One is alive: true
    Thread Two is alive: true
    Thread Three is alive: true
    Waiting for threads to finish.
    One: 5
    Two: 5
    Three: 5
    One: 4
    Two: 4
    Three: 4
    One: 3
    Two: 3
    Three: 3
    One: 2
    Two: 2
    Three: 2
    One: 1
    Two: 1
    Three: 1
    Two exiting.
    Three exiting.
    One exiting.
    Thread One is alive: false
    Thread Two is alive: false
    Thread Three is alive: false
    Main thread exiting.


## External Resources

### Readings

* [JavaTPoint](https://www.javatpoint.com/join()-method)

### Youtube Videos

* [ProgrammingKnowledge](https://www.youtube.com/watch?v=8bSlaGsG4dk&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=45)

### More Examples and Practice Questions

Provided in the last chapter of current section.