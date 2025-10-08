package JavaBasicProgramLogicBuilding;


import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> countryCode = new HashMap<>();

        // Add key-value pairs
        countryCode.put("India", 91);
        countryCode.put("USA", 1);
        countryCode.put("UK", 44);
        countryCode.put("Australia", 61);

        // Print all elements
        System.out.println("Country Codes: " + countryCode);

        // Access value using key
        System.out.println("Code of India: " + countryCode.get("India"));

        // Check if a key exists
        System.out.println("Contains 'USA'? " + countryCode.containsKey("USA"));

        // Remove an entry
        countryCode.remove("UK");

        // Iterate over HashMap
        for (Map.Entry<String, Integer> entry : countryCode.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Size of HashMap
        System.out.println("Total countries: " + countryCode.size());
    }
}


