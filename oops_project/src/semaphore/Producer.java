package semaphore;

import java.sql.SQLOutput;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private Semaphore semaproducer;
    private Semaphore semaconsumer;

    public Producer (Queue<Shirt> store,String name,Semaphore semaconsumer,Semaphore semaproducer){
        this.store=store;
        this.name=name;
        this.semaconsumer=semaconsumer;
        this.semaproducer=semaproducer;
    }


//    public Producer(Queue<Shirt> store, String name) {
//        this.store = store;
//        this.name = name;
//    }

    @Override
    public void run() {
        while (true) {
            try{
                System.out.println("Size of the store : " + store.size() + "Producer Entering the store :" + name);
                semaproducer.acquire();
                store.add(new Shirt());
                semaconsumer.release();
            }catch(Exception e) {
                System.out.println("Exception");
            }
        }
    }
}
