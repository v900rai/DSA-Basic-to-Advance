package ArraysInterviewPeoblem2025;

public class DutchNationalFlagAlgorithm {

    public static  void sort012(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int mid=0;
       int temp=0;
        while (mid<=right){
            if(arr[mid]==0){
                swap(arr ,mid,left);
                left++;
                mid++;

            }
            else if (arr[mid]==1){
                mid++;

            }
            else {
                swap(arr, mid, right);
                right--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sort012(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
