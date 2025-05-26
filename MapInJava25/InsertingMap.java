package MapInJava25;

import java.util.HashMap;
import java.util.Map;

public class InsertingMap {
    // Java Program to illustrate the Hashmap Class

// Importing required classes


    // Main class

        // Main driver method
        public static void main(String[] args)
        {

            // Creating an empty HashMap
            Map<String, Integer> map= new HashMap<>();

            // Inserting entries in the Map
            // using put() method
            map.put("Sweta", 10);
            map.put("Amiya", 30);
            map.put("Gudly", 20);
            map.put("shiya ",88);

            // Iterating over Map
            //for(Map.Entry<String,Integer> e:m.entrySet())
            for (Map.Entry<String, Integer> e : map.entrySet()){

                System.out.println(e.getKey() + " "
                        + e.getValue());
        }
    }
}
