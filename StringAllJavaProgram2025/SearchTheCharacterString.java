package StringAllJavaProgram2025;

public class SearchTheCharacterString {
    public static int searchSyring(String s, char ch){
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==ch){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = 'k';

        System.out.println(searchSyring(s, ch));
    }
}
