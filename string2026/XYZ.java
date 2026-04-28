package string2026;


class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }


}
class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow meoo");
    }
}

public class XYZ {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        Animal a4 =new Cow();

        a1.sound(); // Animal
        a2.sound(); // Dog
        a3.sound(); // Cat
        a4.sound(); //Cow
    }
}