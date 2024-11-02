package November2024;

public class PalindromeInJava {
    public static void main(String args[]){
        int number=212;
        int temp=number;
        int rev=0;
        while(temp!=0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        if(number==rev){
            System.out.println(" number is palindrome "+number);
        }
        else{
            System.out.println("its is not palindrome number "+number);
        }
    }
}
