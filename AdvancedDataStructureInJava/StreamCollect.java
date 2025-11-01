package AdvancedDataStructureInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String args[]) {

        // ✅ Creating a List of Integer values
        List<Integer> list = Arrays.asList(10, 20, 25, 30, 35);

        // ✅ Stream starts from the list
        // ✅ filter(x -> x % 2 == 0) → selects only even numbers
        // ✅ collect(Collectors.toList()) → converts the stream back into a List
        List<Integer> evenList = list.stream()
                .filter(x -> x % 2 == 0)    // Keep only even numbers
                .collect(Collectors.toList()); // Convert stream → List

        // ✅ Print the final List of even numbers
        System.out.println(evenList);
    }
}

