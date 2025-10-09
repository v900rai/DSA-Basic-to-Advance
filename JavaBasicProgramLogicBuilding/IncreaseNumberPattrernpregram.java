package JavaBasicProgramLogicBuilding;

public class IncreaseNumberPattrernpregram {


    public static void main(String[] args) {
        int n = 4;  // number of rows
        int num = 1; // starting number

        // outer loop for rows
        for (int i = 1; i <= n; i++) {

            // inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // print current number
                num++; // increment the number
            }

            System.out.println(); // move to next line
        }
    }
}
