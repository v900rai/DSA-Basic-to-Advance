package JavaOops.SingletonClass;

public class Singleton {
    private static Singleton obj=new Singleton();
    private String massage;
    private Singleton(){
        //constructor declare

    }
    public static Singleton getInstance(){
        return obj;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
