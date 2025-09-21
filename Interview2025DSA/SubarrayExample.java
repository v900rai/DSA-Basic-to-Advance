package Interview2025DSA;

public class SubarrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array

        // Outer loop: starting index
        for (int start = 0; start < arr.length; start++) {
            // Inner loop: ending index
            for (int end = start; end < arr.length; end++) {

                // Print current subarray
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    if (k < end) System.out.print(", "); // for nice formatting
                }
                System.out.println("]");
            }
        }
    }
}
