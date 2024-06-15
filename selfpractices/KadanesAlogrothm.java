package selfpractices;

public class KadanesAlogrothm {
    public static void main(String[] args) {
        int arr[]={5,-4,-2,6,-1};
        int n=5;
        int result=maxSubArrays(arr,n);
        System.out.println(result);

    }
   static int maxSubArrays(int a[], int n){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<n; i++){
           currSum=currSum+a[i];
           if(currSum>max){
               max=currSum;
           }
           if(currSum<0){
               currSum=0;
           }
        }
        return max;

   }
}
