package ArraysProgram;

public class smallestElement {
    public static void main(String []args){
        for(int i = 0; i < args.length; ++i){
            System.out.println(args[i]);
        }
        int arr[]={ 3,4,9,0,-1};
       int ans= smallestelemttt(arr, arr.length);
       System.out.println(ans);
    }
    public static int smallestelemttt(int arr[] , int n){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}



