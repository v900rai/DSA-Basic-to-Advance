package JavaBasicProgramLogicBuilding;

public class Factorial {
    public static void main(String[] args) {
        int nums=5;
        int fact=1;
        for(int i=1; i<=nums;i++){
            fact=fact*i;
        }
        System.out.println("factorial number "+fact);
    }
}
