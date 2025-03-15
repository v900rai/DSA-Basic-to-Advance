package ArraysInterviewPeoblem2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestNumberFind {

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(tthirdLargest(arr));
        System.out.println(thirdLargest(arr));
    }

    public static int tthirdLargest(int[] arr) {
        int n = arr.length;
        // sort the arraus
        Arrays.sort(arr);
        return arr[n - 3];
    }

    // second methods used
    public static int thirdLargest(int arr[]) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }
        //find the second largest elements given arrays
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        // Find the third largest element.
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }

        // Return the third largest element
        return third;

    }
}
