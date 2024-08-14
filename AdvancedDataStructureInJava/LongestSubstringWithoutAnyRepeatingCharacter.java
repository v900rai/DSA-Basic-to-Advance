package AdvancedDataStructureInJava;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutAnyRepeatingCharacter {
    public static void main(String []args){
        String str = "takeUforward";

          System.out.println("The length of the longest substring without repeating character is" +solve(str));



    }
    public static int solve(String str){
        if(str.length()==0){
            return 0;

        }
        int maxans=Integer.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            Set<Character> se=new HashSet<>();
            for(int j=i; j<str.length(); j++){
                if(se.contains(str.charAt(j))){
                    maxans = Math.max(maxans, j-i);
                    break;
                }
                se.add(str.charAt(j));
            }

        }
        return maxans;
    }
}
