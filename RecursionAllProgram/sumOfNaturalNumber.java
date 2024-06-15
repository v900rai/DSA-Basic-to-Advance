package RecursionAllProgram;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        sumOfNatural(1, 5,0);

    }
    public  static void sumOfNatural(int i, int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
         sum=sum+i;
       sumOfNatural(i+1,n,sum);
       // System.out.println(i);
    }
}
