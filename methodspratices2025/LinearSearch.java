package methodspratices2025;

public class LinearSearch {


    /**
     *
     * @param num take the number
     * @param target set the value when compare the value
     * @return return the index the value
     */
    public static int linearSearch(int num[], int target){
        for(int i=0; i<num.length; i++){
            if(num[i]==target){
                return i;
            }
        }
        return -1;
    }

    /**
     *  this the main methods also called the driver
     * @param args in build methods
     *             storing the another variable the in result then
     */
    public static void main(String args[]){
        int[] numbers = {10, 25, 30, 45, 60};
        int target = 30;

        int result = linearSearch(numbers, target);
        if(result!=-1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }


    }
}
