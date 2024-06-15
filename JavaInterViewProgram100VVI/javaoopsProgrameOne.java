package JavaInterViewProgram100VVI;
class Student {
    String name;
    String surname;
    int roolNumber;
    public  Student(String name, String surname, int roolNumber){
        this.name=name;
        this.surname=surname;
        this.roolNumber=roolNumber;

    }
    public void getDetails(){
        System.out.println("The name of the student is "+ this.name +" "+ this.surname);
        System.out.println("The roll no of the student is "+ this.roolNumber);
    }
}



public class javaoopsProgrameOne {
    public static void main(String[] args) {
        Student student=new Student("vishal ", "rai",26);
           student.getDetails();
    }
}
