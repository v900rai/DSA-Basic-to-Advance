package Interview2025DSA;
//Using Interface with Polymorphism

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal; // Interface reference
        myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog says: Bark

        myAnimal = new Cat();
        myAnimal.sound(); // Output: Cat says: Meow
    }
}
