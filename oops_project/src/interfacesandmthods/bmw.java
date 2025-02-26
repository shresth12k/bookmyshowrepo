package interfacesandmthods;

public class bmw implements car{
    @Override
    public void StartEngine(){
    System.out.print("startengine rc bmw");
    }
    @Override
    public void startAc(){
        System.out.print("startac rc bmw");
    }
}
