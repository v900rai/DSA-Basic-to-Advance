package RecursionAllProgram;

public class factorialss {
   public static int factorial=1;
    public static void main(String[] args) {
        int fact=5;
        int ans=printFactorial(fact);
        System.out.println(ans);

    }
    public static int printFactorial(int n){

//        if(n==0){
//            return 1;
//
//        }
//        factorial=factorial*n;
//        printFactorial(n-1);
//        return factorial;
        if(n==1){
            return 1;
        }
        return n* printFactorial(n-1);


    }
}
