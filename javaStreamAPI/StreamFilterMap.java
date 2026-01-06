package javaStreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMap {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,7,6);
        list.stream()
                .filter(x->x%2 == 0)
                .map(x->x*x)
                .forEach(System.out::println);
    }
}
