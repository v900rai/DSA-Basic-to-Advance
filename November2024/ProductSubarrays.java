package November2024;
import java.io.*;
public class ProductSubarrays {
    // Java program to find Maximum Product Subarray using
// nested loops





        // Function to return the product of max product subarray
        static int maxProduct(int arr[]) {
            int n = arr.length;

            // Initializing result
            int result = arr[0];

            for (int i = 0; i < n; i++) {
                int mul = 1;

                // traversing in current subarray
                for (int j = i; j < n; j++) {
                    mul *= arr[j];

                    // updating result every time
                    // to keep track of the maximum product
                    result = Math.max(result, mul);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int arr[] = { -2, 6, -3, -10, 0, 2 };
            System.out.println(maxProduct(arr));
        }
    }


