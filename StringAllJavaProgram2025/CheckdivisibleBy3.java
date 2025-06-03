package StringAllJavaProgram2025;

public class CheckdivisibleBy3 {
    // main function
    public static void main (String[] args)
    {
        String str = "1332";
        if(check(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean check(String str){
        int n=str.length();
        int digitSum=0;
        for(int i=0; i<n; i++){
            digitSum+=(str.charAt(i)-'0');

            // Check if sum of digits is
            // divisible by 3.


        }
        return (digitSum % 3 == 0);

    }
}
