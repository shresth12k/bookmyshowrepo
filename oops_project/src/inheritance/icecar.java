package inheritance;

import java.util.Calendar;

public class icecar extends car {
    private String fueltype;
    //constructor
    public icecar(int a,String name,int wheels,String fueltype){
        super(a,name,wheels);// this constructor executes second
        System.out.println("this constructor executes second");
        this.fueltype=fueltype;
    }

    public void printcardetails(){
        //car c=new car();
        System.out.print(getid());
    }
   // System.out.print()
}
