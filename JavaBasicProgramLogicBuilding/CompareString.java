package JavaBasicProgramLogicBuilding;

public class CompareString {
    public static void main(String args[]){
        String s1 = "vishal";
        String s2 = "vishal";
        if (isCampare(s1,s2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
    // Second methods
    public static boolean areStringsEqual(String s1, String s2) {
        // Compare lengths first
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    // first methods
    public static boolean isCampare(String s1, String s2){
        return s1.equals(s2);

    }
}
