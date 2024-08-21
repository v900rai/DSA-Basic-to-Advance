package OOPSJAVA.ENCAPSULATION;

public class Employee {
    private int empid;
    public  void setEmpId(int emid){
        this.empid=emid;

    }
    public  int getEmpid(){
        return empid;
    }
    public static void main(String args[]){
        Employee emp=new Employee();
        emp.setEmpId(1001);
        System.out.println(emp.getEmpid());
    }
}
