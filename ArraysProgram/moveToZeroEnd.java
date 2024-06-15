package ArraysProgram;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class moveToZeroEnd {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 5, 6};
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zeros++;
            }

        }

        ArrayList<Integer> st=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                st.add(arr[i]);
            }
        }

        for(int i=0; i<zeros; i++){
            st.add(0);
        }
        for(int i : st){
            System.out.println(i);

        }
    }
}





