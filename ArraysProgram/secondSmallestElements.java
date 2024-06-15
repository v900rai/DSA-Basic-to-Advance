package ArraysProgram;

public class secondSmallestElements {
    public static void main(String args[]){
        int arr[]={ 1,3, 6,7,9,4,};
        int ans=findSecondSmallestElements(arr, arr.length);
        System.out.println(ans);

    }
    public static int findSecondSmallestElements(int arr[], int n){
        //...>Steps fint the second smallest elements
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        // steps two fint the elements second largest but ignour the first min
        int secondMinElements=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){

            if(arr[i]<secondMinElements && arr[i]!=min){
                secondMinElements=arr[i];

            }
        }
        return secondMinElements;

    }

}
