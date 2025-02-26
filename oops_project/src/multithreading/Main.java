/*
package multithreading;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("1.Hello worlld main thread" + Thread.currentThread().getName());
        Helloworld hwp=new Helloworld();
        Thread t=new Thread(String.valueOf(hwp));
        t.run();//main
        t.start();
        System.out.println("4.Hello worlld main thread" + Thread.currentThread().getName());//main thread itself
        t.run();
        System.out.println("2.Hello worlld main thread" + Thread.currentThread().getName());//main thread itself
    }
        //we dont normally user thread .start() as it makes it difficult to bind so instead of this we use executers framework
    for (int i = 0; i < 100; i++) {
            Numberprinter nwp = new Numberprinter(i);
            Thread t = new Thread(nwp);
            t.start();
        }
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            Numberprinter numberprinter=new Numberprinter(i);
            executorService.submit(numberprinter);
        }
        executorService.close();
        ExecutorService executorService=Executors.newFixedThreadPool(1);
        addtwonos add=new addtwonos();

        //we cant use normal double so we use future for callables
        Future<Double> addResultFuture=executorService.submit(add);
       //get method with hold the value in it and until it is called it doesnt execute
        double addresult = addResultFuture.get();
        System.out.print(addresult);
    }
}
*/