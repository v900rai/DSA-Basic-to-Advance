package multithreading;


public class BitManipulationDemo {
    public static void main(String[] args) {
        int a = 5; // 101 in binary
        int b = 3; // 011 in binary

        System.out.println("a & b = " + (a & b)); // 1
        System.out.println("a | b = " + (a | b)); // 7
        System.out.println("a ^ b = " + (a ^ b)); // 6
        System.out.println("~a = " + (~a));       // -6
        System.out.println("a << 1 = " + (a << 1)); // 10
        System.out.println("a >> 1 = " + (a >> 1)); // 2
    }
}
