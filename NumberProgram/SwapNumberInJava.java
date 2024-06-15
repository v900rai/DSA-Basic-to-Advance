package NumberProgram;

public class SwapNumberInJava {
   /* Input  : m=9, n=5
    Output : m=5, n=9

    Input  : m=15, n=5
    Output : m=5, n=15
    Here 'm' and 'n' are integer value*/
    public static void  swapValuesUsingThirdVariable(int m, int n){
        int temp;
        temp=m;
        m=n;
        n=temp;
        System.out.println("Value of m is " + m
                + " and Value of n is " + n);

    }
    public static void main(String []args){
        int a=10;
        int b=20;
        swapValuesUsingThirdVariable(a ,b);
    }
}
