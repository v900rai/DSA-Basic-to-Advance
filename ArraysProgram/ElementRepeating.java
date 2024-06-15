package ArraysProgram;

public class ElementRepeating {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,4,5,5,4};
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==4){
                count++;
            }

        }
        System.out.println("4 repeating "+count);
    }
}
