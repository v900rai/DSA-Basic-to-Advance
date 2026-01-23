package restartEverythingDSA2026;

public class JavaPalindromeString {

    public static void main(String[] args) {

                String s = "madam";
                int i = 0, j = s.length() - 1;

                boolean isPalin = true;

                while(i < j){
                    if(s.charAt(i) != s.charAt(j)){
                        isPalin = false;
                        break;
                    }
                    i++;
                    j--;
                }

                System.out.println(isPalin);
            }
        
}
