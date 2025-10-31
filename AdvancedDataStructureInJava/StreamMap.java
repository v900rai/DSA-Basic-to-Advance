package AdvancedDataStructureInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);

        list.stream()
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
