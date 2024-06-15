package JavaOops;
class pen {
    String type;
    String color;

    public void write() {
        System.out.println("Writing something new statements");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}
    class Student{
        int age ;
        String name;
        public void printifo(){
            System.out.println(this.age=age);
            System.out.println(this.name=name);
        }
    }


public class oops {
    public static void main(String[] args) {
/*        pen p=new pen();
        p.color="black";
        p.type="gel";
       // p.write();
        pen p1=new pen();
        p1.color="yellow";
        p1.type="ballpoint";
        p.printColor();
        p1.printColor();
         */
        Student s1=new Student();
        s1.age=26;
        s1.name="vishal";
        s1.printifo();
    }
}
