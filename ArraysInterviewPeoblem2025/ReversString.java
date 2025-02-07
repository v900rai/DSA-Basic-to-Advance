package ArraysInterviewPeoblem2025;

public class ReversString {
    public static  void main(String args[]){
        String str="vishal";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        //
        System.out.println(".......................");
        for(int i=str.length()-1; i>=0; i--){
            System.out.println("  ");
            System.out.print(str.charAt(i));
        }
        //approach 3
        StringBuilder st=new StringBuilder(str);
        System.out.println(st.reverse());

    }
}
