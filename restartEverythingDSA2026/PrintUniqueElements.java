package restartEverythingDSA2026;
import java.util.*;
public class PrintUniqueElements {



        // Function to print unique elements
        void unique(int[] arr) {

            // Map to store frequency of each number
            HashMap<Integer, Integer> map = new HashMap<>();

            // Count frequency
            for(int x : arr) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            // Print elements whose frequency is 1 (unique)
            System.out.println("Unique elements are: ");
            for(int x : map.keySet()) {
                if(map.get(x) == 1) {
                    System.out.println(x);
                }
            }
        }

        // Main method to run the program
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            // Create array
            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        }
    }


