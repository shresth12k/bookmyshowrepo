package semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private Semaphore semaproducer;
    private Semaphore semaconsumer;

    public Consumer (Queue<Shirt> store,String name,Semaphore semaconsumer,Semaphore semaproducer){
        this.store=store;
        this.name=name;
        this.semaconsumer=semaconsumer;
        this.semaproducer=semaproducer;
    }

    @Override
    public void run(){
        while (true){
            try{
                System.out.println("Size of the store : " + store.size() + "Consumer Entering the store :" + name);
                semaconsumer.acquire();
                store.poll();
                semaproducer.release();
            }catch(Exception e) {
                System.out.println("Exception");
            }
        }
    }
}
