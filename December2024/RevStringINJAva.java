package December2024;

public class RevStringINJAva {
    public static void main(String[] args) {


        String name = "vishalRai";
        String rev = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);
    }

}
