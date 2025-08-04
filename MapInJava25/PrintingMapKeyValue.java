package MapInJava25;

import java.util.HashMap;
import java.util.Map;

public class PrintingMapKeyValue {
    public static void main(String args[]){

        String str = "apple banana apple orange banana apple";

        Map<String, Integer> freq = new HashMap<>();

        for (String word : str.split(" ")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println(freq);


        System.out.println("****************************************************");
        Map<String , Integer> map = new HashMap<>();
        map.put("Vishal", 101);
        map.put("Vipul", 109);
        map.put("Ajay", 108);
        //print the map

        System.out.println(map);


        // print the marks and value

        System.out.println(" Marks of vishal "+map.get("Vishal")); //101

        //booelan value

        System.out.println(map.containsKey("Ajay")); //true

        //remove the value
        //map.remove("Vipul");

        //iterate the entrySet

        for(Map.Entry<String, Integer> enty: map.entrySet()){
            System.out.println(enty.getKey()+" ==> "+enty.getValue());
        }

    }
}
