package NumberProgram;

public class StringToCharacterInJava {
    public static void main(String[] args) {
        String Str="vishal";
        for(int i=0; i<Str.length(); i++){
            char ch=Str.charAt(i);
            System.out.println("character "+i+" postions "+ch);
        }
    }
}
