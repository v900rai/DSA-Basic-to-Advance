package recursion2025;

public class ReversStringUsingRecursion {
    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "vishal rai ";
        System.out.println(reverse(str));
    }
}
