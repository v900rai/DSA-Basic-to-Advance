package polymorphismm2025;

public class DisplayConstructors {
    public static void main(String[] args) {
        Student st= new Student(11 ,"Vishal Rai");
        st.display();

    }
}
class Student{
    int age;
    String name;
    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(age+" Age "+name + " Name");
    }
}
