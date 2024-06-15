package SortAlgorithm;

public class selecationSort {
    static void selection_sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int minValue=i;
           for(int j=i+1; j<n; j++){
               if(arr[j]<arr[minValue]){
                   minValue=j;
               }
           }
            int temp = arr[minValue];
           arr[minValue]=arr[i];
           arr[i]=temp;
        }
        System.out.print("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            System.out.print("Before selection sort:");
            System.out.print(arr[i]+" ");
        }
        System.out.println();

                selection_sort(arr,n);

    }
}
