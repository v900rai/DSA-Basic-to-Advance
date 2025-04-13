package ArraysTop50InterveiwProblemsGFG;


    public class LargestElement {
        public static int findLargest(int[] arr) {
            int max = arr[0]; // Assume first element is the largest
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // Update max if current element is greater
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 20, 8};
            System.out.println("Largest Element: " + findLargest(arr));
        }
    }


