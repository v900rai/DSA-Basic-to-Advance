package MapAdvancdQ;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String args[]){
        int arr[] ={10,10,10,20,20,30};

        Map<Integer, Integer> freqMap= new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);

        }
        //print result
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey()+" ...> "+entry.getValue());
        }
    }
}
