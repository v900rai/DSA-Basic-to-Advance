package restartEverythingDSA2026;

public class CountThePrimeNumber {


        public static boolean isPrime(int n) {
            if (n <= 1)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        public static void main(String[] args) {
            int[] nums = {2, 3, 4, 5, 9, 11};

            int count = 0;
            for (int n : nums) {
                if (isPrime(n))
                    count++;
            }

            System.out.println("Prime numbers: " + count);
        }
    }


