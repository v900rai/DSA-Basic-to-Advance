package javaStreamAPI;

import java.util.Arrays;
import java.util.List;

public class first {
    public static void main(String ars[]){
        List<Integer> list= Arrays.asList(12,13,14,15,8);
        list.stream().
        filter(x ->x%2==0)
                .forEach(System.out::println);


    }
}
