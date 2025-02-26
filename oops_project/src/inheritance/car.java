package inheritance;

import java.io.PrintStream;

public class car {
    private int id;
    private String name;
    private int noofwheels;

//    public car(){
//        System.out.println("car");
//    }
    public car(int a,String name,int wheels){
        System.out.println ("this constructor executes first");// this constructor executes first
        this.id=a;
        this.name=name;
        this.noofwheels=wheels;
    }
    public void printelectriccar(){
        System.out.print("Inside lectric car menthod");
    }
    public String getname(){
        return name;
    }
    public void setname(){
        this.name=name;
    }
    public  int getid(){
        return id;
    }
    public  void setid(int id){
        this.id=id;
    }
    public int getwheels(){
        return noofwheels;
    }
    public void setwheels(int noofwheels){
        this.noofwheels=noofwheels;
    }
}
