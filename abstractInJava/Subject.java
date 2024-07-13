package abstractInJava;

abstract class Subject {
    void subject(){
        System.out.println();
    }
    abstract void syllabus();

    void Learn(){
        System.out.println("Preparing Right Now!");
    }

}

class IT extends Subject {
    void syllabus(){
        System.out.println("C , Java , C++");
    }
}
class test{
    public static void main(String []args){
        IT it=new IT();
        it.syllabus();
        it.Learn();


    }
}