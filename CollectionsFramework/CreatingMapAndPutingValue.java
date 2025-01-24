package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class CreatingMapAndPutingValue {
    public static void main(String ars[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vishal ", 101);
        map.put("Sachin ", 102);
        map.put("vaibhav ", 103);

        //Iterating the value
        for (Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
    }

