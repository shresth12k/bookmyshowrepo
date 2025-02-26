package constructor;

public class iphone {
     int version;
    private int ram;
    private int megapixel;
    private int cameramp;


    public iphone(){

    }
    public iphone(int version,int ram,int megapixel,int cameramp){
        this.version=version;
        this.megapixel=megapixel;
        this.ram=ram;
        this.cameramp=cameramp;
    }

    public iphone(iphone Iphone){
        version=Iphone.version+1;
        ram=Iphone.ram-1;
        megapixel=Iphone.megapixel*2;
        cameramp=Iphone.cameramp;

    }
    public int getversion(){
        return version;
    }
}
