package Interview2025DSA;


class Solution {
    // Method to find the single non-repeating element
    public int singleNonRepeating(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num; // XOR cancels out duplicate elements
        }
        return xor;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case: array with all elements repeating except one
        int[] nums = {4, 1, 2, 1, 2};

        // Find the single non-repeating element
        int result = solution.singleNonRepeating(nums);

        // Print the result
        System.out.println("The single non-repeating element is: " + result);
    }
}
