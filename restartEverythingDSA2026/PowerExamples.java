package restartEverythingDSA2026;

import Interview2025DSA.SOortColour;

public class PowerExamples {
    public static void main(String args[]){
        int base = 2;
        int power = 3;
        int result = 1;
        for(int i=1; i<=power; i++){
            result = result * base;
        }
        System.out.println(result);
    }
}
