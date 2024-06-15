package JavaInterViewProgram100VVI;

public class primeNuberNormal {
    public static void main(String args[]){
        int num=5;
        boolean flag = false;
        for(int i=1; i<num; i++){
            if(num/i==0){
                System.out.println("it is prime Number");
            }
            else{
                System.out.println("it is not prime number");
            }
        }
    }
}
