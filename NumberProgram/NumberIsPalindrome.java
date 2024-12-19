package NumberProgram;

public class NumberIsPalindrome {
    public static void main(String args[]){
        int num=545;
        int reversNum=0;
        int temp=num;
        while(num>0){
            int digit =num%10;
            reversNum=(reversNum*10)+digit;
            num=num/10;

        }
        if(temp==num){
            System.out.println("NUmber is Number is Palindrome"+num);
        }
        else {
            System.out.println("Number is not a Palindrome"+num);
        }
    }
}
