package restartEverythingDSA2026;


    import java.util.*;

    public class MapExample {
        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();

            map.put(1, "Vishal");
            map.put(2, "Rai");
            map.put(3, "Java Developer");

            // iterate
            for( Map.Entry<Integer,String> e : map.entrySet()){
                System.out.println(e.getKey()+" --> "+map.entrySet());
            }
        }
    }


