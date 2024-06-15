package selfpractices;

import ArraysProgram.LeadersInArrays;

import java.util.ArrayList;

public class printLeaders {
     public static ArrayList<Integer>  printLeaders(int arr[], int n){
         ArrayList<Integer> ans=new ArrayList<>();
         for(int i=0; i<n; i++){
            boolean Leader=true;
            for(int j=i+1; j<n; j++){
                Leader=false;
                break;
            }

             // Push all the leaders in ans array.
             if (Leader)
                 ans.add(arr[i]);
         }
         return ans;
     }
     public static void main(String []args) {

         // Array Initialization.
         int n = 6;
         int arr[] = {10, 22, 12, 3, 0, 6};


         ArrayList<Integer> ans = printLeaders(arr, n);

         for (int i = 0; i < ans.size(); i++) {
             System.out.print(ans.get(i) + " ");
         }

     }
}
