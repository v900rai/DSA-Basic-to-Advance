package December2024;

public class SecondApporachIn {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};

        System.out.println(findMax(arr));
    }
    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
