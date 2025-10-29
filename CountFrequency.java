import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String []arg) {
        String s = "banana";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map); // {a=3, b=1, n=2}
    }        

    }
