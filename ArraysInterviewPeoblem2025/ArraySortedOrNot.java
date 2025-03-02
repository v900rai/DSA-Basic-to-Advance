package ArraysInterviewPeoblem2025;

public class ArraySortedOrNot {
    public static boolean arraySortedOrNot(int arr[] ,int n){
        if(n==0 || n==1){
            return true;
        }
        for(int i=1; i<n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
            return true;

    }

    public static void main(String[] args) {

        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;

        if (arraySortedOrNot(arr, n))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }

}
