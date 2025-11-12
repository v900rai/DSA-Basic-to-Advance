package restartEverythingDSA2026;

public class ReversArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        for (int n : arr) System.out.print(n + " ");
    }
    public static void reverse(int nums[]){
        int left =0;
        int right = nums.length-1;
        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
