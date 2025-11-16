package restartEverythingDSA2026;

public class Recursion1 {

    public static void sayHello(int n){
        if(n == 0){
            return; // base case
        }
        System.out.println("Hello Vishal Rai!");
        sayHello(n-1);
    }

    public static void main(String[] args) {
        sayHello(3);
    }

}
