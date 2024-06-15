package ArraysProgram;

public class secondlargest {
    public static void main(String []args){

        int arr[]={ 1,7,9,4,3};
        int ans=findSecondLargestElement(arr, arr.length);
        System.out.println(ans);

    }
    public static int findSecondLargestElement(int arr[], int n){
        // STEP:1 -> first find the largest element
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //  // STEP:2 -> now find the largest element again but egnour the max
        int secondMax=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
