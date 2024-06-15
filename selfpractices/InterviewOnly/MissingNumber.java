package selfpractices.InterviewOnly;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arrr[] ={3,4,1,-1};
        int miss=missingNumber(arrr);
        System.out.println("Showing the missing number "+miss);


    }
    public static int missingNumber(int arr[]){
        Arrays.sort(arr);
        int count=1;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == count) {
                count++;
            }
        }
        return count;

    }
}
