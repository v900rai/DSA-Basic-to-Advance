package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class Countfrequencyofcharacter {

    public static Map<Character, Integer> frequencyCharacter(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // length() calculate
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){

            }

        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(frequencyCharacter("aabbccdde"));
    }

}
