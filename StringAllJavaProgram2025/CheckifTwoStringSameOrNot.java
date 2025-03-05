package StringAllJavaProgram2025;

public class CheckifTwoStringSameOrNot {

    public static boolean areStringSame(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String args[]){
        String s1="vishal";
        String s2="ajay";
        if (areStringSame(s1,s2)){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

    }
}
