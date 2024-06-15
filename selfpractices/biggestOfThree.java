package selfpractices;

public class biggestOfThree {
    static int biggestOfThree(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int largestNumber=biggestOfThree(a,b,c);
        System.out.println("largestNumber "+largestNumber);
    }
}
