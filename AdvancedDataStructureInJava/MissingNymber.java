package AdvancedDataStructureInJava;

public class MissingNymber {
    public static void main(String args[]){
        int[] nums = {1, 2, 4, 5, 6};
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 3
    }
    public static int findMissingNumber(int[] nums){
        int n=nums.length+1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
}
