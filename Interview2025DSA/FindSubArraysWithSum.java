package Interview2025DSA;

public class FindSubArraysWithSum {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 7, 5};
            int n=arr.length;
            int target = 12;
            int start = 0;
            int end = 0;
            int sum = 0;

            while (end < n) {
                sum += arr[end];

                while (sum > target) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == target) {
                    System.out.println("Subarray: [" + start + ", " + end + "]");
                    return;
                }
                end++;
            }
        }
}
