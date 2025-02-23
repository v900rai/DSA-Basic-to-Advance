package Constructors;

public class Parameterizedconstructorr {
    String name;
    int id;
    Parameterizedconstructorr(String name, int id){
        this.name=name;
        this.id=id;
    }
    public static void main(String args[]){
        Parameterizedconstructorr pr=new Parameterizedconstructorr("vishal rai ",99);
        System.out.println("Name ..> "+pr.name+" id ..> "+pr.id);
    }
}
