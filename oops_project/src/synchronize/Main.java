/*
package synchronize;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // for mutuex we will need to create this
        ReentrantLock mutex=new ReentrantLock();
        Count count=new Count();
        adder Adder=new adder(count,mutex);
        subtractor Subtractor = new subtractor(count,mutex);

        Thread adderThread = new Thread(Adder);
        Thread subThread=new Thread(Subtractor);
        adderThread.start();
        subThread.start();
        adderThread.join();
        subThread.join();

        System.out.print(("Count" +count.val));

    }
}
*/
