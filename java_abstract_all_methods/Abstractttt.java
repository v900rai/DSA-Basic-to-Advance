package java_abstract_all_methods;

public class Abstractttt {
    public static void main(String[] args) {
        Subject x=new IT();

        x.syllabus();
        x.Learn();

    }
}
abstract class Subject{

    Subject(){
        System.out.println("Learning  the Subject !");
    }
    abstract void syllabus();
    void Learn(){
        System.out.println("Preparing right now !");
    }

}
class IT extends Subject {
    void syllabus(){
        System.out.println("C , Java , C++");
    }
}