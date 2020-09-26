/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}