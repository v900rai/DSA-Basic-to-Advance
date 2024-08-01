package AdvancedDataStructureInJava;



public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        int n=nums.length;
        if(n==0){
            return n;
        }
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]==nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;


    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newLength = removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
