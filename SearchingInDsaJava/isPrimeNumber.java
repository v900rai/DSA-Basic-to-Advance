package SearchingInDsaJava;

public class isPrimeNumber {
    public static boolean isPrimeNumber(int num){
        for(int i=2; i<num; i++){
            if(num/i==0){
                return false;
            }

        }
        return  true;
    }

    public static void main(String[] args) {
        int n=20;
        boolean ans=isPrimeNumber(n);
        if(n !=1 && ans==true){
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }

    }
}
/*
Complexity Analysis
Time Complexity: O(n)

Space Complexity: O(1)*/
