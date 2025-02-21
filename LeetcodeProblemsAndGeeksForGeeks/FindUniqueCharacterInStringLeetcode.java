package LeetcodeProblemsAndGeeksForGeeks;

public class FindUniqueCharacterInStringLeetcode {
    public static void main(String[] args) {
        System.out.println(findUniqueCharacter("leetcode"));
    }

    public static int  findUniqueCharacter(String str){
        int freq[]=new int[26];
        char chars[]=str.toCharArray();
        for(char ch:chars){
            freq[ch - 'a']++;

        }
        for(int i=0; i<chars.length; i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;

    }

}

