package restartEverythingDSA2026;


import java.util.*;

public class Q3_WordFreq {
    public static Map<String, Integer> wordCount(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");

        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("Java is easy and Java is fast"));
    }
}
