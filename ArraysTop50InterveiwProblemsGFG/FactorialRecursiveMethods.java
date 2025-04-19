package ArraysTop50InterveiwProblemsGFG;

public class FactorialRecursiveMethods {
     public static int fact(int nums){
         if(nums==0){
             return 1;
         }
         return nums * fact(nums-1);
     }
     public static void main(String args[]){
         int n=5;
         System.out.println(fact(n));
     }
}
