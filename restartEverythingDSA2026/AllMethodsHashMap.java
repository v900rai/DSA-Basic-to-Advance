package restartEverythingDSA2026;

import java.util.HashMap;

public class AllMethodsHashMap {


                  public static void main(String[] args) {

                HashMap<Integer, String> map = new HashMap<>();

                map.put(101, "Java");
                map.put(102, "Python");
                map.put(103, "C++");

                // get() → key se value nikalta hai
                System.out.println(map.get(101)); // Java

                // containsKey() → key present hai ya nahi
                if (map.containsKey(102)) {
                    System.out.println("Key exists");
                }

                // containsValue() → value check
                System.out.println(map.containsValue("C++")); // true

                // remove() → key-value delete
                map.remove(103);

                // size() → total entries
                System.out.println(map.size());

                // isEmpty() → map empty hai ya nahi
                System.out.println(map.isEmpty());
            }
        }



