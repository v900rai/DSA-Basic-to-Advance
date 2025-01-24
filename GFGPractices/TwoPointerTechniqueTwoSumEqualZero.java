package GFGPractices;
import java.util.Arrays;
public class TwoPointerTechniqueTwoSumEqualZero {


        public static void main(String[] args) {
            int[] arr = {2, -2, 3, -3, 4, -4, 0};
            findZeroSumPairs(arr);
        }

        public static void findZeroSumPairs(int[] arr) {
            // Sort the array
            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            System.out.println("Pairs with sum 0:");

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("(" + arr[left] + ", " + arr[right] + ")");
                    left++;
                    right--;
                } else if (sum <0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }


