package AdvancedDataStructureInJava;

import java.util.Arrays;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 3, 1, 4, 7);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
