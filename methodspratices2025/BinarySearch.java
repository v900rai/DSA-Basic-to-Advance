package methodspratices2025;

public class BinarySearch {

    public static int binarySearch(int nums[], int target){
        int left =0;
        int right =nums.length-1;
        while (left <=right){
            int mid = left +(right-left)/2;

            if(nums[mid] ==target){
                return mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
