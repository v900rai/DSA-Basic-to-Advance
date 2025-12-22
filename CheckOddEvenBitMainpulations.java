public class CheckOddEvenBitMainpulations {
    public static void main(String[] args) {
        checkOddEven(6);
        checkOddEven(7);
    }
    public  static void checkOddEven(int n){

        // If last bit is 0 → even, 1 → odd
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

    }
}
