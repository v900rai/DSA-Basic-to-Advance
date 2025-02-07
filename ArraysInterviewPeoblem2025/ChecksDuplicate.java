package ArraysInterviewPeoblem2025;

import java.util.HashSet;
import java.util.*;
public class ChecksDuplicate {
    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean checkDuplicatesWithinK(int arr[], int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]))
                return true;
            set.add(arr[i]);
            // Remove the k+1 distant item
            if (i >= k)
                set.remove(arr[i-k]);
        }
        return false;
        }
    }


