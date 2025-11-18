package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyForEachElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};

        Map<Integer, Integer> map = new HashMap<>();


          for(int y:arr){
              map.put(y, map.getOrDefault(y,0)+1);
          }
        System.out.println(map);

    }
}
