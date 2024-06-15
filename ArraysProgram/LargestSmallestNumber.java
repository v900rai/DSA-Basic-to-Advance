package ArraysProgram;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60,70,80,33,22};
        int laregestNumber=arr[0];
        int smallestNumber=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>laregestNumber){
                laregestNumber=arr[i];

            }
            else if(arr[i]<smallestNumber){
                smallestNumber=arr[i];
            }

        }
        System.out.println("print largest number"+laregestNumber);
        System.out.println("smallest number "+smallestNumber);
    }
}
