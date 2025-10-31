package AdvancedDataStructureInJava;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {

        // From List
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().forEach(System.out::print);

        // From Array
        int[] arr = {5, 6, 7};
        Arrays.stream(arr).forEach(System.out::print);

        // Using Stream.of
        Stream.of("A", "B", "C").forEach(System.out::println);
    }
}

