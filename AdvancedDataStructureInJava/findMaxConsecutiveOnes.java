package AdvancedDataStructureInJava;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        int ans=findMaxConsecutiveOness(nums);
        System.out.println("the maximum consecutive 1,s ans"+ans);
    }
    public static int findMaxConsecutiveOness(int nums[]){
        int count=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] ==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
