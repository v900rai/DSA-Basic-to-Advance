package BitManipulation;

public class AssignGradeBasedOnMarks {
    public static void main(String[] args) {
        int marks = 85;

// Using Ternary Operator
        String grade = (marks >= 90) ? "A+" :
                (marks >= 80) ? "A" :
                        (marks >= 70) ? "B" :
                                (marks >= 60) ? "C" : "F";

        System.out.println("Grade: " + grade); // Output: Grade: A

    }
}
