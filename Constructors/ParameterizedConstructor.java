package Constructors;

public class ParameterizedConstructor {
    String name;
    int id;

    ParameterizedConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class  main{
    public static void main(String[] args) {
        ParameterizedConstructor para=new ParameterizedConstructor("vishal rai", 88);
        System.out.println("name "+para.name+ "  id "+ para.id);

    }
}
