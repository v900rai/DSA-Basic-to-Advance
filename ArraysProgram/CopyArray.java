package ArraysProgram;

public class CopyArray {
    public static void main(String[] args) {
        int []arr= {10,20,30,40,40,50,50};
        int []arr2=new int [arr.length];
        //Copying all elements of one array into another
        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        System.out.println("Elements of original array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
