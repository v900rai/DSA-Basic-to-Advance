package restartEverythingDSA2026;

import java.util.HashMap;
import java.util.Map;

public class Q5_FirstRepeatingIndex {
    public static int firstReaptingINdex(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                return i;
            }
            else {

                map.put(s.charAt(i), 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstReaptingINdex("abcaav"));
    }
}
