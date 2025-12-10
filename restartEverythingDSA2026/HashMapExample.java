package restartEverythingDSA2026;


import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Vishal", 1);
        map.put("Dheeraj", 2);
        map.put("Rahul", 3);

        // Fetch value
        System.out.println(map.get("Vishal"));  // Output: 1

        // Remove
        map.remove("Rahul");

        // Iterating through HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
