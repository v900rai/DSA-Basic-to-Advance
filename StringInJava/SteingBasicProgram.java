package StringInJava;

public class SteingBasicProgram {
    public static void main(String[] args) {
        String str="this is a pen ";
        int count=0;
        for(int i=0; i<str.length(); i++){
           // System.out.print(str.charAt(i)+" ");
            count++;
        }
        System.out.println(count);
    }
}
