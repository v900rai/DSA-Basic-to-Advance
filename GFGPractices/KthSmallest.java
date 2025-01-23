package GFGPractices;
import java.util.Arrays;

public class KthSmallest {

    public static void main(String[] args) {
        // Input array and the value of k
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        // Calling the kthSmallest function
        int result = kthSmallest(arr, k);

        // Printing the result
        System.out.println("The " + k + "rd smallest element is: " + result);
    }

    public static int kthSmallest(int arr[], int k) { // Updated to lowercase 'k'
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == k - 1) {
                count = arr[i]; // Corrected '=' for assignment
            }
        }
        return count;
    }
}
