package ArraysInterviewPeoblem2025;

public class BinarySearch {
        public static int binarySearch(int[] arr, int target) {
            int left = 0;

            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; //middle elements count

                if (arr[mid] == target) {
                    return mid; // Return the index if found
                } else if (arr[mid] < target) {
                    left = mid + 1; // Search the right half
                } else {
                    right = mid - 1; // Search the left half
                }
            }
            return -1; // Return -1 if not found
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 5, 5, 6, 9}; // Sorted array
            int target = 5;
            int result = binarySearch(arr, target);
            System.out.println("Element found at index: " + result); // Output: 2
        }
    }

