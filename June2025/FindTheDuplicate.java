package June2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4};
        System.out.println(checkDuplicates(arr));
        System.out.println(hashSetcheckDuplicates(arr));
        System.out.println(checkDuplicatesArrySort(arr));
    }

    public static boolean hashSetcheckDuplicates(int nums[]){
        int n=nums.length;
        Set<Integer> list=new HashSet<Integer>();
        for(int i=0; i<n; i++){
            if(list.contains(nums[i])){
                return true;
            }
            list.add(nums[i]);

        }
        return false;

    }
    public static boolean checkDuplicates(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean checkDuplicatesArrySort(int[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Iterate through the sorted array
        for (int i = 1; i < n; i++) {

            // Check if adjacent elements are equal
            if (arr[i] == arr[i - 1])
                return true;
        }

        // If no duplicates are found, return false
        return false;
    }
}
