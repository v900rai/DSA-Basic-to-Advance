package polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();


    }
}
    class Shape{
        void draw(){
            System.out.println("can't say shape type");
        }
    }
    class Square extends Shape{
    @Override
        void draw(){
        super.draw();
        System.out.println("squre shape");
        }
    }


