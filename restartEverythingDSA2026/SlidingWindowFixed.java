package restartEverythingDSA2026;

public class SlidingWindowFixed {

    public static int maxSumSubarray(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];      // add next
            windowSum =windowSum- arr[i - k];  // remove left

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}
