package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class Q8_Majority {
    public static int majority(int []nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n :nums){
            map.put(n ,map.getOrDefault(n,0)+1);

        }
        for(int n: nums){
            if(map.get(n)>nums.length/2)
                return n;
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(majority(new int[]{2,2,1,1,1,2,2}));
    }
}
