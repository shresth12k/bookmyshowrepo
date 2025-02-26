package synchronize;

import java.util.concurrent.locks.ReentrantLock;

public class adder implements  Runnable {
    private Count count;
    private final ReentrantLock mutex;
    ;


    public adder(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    /* //mutuex run menthod
        @Override
        public void run(){
            mutex.lock();
            try {
                for (int i = 0; i < 100; i++) {
                    //Count count1 = count;
                    count.val = count.val + 1;
                   // mutex.unlock();
                }
            }finally {
                mutex.unlock();
            }
        }
     */
    /*
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            //Count count1 = count;
            count.val = count.val + 1;
        }
    }
    */

    public void run() {
        for (int i = 0; i < 100; i++) {
            //Count count1 = count;
            synchronized (Count.class) {
                count.val = count.val + 1;
            }
        }
    }
}
