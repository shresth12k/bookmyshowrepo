package inheritance;

public class electriccar extends car {
    public electriccar(int a,String name,int wheels){
        super(a,name,wheels);
    }
    public void printelectriccar(){
        System.out.print("inside electric car method");
    }
}
