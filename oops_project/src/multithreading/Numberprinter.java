package multithreading;

public class Numberprinter implements Runnable{
    private int x;
    public  Numberprinter(int x){
        this.x=x;
    }
    @Override
    public void run(){
     //   for(int i=0;i<100;i++){
            System.out.println("3.Hello worlld tun" + Thread.currentThread().getName());

//            System.out.print(i);
//        }
    }
}
