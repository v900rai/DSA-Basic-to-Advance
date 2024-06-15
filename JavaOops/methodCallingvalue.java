package JavaOops;

public class methodCallingvalue {
    public static void main(String[] args) {
        float m=f1(12.1,13.3);
        System.out.println(m);

    }
    public static float f1(double d1,double d2){
        System.out.println(d1);
        System.out.println(d2);
        return 10.1f;
    }
}
