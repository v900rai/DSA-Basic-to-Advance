package ArraysProgram;

import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        HashSet st= new HashSet();
        int arr1[]={1,2,3,4, 6};
        int arr2[]={ 2, 3,5};
        for(int i=0; i<arr1.length; i++){
            st.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            st.add(arr2[i]);
        }
        for(Object value : st){
            System.out.print(value);
        }
    }
}
