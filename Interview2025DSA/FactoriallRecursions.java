package Interview2025DSA;

public class FactoriallRecursions {

        public static int factorial(int n) {
            if (n == 0 || n == 1) return 1; // Base case
            return n * factorial(n - 1);    // Recursive case
        }

        public static void main(String[] args) {
            int n = 5;
            System.out.println("Factorial of " + n + " is " + factorial(n));
        }
    }

