package Hashmap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap<String , Integer> map=new HashMap<>();

        //insertion operation
        map.put("India", 120);
        map.put("America", 130);
        map.put("US", 40);
        map.put("china", 70);
        map.put("Nepal",123);
        // hash map unordered hote h
        System.out.println(map);
        map.put("china", 80);
        System.out.println(map);
        // search
        if(map.containsKey("china")){
            System.out.println("Key the present in the map");
        }
        else {
            System.out.println("Key the   not present in the map");
        }
        System.out.println(map.get("china")); // exist the value
        System.out.println(map.get("Indonesia")); // exist the value

    }

}
