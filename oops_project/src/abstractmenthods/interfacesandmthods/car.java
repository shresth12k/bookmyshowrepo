package abstractmenthods.interfacesandmthods;
//to use abstarct keyword use the below keyword abstract car
public abstract  class car {
    private int a;
    public int  getwheels(){
        return a;
    }
    public void setwheels(){
        this.a=a;
    }
    public abstract void StartEngine();
    public abstract void startAc();
    public void newcar(){
        System.out.print("shresth -new car");
    }
}
//interfaces only deals with behavious and not deals with data
//interfaces only have  methods and not attributes
//interface can have only static and final variables
//so no use of creating object as methods




