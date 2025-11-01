package AdvancedDataStructureInJava;



import java.util.*;


    public class StreamMatch {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(3, 6, 9, 12);

            System.out.println(list.stream().anyMatch(x -> x > 10));  // true
            System.out.println(list.stream().allMatch(x -> x % 3 == 0)); // true
            System.out.println(list.stream().noneMatch(x -> x < 0)); // true
        }
    }


