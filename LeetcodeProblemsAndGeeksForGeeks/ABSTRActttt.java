package LeetcodeProblemsAndGeeksForGeeks;
abstract class Animal {
    abstract void makeSound();  // Abstract method (कोई body नहीं)
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("mauuu! Bark!");
    }
}
public class ABSTRActttt {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark! Bark!
        myDog.makeSound();
    }

}
