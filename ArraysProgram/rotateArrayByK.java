package ArraysProgram;

import static ArraysProgram.revers.revresarry;

public class rotateArrayByK {
    public  static void main(String []args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateArrayByD(arr, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArrayByD(int arr[], int k){
        reverse(arr , 0, k-1);
        reverse(arr,k, arr.length-1 );
        reverse( arr, 0, arr.length-1);
    }

    private static void reverse(int arr[], int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
