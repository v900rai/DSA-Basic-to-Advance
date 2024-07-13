package July2024;

public class ArrayReverseLooping {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }
    public static void reverseArray(int arr[], int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void printArray(int arr[], int size){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  " );
            System.out.println();
        }

    }
}
