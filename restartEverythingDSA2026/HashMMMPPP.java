package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class HashMMMPPP {

    public static void main(String args[]){
        //creating hash map

        HashMap<String, Integer> hashMap = new HashMap<>();
        // Add elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        hashMap.put("vishal",88);
        hashMap.put("vis",88);

        //iterating map

        for(Map.Entry<String , Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" -->"+entry.getValue());
        }

    }
}
