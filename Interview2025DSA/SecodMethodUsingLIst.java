package Interview2025DSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecodMethodUsingLIst {
    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            list.add(arr[i]);
        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
