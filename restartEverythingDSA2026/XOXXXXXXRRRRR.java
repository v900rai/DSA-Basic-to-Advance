package restartEverythingDSA2026;

public class XOXXXXXXRRRRR {
    public static void main(String[] args) {
       /* int a = 5;   // 101
        int b = 3;   // 011
        int result = a ^ b;

        System.out.println(result); // 6*/

            int a = 10;
            int b = 20;

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
    }
}