package selfpractices.InterviewOnly;


    class Solution {
        public void rotate(int[] num, int k) {
            if (num == null || num.length == 0 || k <= 0) {
                return;
            }

            k = k % num.length;  // Handle case when k is greater than array length

            reverse(num, 0, num.length - 1);
            reverse(num, 0, k - 1);
            reverse(num, k, num.length - 1);
        }

        public void reverse(int num[], int start, int end) {
            while (start < end) {
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            sol.rotate(arr, k);
            System.out.println("Rotated array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

}
