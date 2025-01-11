package Interview2025DSA;

class Employee {
    void show(){
        this.wow();
        System.out.println("show");
    }
    void wow(){
        System.out.println("wow");
    }

}
public class ThisKeywordss{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.show();
    }
}
