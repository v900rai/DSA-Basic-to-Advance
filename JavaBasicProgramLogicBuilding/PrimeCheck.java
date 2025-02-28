package JavaBasicProgramLogicBuilding;

public class PrimeCheck {
    public static void main(String[] args) {
        int nums=7;
        int flag=1;
        for(int i=2; i<=Math.sqrt(nums); i++) {
            if (nums % 1 == 0) {
                flag = 0;
                break;
            }
        }
            System.out.println(flag == 1 ? "Prime" : "Not Prime");

    }
}
