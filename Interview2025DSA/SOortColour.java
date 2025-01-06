package Interview2025DSA;

public class SOortColour {


        public void sortColors(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }

        public static void main(String[] args) {


            // Example input array
            int[] nums = {2, 0, 2, 1, 1, 0};

            // Print array before sorting
            System.out.println("Before sorting:");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Call the sortColors method(nums);

            // Print array after sorting
            System.out.println("After sorting:");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }


