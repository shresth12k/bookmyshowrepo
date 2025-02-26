/*
package semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt> store=new ConcurrentLinkedDeque<>();
        Semaphore semsproducer=new Semaphore(1);
        Semaphore semaconsumer=new Semaphore(1);
        Producer producer1=new Producer(store,"Producer1",semsproducer,semaconsumer);
        Producer producer2=new Producer(store,"Producer2",semsproducer,semaconsumer);
        Producer producer3=new Producer(store,"Producer3",semsproducer,semaconsumer);
        Producer producer4=new Producer(store,"Producer4",semsproducer,semaconsumer);
        Producer producer5=new Producer(store,"Producer5",semsproducer,semaconsumer);
        Thread tp1=new Thread(producer1);
        Thread tp2=new Thread(producer2);
        Thread tp3=new Thread(producer3);
        Thread tp4=new Thread(producer4);
        Thread tp5=new Thread(producer5);
        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();
        Consumer consumer1=new Consumer(store,"Consumer1",semsproducer,semaconsumer);
        Consumer consumer2=new Consumer(store,"Consumer2",semsproducer,semaconsumer);
        Consumer consumer3=new Consumer(store,"Consumer3",semsproducer,semaconsumer);
        Consumer consumer4=new Consumer(store,"Consumer4",semsproducer,semaconsumer);
        Consumer consumer5=new Consumer(store,"Consumer5",semsproducer,semaconsumer);
        Thread tc1=new Thread(consumer1);
        Thread tc2=new Thread(consumer2);
        Thread tc3=new Thread(consumer3);
        Thread tc4=new Thread(consumer4);
        Thread tc5=new Thread(consumer5);
        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();

    }
}
*/