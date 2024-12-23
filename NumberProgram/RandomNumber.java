package NumberProgram;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random num= new Random();
        System.out.println("Enter the number Random ");
        for(int i=1; i<=5; i++){
            System.out.println(num.nextInt(200));
        }
    }
}
