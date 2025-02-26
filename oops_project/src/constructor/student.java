package constructor;

public class student {
    private String name="sk";
    private int a=10;

    //parameterized c onstructor
    public student (String stname,int id){
        name=stname;
        a=id;
    }
    public String getname(){
        return name;
    }
    public void setname(){
        this.name=name;
    }
    public int getid(){
        return a;
    }
    public void setid(int a){
        this.a=a;
    }
}
