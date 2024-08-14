package AdvancedDataStructureInJava;


import java.util.Arrays;

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {

        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int index = 0;

        // Append elements from arr1 to result
        for (int element : arr1) {
            result[index] = element;
            index++;
        }

        // Append elements from arr2 to result
        for (int element : arr2) {
            result[index] = element;
            index++;
        }

        // Sort the merged array
        Arrays.sort(result);

        // Sum of the two middle elements
        int sum = result[length/2] + result[(length/2) - 1];

        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("Sum of middle elements: " + sol.SumofMiddleElements(arr1, arr2));  // Output should be 7
    }
}
