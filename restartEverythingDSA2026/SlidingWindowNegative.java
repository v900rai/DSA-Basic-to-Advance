package restartEverythingDSA2026;

public class SlidingWindowNegative {

    

        // function that works for positive + negative numbers
        public static int maxSubarraySum(int[] arr, int k) {

            int sum = 0;
            int max = Integer.MIN_VALUE; // 🔥 important change

            for (int i = 0; i < arr.length; i++) {

                sum += arr[i]; // right se add

                if (i >= k - 1) { // window complete
                    max = Math.max(max, sum);
                    sum -= arr[i - (k - 1)]; // left se remove
                }
            }

            return max;
        }

        public static void main(String[] args) {

            int[] arr = {-5, -2, -3, -1};
            int k = 2;

            System.out.println("Maximum sum = " + maxSubarraySum(arr, k));
        }
    }
