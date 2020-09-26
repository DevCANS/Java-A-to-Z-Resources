/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

class Consumer implements Runnable {
    Q q;
    
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    
    public void run() {
        while(true) {
            q.get();
        }
    }
}