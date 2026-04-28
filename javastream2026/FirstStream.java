package javastream2026;

import java.util.Arrays;
import java.util.List;

public class FirstStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        //without using stream
        for (int num : list){
            System.out.println(num);
        }
        // withs stream

        list.stream()
                .forEach(System.out::println);
    }
}
