package ArraysProgram;

public class maximumSubarraySum {
    public static void main(String[] args) {
        int arr[]={5 , 2, -1, 4 ,3};
        int n=arr.length;
        maximumSubarraySum(arr ,n);

    }
    private static void maximumSubarraySum(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
               // int sum=0;
               /// for(int k=i; k<=j; k++){
//                    System.out.print(arr[k]+" ");
                    //sum+=arr[k];
                sum=sum+arr[j];
                }
                max = Math.max(max, sum);
//                System.out.print(" ->  ");
//                System.out.println(sum);
        }
        System.out.println(max);

    }

    }


