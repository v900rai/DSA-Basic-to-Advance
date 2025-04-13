package ArraysTop50InterveiwProblemsGFG;


    public class IsSorted {
        public static boolean isSorted(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false; // Not sorted
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 2, 3, 5};
            System.out.println("Is Sorted: " + isSorted(arr));
        }
    }


