package ArraysProgram;

public class revers {
    public static void main(String []args){
        int arr[]={ 1,2,3,4,5};
        revresarry(arr ,arr.length, 3);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void revresarry(int arr[],int n, int k ){
        int i=0;
        int j=k-1;
        while(i<n/2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }



    }
}
