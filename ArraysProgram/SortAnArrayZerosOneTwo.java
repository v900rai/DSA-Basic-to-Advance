package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArrayZerosOneTwo {
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArrays(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
    public static void sortArrays(ArrayList<Integer> arr, int n){
        int count0=0; int count1=1; int count2=2;
        for(int i=0; i<n; i++){
            if(arr.get(i)==0){
                count0++;
            } else if (arr.get(i)==1) {
                count1++;

            }
            else{
                count2++;
            }
        }
        //Replace the places in the original array:
        for(int i=0; i<count0; i++){
            arr.set(i,0); // repling 000,s
        }
        for (int i=count0; i<count0+count1; i++){
            arr.set(i,1);
        }
        for(int i=count0+count1;i<n; i++){
            arr.set(i,2);
        }

    }
}
