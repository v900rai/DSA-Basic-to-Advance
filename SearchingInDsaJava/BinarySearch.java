package SearchingInDsaJava;

public class BinarySearch {
   public static int BinarySearch(int []number, int key) {
       //Step1
       int start = 0;
       int end = number.length - 1;
       // step2 ek loop lena
       while (start <= end) {
           // step mid nikalana h ab
           int mid = (end + start) / 2;

           // comparision krna h ab
           if (number[mid] == key) {
               return mid;
           }
           // comparision onece again
           if(number[mid]<key){
               start=mid+1;// right

           }else{
               // left
               end=mid-1;
           }
       }
       return -1;
   }








    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60,70,80};
        int key=90;
        System.out.println("Index for key is "+BinarySearch(number,key));
    }
}
