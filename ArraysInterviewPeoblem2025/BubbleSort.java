package ArraysInterviewPeoblem2025;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String []args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 5, 5, 6, 9]
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    }

