package ArraysTop50InterveiwProblemsGFG;
import java.util.HashMap;
import java.util.Map;

public class Frequency {




        // Function to count and print frequency of each element
        public static void frequency(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();

            // Loop through the array and store frequency in HashMap
            for (int num : arr) {
                // If key exists, increment its value; otherwise, insert with 1
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // Print the frequency of each element
            for (var entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        // Main method to run the program
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

            System.out.println("Frequency of each element:");
            frequency(arr);
        }
    }


