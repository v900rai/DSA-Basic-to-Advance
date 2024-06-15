package JavaOops.SingletonClass;

public class MainSingleton {
    public static void main(String []args){
        Singleton s1=Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        s1.setMassage("Vishal");
        s2.setMassage("rai");
        System.out.println(s1.getMassage() +" "+s2.getMassage());



        System.out.println(" s1  ..>"+ s1.hashCode());
        System.out.println(" s2 ...>"+ s2.hashCode());
        ///right now only print hashcode only
    }

}
