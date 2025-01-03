package Interview2025DSA;

public class RemoveDuplicatesSortedArrays {

        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 3, 3, 4};
            int index = 1; // Pointer for the next unique element

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[index] = nums[i];
                    index++;
                }
            }

            for (int i = 0; i < index; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }


