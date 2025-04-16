package ArraysTop50InterveiwProblemsGFG;

public class GetSum {
    public static int getSum(int nums[]){
        int n=nums.length;
        if(n% 2==0){
            return 0; //n is even
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
        }
        return sum;

    }
    public static void main(String args[]){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(getSum(arr1));
        System.out.println(getSum(arr2));
    }
}
