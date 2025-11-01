package AdvancedDataStructureInJava;


import java.util.*;
        import java.util.stream.*;

public class StreamMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 40);
        map.put("B", 80);
        map.put("C", 60);

        map.entrySet()
                .stream()
                .filter(e -> e.getValue() > 50)
                .forEach(System.out::println);
    }
}
