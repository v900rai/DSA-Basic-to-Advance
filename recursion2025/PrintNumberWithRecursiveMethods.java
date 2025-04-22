package recursion2025;

public class PrintNumberWithRecursiveMethods
{
    public static void printNumber(int n){
        if(n>0){
            printNumber(n-1);
            System.out.print(n+" ");


        }
    }
    public static void main(String args[]){
        int nums=10;
        printNumber(nums);

    }
}
