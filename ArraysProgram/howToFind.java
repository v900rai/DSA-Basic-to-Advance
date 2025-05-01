package ArraysProgram;

public class howToFind {
    // Java program for the above approach


        // Function to check if a number is even or odd
        public static void checkEvenOdd(int N)
        {
            // Find remainder
            int r = N % 2;

            // Condition for even
            if (r == 0) {
                System.out.println("Even");
            }
            // Otherwise
            else {
                System.out.println("Odd");
            }
        }

        // Driver code
        public static void main(String[] args)
        {
            // Given number N
            int N = 101;

            // Function call
            checkEvenOdd(N);
        }
    }

