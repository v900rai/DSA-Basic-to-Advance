package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequecyElementsFirst {

    public static void main(String args[]){
        String str = "aabbcde";

        Map<Character ,Integer> map = new HashMap<>();


        //steps first count the frequency

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);

        }
        // Step 2: Find first non-repeating character
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch) ==1){
                System.out.println("First non repeating Character "+ch);
                break;
            }
        }
    }
}
