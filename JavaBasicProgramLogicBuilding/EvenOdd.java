package JavaBasicProgramLogicBuilding;


// Time Complexity: O(1) - Constant time
// Space Complexity: O(1) - No extra space used
public class EvenOdd {
    public static void main(String[] args) {
        int num = 8;
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
