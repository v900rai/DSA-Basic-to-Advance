package OOPSJAVA.INHERITANCE.hierarchicalinheritancl;

public class main {
    public static void main(String[] args) {
        son1 s1=new son1();
        s1.cycle1();
        s1.car();

        sone2 s2=new sone2();
        s2.son2();
        s2.car();
    }

}
class parent{
    void car(){
        System.out.println("BMW");
    }
}
class son1 extends parent{
    void cycle1(){
        System.out.println( " beta ji ka cycle h ye one ka ");
    }
}
class sone2 extends parent{
    void son2(){
        System.out.println(" beta ji ka cycle h ye two ka ");
    }
}
