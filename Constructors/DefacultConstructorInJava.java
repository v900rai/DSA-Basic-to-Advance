package Constructors;

public class DefacultConstructorInJava {





        public static void main(String[] args) {
            Student s = new Student();
            System.out.println(s.id + " " + s.name); // Output: 0 Default Name
        }
    }
    class Student {
        int id;
        String name;

        // Default constructor
        Student() {
            id = 0;
            name = "Default Name";
        }
    }





