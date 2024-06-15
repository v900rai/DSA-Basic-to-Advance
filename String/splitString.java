package String;

public class splitString {
    public static void main(String[] args) {
        String s="abc acb bbb ghf ";
        String [] parts=s.split(" ");
        for (int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
