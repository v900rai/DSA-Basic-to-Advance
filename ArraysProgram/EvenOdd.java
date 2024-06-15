package ArraysProgram;

public class EvenOdd {
    public static void main(String[] args) {
        int []arr=new int[]{10,3,4,5,3,62,22,44};
        int odd=0;
        int even=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("print the even number"+even);
        System.out.println("print the odd number"+odd);
    }
}
