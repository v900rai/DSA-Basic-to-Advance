package pattern2026;

public class MaxMinHeap {


        public boolean isMaxHeap(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n / 2; i++) { // sirf parent nodes

                int left = 2 * i + 1;
                int right = 2 * i + 2;

                // agar left child bada hai parent se
               
                if(left < n && arr[i] < arr[left]){
                    return false;
                }

                // agar right child bada hai parent se
                if (right < n && arr[i] < arr[right]) {
                    return false;
                }
            }

            return true;
        }

        // 🔥 MAIN METHOD
        public static void main(String[] args) {

           MaxMinHeap obj= new MaxMinHeap();

            // Test Case 1 (Valid Max Heap)
            int[] arr1 = {90, 15, 10, 7, 12, 2};
            System.out.println("Is Max Heap? " + obj.isMaxHeap(arr1));

            // Test Case 2 (Not a Max Heap)
            int[] arr2 = {10, 20, 30, 40};
            System.out.println("Is Max Heap? " + obj.isMaxHeap(arr2));
        }
    }

