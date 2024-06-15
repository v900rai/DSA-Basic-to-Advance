package RecursionAllProgram;

public class palindromeRecursion {
    public static void main(String[] args) {
        String str="abcxa";
        boolean isPalindrome = true;
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}
