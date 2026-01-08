package javaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenList  = list.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}
