package constructor;

public class Parametrized {
    String name;
    int id;
    public Parametrized(String name, int id){
        this.id= id;
        this.name = name;
    }
    public void disPlay(){
        System.out.println("Parametrized " +name+" id "+id);
    }
    public static void main(String arg[]){
        Parametrized st = new Parametrized(" vishal rai ", 101);
        st.disPlay();
    }
}
