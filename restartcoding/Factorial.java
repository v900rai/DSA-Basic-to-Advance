package restartcoding;

public class Factorial {
        public static int factorial(int n) {
            int ans = 1;
            for (int i = 2; i <= n; i++) {
                // calculating the factorial
                ans = ans * i;
            }
            return ans;
        }

        public static void main(String[] args)
        {
            int num = 5;
            System.out.println( factorial(5));
        }

}
