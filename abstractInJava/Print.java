package abstractInJava;

import GraphDSA.AdjacencyGraph;

abstract class SunStr {
    abstract void print();

}
class Emplyoee extends SunStr{
    void print(){
        String str="Vipule kumar mauraya";
        int age=33;
        float salary=333.33f;
        System.out.println(salary);
        System.out.println(age);
        System.out.println(str);
    }

}
class main{
    public static void main(String args[]){
        Emplyoee emp=new Emplyoee();
        emp.print();
    }
}