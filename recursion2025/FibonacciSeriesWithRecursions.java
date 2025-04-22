package recursion2025;

public class FibonacciSeriesWithRecursions {
    public static int fibnonacciWithRecursions(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibnonacciWithRecursions(n - 1) + fibnonacciWithRecursions(n - 2);
        }
    }

    public static void main(String[] args) {

        // Initialize variable n.
        int n = 5;
        System.out.print("Fibonacci series of 5 numbers is: ");

        // for loop to print the fibonacci series.
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibnonacciWithRecursions(i)+" ");
        }
    }

}
