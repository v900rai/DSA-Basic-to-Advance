package JavaInterViewProgram100VVI;

public class SubSet {
    public static void main(String args[]) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

        public static boolean isSubset(int a[], int b[]){

          int m=a.length;
          int n = b.length;

          for(int i=0; i<n; i++){
              boolean found=false;
              for(int j=0; j<m; j++){
                  if(b[i]==a[j]){
                      found=true;
                      break;
                  }
              }
              if(!found){
                  return false;
              }
          }
          return true;
        }
}
