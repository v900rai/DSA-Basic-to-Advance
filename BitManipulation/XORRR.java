package BitManipulation;

public class XORRR {
    public static void main(String arsg[]){

        int a = 2, b = 3;
        System.out.println("a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }
    }

