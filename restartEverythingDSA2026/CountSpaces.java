package restartEverythingDSA2026;

public class CountSpaces {
    public static void main(String[] args) {


        String s = "Hello Vishal";
        int spaces = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println(spaces);

    }
}
