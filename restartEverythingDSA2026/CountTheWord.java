package restartEverythingDSA2026;

public class CountTheWord {


    public static void main(String[] args) {
        String s = "banana";
        int count = 0;

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println(count);

    }
}
