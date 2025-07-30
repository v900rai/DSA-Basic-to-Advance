package methodspratices2025;

public class Student {
    /**
     * non-static methods calling (using objects);
     * @param args
     */
    public static void main(String[] args) {
        Student st=new Student();
        st.showName("vishal rai");


    }
    public void showName(String name){
        System.out.println("Students name is :"+name);
    }
}
