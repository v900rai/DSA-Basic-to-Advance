package AdvancedDataStructureInJava;

import java.util.Arrays;
import java.util.List;

public class HowToUseFilter {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(20,10,3,4,6,7);

        List<Integer> filteredlist = list.stream().filter(i->i%2==0).toList();
        System.out.println(filteredlist);
    }
}
