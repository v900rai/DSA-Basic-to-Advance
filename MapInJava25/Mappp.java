package MapInJava25;

import java.util.HashMap;
import java.util.Map;

public class Mappp {
    public static void main(String args[]){
        Map<String,Integer> map=new HashMap<>();
        // Adding key-value pairs to the map
        map.put("Ajay", 1);
        map.put("Vishal", 2);
        map.put("Kunj", 3);

        System.out.println("Map elements: " + map);
    }
}
