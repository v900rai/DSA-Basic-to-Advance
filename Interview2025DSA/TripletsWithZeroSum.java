package Interview2025DSA;


    import java.util.ArrayList;
import java.util.List;

    public class TripletsWithZeroSum {
        public static void findTriplets(int[] arr) {
            int n = arr.length;
            boolean found = false;

            // Check every possible triplet
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                            found = true;
                        }
                    }
                }
            }

            if (!found) {
                System.out.println("No triplets found.");
            }
        }

        public static void main(String[] args) {
            int[] arr = {-1, 0, 1, 2, -1, -4};
            System.out.println("Triplets with zero sum are:");
            findTriplets(arr);
        }
    }


