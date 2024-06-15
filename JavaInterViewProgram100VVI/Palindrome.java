package JavaInterViewProgram100VVI;

public class Palindrome {
    public static void main(String[] args) {
        /*Palindrome number in java: A palindrome number is
        a number that is same after reverse. For example 545, 151, 34543, 343,
         171, 48984 are the palindrome numbers.
        // It can also be a string like LOL, MADAM etc.
    */
        int num=151;

        int reminder;
        int temp;
        int sum=0;
         temp=num;
         while (num>0){
             reminder=num%10;
             num=num/10;
             sum=(sum*10)+reminder;
         }
         if(temp==sum) {
             System.out.println("palindrome number ");
         }
           else{
                 System.out.println("not palindrome");
             }

}}

