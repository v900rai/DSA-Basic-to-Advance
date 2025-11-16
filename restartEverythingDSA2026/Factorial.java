package restartEverythingDSA2026;


public class Factorial {

    public static int factorial(int n) {

        // Base case: stop when n becomes 0
        if (n == 0) {
            return 1;
        }

        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
