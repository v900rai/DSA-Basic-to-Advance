package restartEverythingDSA2026;

public class MaxSumSubarrayK {



        public static void main(String[] args) {

            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;

            int result = maxSumSubarray(arr, k);
            System.out.println("Maximum Sum = " + result);
        }

        public static int maxSumSubarray(int[] arr, int k) {

            int windowSum = 0;
            int maxSum = 0;

            for (int i = 0; i < arr.length; i++) {

                windowSum += arr[i]; // add current element

                // when window size reaches k
                if (i >= k - 1)
                {

                    maxSum = Math.max(maxSum, windowSum);

                    // remove element going out of window
                    windowSum -= arr[i - (k - 1)];
                }
            }

            return maxSum;
        }
    }


