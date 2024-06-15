package SearchingInDsaJava;

public class firstLastOccurrenceBinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};
        int k=8;
        int lb= lowerBound(arr, k);
       int ub= upperBound(arr, k);

       if(lb == arr.length || arr[lb] != k){
           System.out.println("-1 & -1");
           return;
       }

       System.out.println(lb + " and " + (ub - 1));
    }
    private static int lowerBound(int arr[], int m){
        int low=0;
        int high =arr.length-1;
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private static int upperBound(int arr[], int m){
        int low=0;
        int high =arr.length-1;
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
