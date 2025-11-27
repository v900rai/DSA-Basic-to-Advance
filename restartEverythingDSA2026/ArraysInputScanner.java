package restartEverythingDSA2026;

import java.util.Scanner;

public class ArraysInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int nums= sc.nextInt();

        int arr[] = new int[nums];
        for (int i=0; i<nums; i++){
            arr[i] =sc.nextInt();
        }
    }
}
