package Program.In.Java200;

public class SortTheValue {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,4,3,0,1,7};
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        System.out.println("print the valve");
        for(int j=0; j<7; j++){
            System.out.println(arr[j]);
        }
    }
}
