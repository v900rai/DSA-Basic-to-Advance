package DSA100Challenge;

public class MaxSubArarys {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    private static int  maxSubarraySum(int[] arr) {
        int res=arr[0];
        for(int i=0; i<arr.length; i++){
           int  currentSum=0;
            for(int j=i; j<arr.length; j++){
                currentSum+=arr[j];
                res=Math.max(currentSum, res);
            }

    }
        return res;

}


}
