package SearchingInDsaJava;

public class getMaxSearchElement {
    public static int getMatrixSearch(int number[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60,70};
       int result= getMatrixSearch(number);
       System.out.println(result);
      // for()

    }

}