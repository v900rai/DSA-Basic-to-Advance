package RecursionAllProgram;

public class recursionReverse {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int a=0;
        int b=arr.length-1;
        printReversNumber(a,b,arr);


    }
    public static void printReversNumber(int a,int b,int []arr){
     if(a<b) {
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
         printReversNumber(a + 1, b - 1, arr);
     }
     else {
         for(var v: arr){
             System.out.println(v);
         }
     }
    }
}
