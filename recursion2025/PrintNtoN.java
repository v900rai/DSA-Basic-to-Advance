package recursion2025;

public class PrintNtoN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(n);

    }
    public static void print1toN(int n){
        //base case
        if(n==0){
            return ;
        }
           // Recursive call for previous numbers
               print1toN(n - 1);


              // Print current number
              System.out.print(n + " ");
            }

}
