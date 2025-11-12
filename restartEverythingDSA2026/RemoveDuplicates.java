package restartEverythingDSA2026;

public class RemoveDuplicates {
    public static int removeDuplicates(int nums[]){
        int count =0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != count){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(" before not removing elements "+nums.length);
        int len = removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + len);
    }
}
