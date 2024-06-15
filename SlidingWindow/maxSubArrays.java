package SlidingWindow;

public class maxSubArrays {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

    }
    public static int maxSum(int[] arr, int n, int k){
        int max=Integer.MIN_VALUE;
        // Consider all blocks starting with i.
        for(int i=0; i<n-k+1; i++){
           int  SumOfCurrent=0;
           for(int j=0; j<k; j++){
               SumOfCurrent+=arr[i+j];
               max= Math.max(SumOfCurrent, max);
           }

        }
        return max;

    }

}
