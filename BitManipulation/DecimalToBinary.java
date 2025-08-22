package BitManipulation;

public class DecimalToBinary {
    public static void main(String args[]){
        System.out.println(decimalToBinary(4));

    }
    private static String decimalToBinary(int n){
        String res = "";
        while(n>0){
            int rem = n % 2;
            n = n/2;
            res+=rem;

        }
        return res;
    }
}
