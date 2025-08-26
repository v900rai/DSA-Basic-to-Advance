package JavaOops.Encapsulation;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String args[]){
        Student st1=new Student();
        st1.setName("vishal Rai");
        st1.setAge(55);
        System.out.println("Name  >"+st1.getName());
        System.out.println("age   >"+st1.getAge());

    }
}
class Student{

    private String name;
    private int age;

    //getter

    public String getName(){
        return name;
    }

    //setter
    public void setName(String name ){
        this.name=name;
    }

    //getter
    public int getAge(){
        return age;
    }
    //setter
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }
}
