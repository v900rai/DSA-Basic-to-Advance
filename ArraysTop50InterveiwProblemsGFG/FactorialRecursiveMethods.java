package ArraysTop50InterveiwProblemsGFG;

public class FactorialRecursiveMethods {
     public static int fact(int nums){
         if(nums==0){
             return 1;
         }
         return nums * fact(nums-1);
     }
   public static int factorial(int n)
    {

        // single line to find factorial
        return (n == 1 || n == 0) ? 1
                : n * factorial(n - 1);
    }

    public static void main(String args[]){
         int n=5;
         System.out.println(fact(n));
        System.out.println(factorial(n));
     }
}
