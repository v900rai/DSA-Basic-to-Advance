package SearchingInDsaJava;

public class linearSearch {
    public    static int search(int[] arr, int n, int index){
        for(int i=0; i<n; i++){
            if(arr[i]==index)
                return i;
        }
        return-1;
    }

    public static void main(String[] args) {
        int arr[]={ 10 ,20,30,40,50,60,70,80};
        int index=50;
      int result=  search(arr, arr.length, index);
      if(result==-1){
          System.out.println("it is not present in the given elemets int arrys");
      }
      else{
          System.out.println("its present giving the elements  "+result);
      }
    }
}
