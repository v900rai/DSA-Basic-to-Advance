package StringAllJavaProgram2025;

public class SecodMethodsstringEqulsAreNot {
    public static boolean stringEqualAreNot(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hell";

        if (stringEqualAreNot(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
