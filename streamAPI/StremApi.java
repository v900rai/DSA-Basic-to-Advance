package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremApi {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);

       List<Integer> newArr = arr.stream().map((val) -> val + 2 ).toList();

       for(int val: newArr){
           System.out.println(val + " ");
       }
    }
}
