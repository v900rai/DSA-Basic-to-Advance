package JavaInterViewProgram100VVI;

public class IterateOverCharacters {
    public static void main(String[] args) {
        String str="vishal rai";
        getChar(str);

    }
    static void getChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
            System.out.print("  ");
        }
  
    }
}
