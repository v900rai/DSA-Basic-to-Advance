package restartEverythingDSA2026;

public class printAllSubbArrays {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            printSubarrays(arr);
        }

        public static void printSubarrays(int[] arr) {

            int n = arr.length;

            // Start index
            for (int start = 0; start < n; start++) {

                // End index
                for (int end = start; end < n; end++) {

                    // Print elements from start to end
                    System.out.print("[ ");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
    }


