package ArraysProgram;

public class copyArrays {
    public static void main(String[] args) {
        int arr1[]=new int[]{10,20,30,40};
        int arr2[]=new int[4];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];

        }
        System.out.println("orijinal arrays print");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);

        }
        System.out.println("copy arrays");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);

        }
    }
}
