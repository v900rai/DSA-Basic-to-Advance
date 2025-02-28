package JavaBasicProgramLogicBuilding;

public class LargestNumber {
    public static void main(String []args){
        int a=10;
        int b=20;
        int c=30;
        int largestNumber=Math.max(a, Math.max(b, c));
        System.out.println("largest Number "+largestNumber);
    }
}
