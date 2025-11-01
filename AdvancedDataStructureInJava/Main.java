package AdvancedDataStructureInJava;

class Student {

    // ✅ Properties (Variables)
    String name;
    int age;

    // ✅ Constructor (object banne par auto run hota hai)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called! Student created.");
    }

    // ✅ Method (Behavior)

    void study(){
        System.out.println(name +" is studying ..");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ Creating Objects (Student class se)
        Student s1 = new Student("Vishal", 27);
        Student s2 = new Student("Dheeraj", 25);

        // ✅ Methods call kar rahe hain
        s1.displayInfo();
        s1.study();

        s2.displayInfo();
        s2.study();
    }
}
