package Hashmap;

import java.util.HashMap;

public class HashMapIteration {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        int arr[]={10,20,30,40,50};
        for(int val : arr){
            System.out.print(val+",   ");
        }
    }
}