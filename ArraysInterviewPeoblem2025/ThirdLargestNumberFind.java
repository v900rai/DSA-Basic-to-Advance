package ArraysInterviewPeoblem2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestNumberFind {

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest(arr));
    }
    public static int thirdLargest(int [] arr){
        int n=arr.length;
        // sort the arraus
        Arrays.sort(arr);
        return  arr[n-3];
    }
}
