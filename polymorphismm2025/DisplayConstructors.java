package polymorphismm2025;

public class DisplayConstructors {
    public static void main(String[] args) {
        Student s1= new Student(11 ,"Vishal Rai");
        Student s2= new Student(11 ,"Vishal Rai");
        Student s3= new Student(11 ,"Vishal Rai");

        System.out.println("Total Objects: " + Student.count);

    }
}

/**
 *
 */
class Student{
    int age;
    String name;
    static int count =0;
    public Student(int age, String name){
        this.age=age;
        this.name=name;
        count ++;
    }

    /**
     *
     */
    public void display(){
        System.out.println(age+" Age "+name + " Name");

    }
}
