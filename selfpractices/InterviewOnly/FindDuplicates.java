package selfpractices.InterviewOnly;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(array);
    }
    public static void findDuplicates(int arr[]){
        HashSet <Integer> seen =new HashSet<>();
        HashSet <Integer> duplicate=new HashSet<>();
        for(int num : arr){
            if(seen.contains(num)){
                duplicate.add(num);
            }
            else {
                seen.add(num);
            }

        }
        System.out.println("Duplicates: " + duplicate);
    }
}
