package restartEverythingDSA2026;
 class Animal{
     void show(){
         System.out.println("Animal makes a sound ");
     }

 }
 class Dog extends Animal{
     @Override
     void show(){
         System.out.println("Dog bark");
     }
 }
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.show();
    }

}
