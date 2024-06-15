package NumberProgram;

public class biggestOfThreeNumber {
    public static int biggestOfNumber(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c) {
            return b;

        }
        else {
            return c;
        }
    }
    public static void main(String [] args){
        int x=10;
        int y=70;
        int z=40;
        int largestNumber =biggestOfNumber(x, y, z);
        System.out.println(largestNumber);
    }
}
