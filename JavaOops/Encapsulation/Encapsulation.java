package JavaOops.Encapsulation;
class Programmer {
    private String name;
    private int id;


    // Getter and Setter for name
    public String getName()
    {
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(int id){
        this.id=id;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Programmer p=new Programmer();
        p.setName("vishal rai");
        p.setId(121);
        System.out.println("Name >>>"+p.getName());
        System.out.println("id  >>>"+p.getId());
    }


}
