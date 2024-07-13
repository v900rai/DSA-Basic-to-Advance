package Methods;

public class FirstProgram {
    public static void main(String args[]){
        FirstProgram dp=new FirstProgram();
        dp.displayElement();
        FirstProgram.add();
        int a=3;
        int b=3;
        int result= maltiplication(a,b);
        System.out.println(result);

    }
    public void displayElement(){
        System.out.println("Hello vishal this first method program in java ");
    }
    public static void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Sum "+c);
    }
    public static int maltiplication(int a, int b){
        return a*b;
    }
}
