package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairs {
    public static void main(String[] args) {
    int arr[] = {1,1,1,2,2,2,2,2,3,3,4,4,4,4,9,9};
        Map<Integer,Integer> map = new HashMap<>();
    for (int nums : arr){
        map.put(nums, map.getOrDefault(nums,0)+1);
    }
        System.out.println(map);
    }

}
