package OOPSJAVA.INHERITANCE.singleLevelHinheritancs.student;
class Animal{
    void eat(){System.out.println("eating...");}
}
class cat extends Animal{
    void moo(){
        System.out.println(" cat some voice ....");
    }
}
class Dog extends Animal {
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        cat c=new cat();
        c.moo();
        c.eat();
        d.bark();
        d.eat();
    }}