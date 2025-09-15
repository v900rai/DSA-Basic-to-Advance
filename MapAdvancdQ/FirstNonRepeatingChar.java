package MapAdvancdQ;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str= "swiss";
        Map<Character, Integer> charCount= new LinkedHashMap<>();// maintains order
        for( char ch: str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        //print the map

        for(Map.Entry<Character, Integer> entry:charCount.entrySet()){
            if(entry.getValue()==1){
                System.out.println("first Non-Repeating Character :"+entry.getKey());
                break;
            }
        }
    }
}
