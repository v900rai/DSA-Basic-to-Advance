package ArraysInterviewPeoblem2025;
import java.util.Arrays;
public class SecondLargestElements {
    // Java program to find the second largest element in the array
// using two traversals





        // Function to find the second largest element in the array
        static int getSecondLargest(int[] arr) {
            int n = arr.length;

            int largest =Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            // Finding the largest element
            for (int i = 0; i < n; i++) {
                if (arr[i] > largest)// nikal liya fir arr[i] m dal diya
                    largest = arr[i];
            }

            // Finding the second largest element
            for (int i = 0; i < n; i++) {

                // Update second largest if the current element is greater
                // than second largest and not equal to the largest
                if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
            return secondLargest;
        }

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 36, 2};
            System.out.println(getSecondLargest(arr));
        }
    }

