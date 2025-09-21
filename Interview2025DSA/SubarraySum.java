package Interview2025DSA;



public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int start = 0; start < arr.length; start++) {
            int sum = 0; // har naya subarray ke liye sum reset
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                System.out.println("Subarray sum from index " + start + " to " + end + " = " + sum);
            }
        }
    }
}
