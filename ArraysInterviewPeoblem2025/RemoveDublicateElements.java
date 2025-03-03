package ArraysInterviewPeoblem2025;

import java.util.HashSet;

public class RemoveDublicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDublicateElem(arr);
        System.out.println(newSize);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static int removeDublicateElem(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }
}

