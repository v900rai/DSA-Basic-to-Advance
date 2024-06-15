package ArraysProgram;

public class LeftRotateOnce {
    public static void main(String []args){
        int arr[]={1,2,3,4,5};
        int n=5;
        rotateOnce(arr,n);
    }
    private static void rotateOnce(int arr[], int m){
        int temp=arr[0];
        for (int i = 0; i <m-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[m-1]=temp;
        for(int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
