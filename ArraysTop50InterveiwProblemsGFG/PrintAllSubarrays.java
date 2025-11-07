package ArraysTop50InterveiwProblemsGFG;


    public class PrintAllSubarrays {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            int n = arr.length;

            System.out.println("All Subarrays:");

            // Outer loop for starting index
            for (int i = 0; i < n; i++) {
                // Inner loop for ending index
                for (int j = i; j < n; j++) {
                    // Print elements from i to j
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                        if (k < j) System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }
    }


