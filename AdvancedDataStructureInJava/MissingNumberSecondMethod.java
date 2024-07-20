package AdvancedDataStructureInJava;

import java.util.Arrays;

public class MissingNumberSecondMethod
{
    public static int findMissingNumber(int []nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                return i+1;

            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 3
    }
}
