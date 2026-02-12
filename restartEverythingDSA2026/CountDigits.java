package restartEverythingDSA2026;

public class CountDigits {
    public static void main(String args[]){
        String str = "abcd12345";

        int digit  = 0;
        for (char ch :str.toCharArray()){
            if(ch>= 0 && ch<=9){
                digit++;
            }
        }
        System.out.println(digit );
    }
}
