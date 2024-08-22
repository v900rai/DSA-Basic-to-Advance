package OOPSJAVA.ENCAPSULATION;

public class Uniqueprogrammer {
    public static void main(String[] args) {
        String message= "i am programmer";
        for(int i=0; i<message.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(message.charAt(j));
            }
            System.out.println();
        }
        //System.out.println();
    }
}
