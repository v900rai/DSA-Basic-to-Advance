package AdvancedDataStructureInJava;
public class CountTheObject {

    static class Student {

        // ✅ Static variable (shared by all objects)
        private static int count = 0;

        // ✅ Constructor (static nahi hota)
        public Student() {
            count++;  // Har object banne par increment
        }

        // ✅ To get the current count
        public static int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Print total number of objects
        System.out.println("Total Objects Created: " + Student.getCount());
    }
}
