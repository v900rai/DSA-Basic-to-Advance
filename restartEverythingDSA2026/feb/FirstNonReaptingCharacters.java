package restartEverythingDSA2026.feb;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReaptingCharacters {

        public static void main(String[] args) {

            String s = "aabbcde";

            Map<Character, Integer> map = new HashMap<>();

            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for(char c : s.toCharArray()){
                if(map.get(c) == 2){
                    System.out.println(c);
                    break;
                }
            }
        }
    }


