package Matrix;

public class matrix2D {
    public static void main(String[] args) {
        int [][] arr={ {1,2,3,4},{ 2,3,4,5}, {1,3,4,5}, {9,7,5,4}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
