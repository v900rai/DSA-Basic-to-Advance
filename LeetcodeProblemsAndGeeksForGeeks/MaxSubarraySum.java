package LeetcodeProblemsAndGeeksForGeeks;
 public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    public static int maxSubarraySum(int arr[]) {
        int n = arr.length; // Array length
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                res = Math.max(res, currentSum); // Update max sum
            }
        }
        return res;
    }
}
