package JavaInterViewProgram100VVI;

import java.util.Locale;

public class isPalindrommm {
    public static void main(String[] args) {
        String str="geeks";
        str=str.toLowerCase();
        boolean A=isPalindrom(str);
        System.out.println(A);

    }
    public static boolean isPalindrom(String str){
        String rev="";
        boolean ans=false;
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);

        }
        // // Checking if both the strings are equal
        if(str.equals(rev)){
            ans=true;
        }
        return ans;
    }
}
