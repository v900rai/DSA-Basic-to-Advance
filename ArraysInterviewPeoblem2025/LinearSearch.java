package ArraysInterviewPeoblem2025;

public class LinearSearch {

        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==target) {
                    return i; // Return the index if found
                }
            }
            return -1; // Return -1 if not found
        }

        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int target = 9;
            int result = linearSearch(arr, target);
            System.out.println("Element found at index: " + result); // Output: 2
        }
    }

