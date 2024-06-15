package ArraysProgram;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hSet = new HashSet<>();

        // Adding elements to the HashSet
        hSet.add("Cricket");
        hSet.add("Hockey");
        hSet.add("Basketball");

        System.out.println("HashSet Elements: ");
        // Iterating HashSet
        for(String s: hSet){
            System.out.println(s);
        }
    }
}
