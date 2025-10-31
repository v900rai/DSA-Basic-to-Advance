package AdvancedDataStructureInJava;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(10,5,30,40,50);
        list.stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);
    }

}
