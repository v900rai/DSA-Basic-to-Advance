package December2024;

public class MaximumelementInASortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};

        System.out.println(findMax(arr));
    }
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            max=Math.max(arr[i], max);

        }
        return max;

    }

}
