package constructor;

public class Student {
    String name;
    public Student(String name){
        this.name = name;
    }
    void disPlay(){
        System.out.println("Name "+name);
    }
    public static void main(String arg[]){
        Student st = new Student("Vishal rai");
        st.disPlay();
    }
}
