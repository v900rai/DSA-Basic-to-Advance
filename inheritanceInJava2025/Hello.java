package inheritanceInJava2025;

public class Hello {
    public static void main(String args[]){
        System.out.println("inheritance write here ");
    }
}

/*Inheritance in Java

comments
Java Inheritance is a fundamental concept in OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class.

Example: In the following example, Animal is the base class and Dog, Cat and Cow are derived classes that extend the Animal class.

inheritance-660x454
Implementation:




// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
​
// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
​
// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
​
// Child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}
​
// Main class
public class Geeks {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
​
        a = new Cat();
        a.sound();
​
        a = new Cow();
        a.sound();
    }
}

Output
Dog barks
Cat meows
Cow moos
Explanation:

Animal is the base class.
Dog, Cat and Cow are derived classes that extend Animal class and provide specific implementations of the sound() method.
The Geeks class is the driver class that creates objects and demonstrates runtime polymorphism using method overriding.
Note: In practice, inheritance and polymorphism are used together in Java to achieve fast performance and readability of code.

Syntax

class ChildClass extends ParentClass {

    // Additional fields and methods
}
Note: In Java, inheritance is implemented using the extends keyword. The class that inherits is called the subclass (child class) and the class being inherited from is called the superclass (parent class).

Why Use Inheritance in Java?
Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.
Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.
Abstraction: The concept of abstraction where we do not have to provide all details, is achieved through inheritance. Abstraction only shows the functionality to the user.
Key Terminologies Used in Java Inheritance
Class: Class is a set of objects that share common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
Extends Keyword: This keyword is used to inherit properties from a superclass.
How Inheritance Works in Java?
The extends keyword is used for inheritance in Java. It enables the subclass to inherit the fields and methods of the superclass. When a class extends another class, it means it inherits all the non-primitive members (fields and methods) of the parent class and the subclass can also override or add new functionality to them.

Note: The extends keyword establishes an "is-a" relationship between the child class and the parent class. This allows a child class to have all the behavior of the parent class.

Types of Inheritance in Java
inheritance
Types of Inheritance in Java
Below are the different types of inheritance which are supported by Java.

Single Inheritance
Multilevel Inheritance
Hierarchical Inheritance
Multiple Inheritance
Hybrid Inheritance
1. Single Inheritance
In single inheritance, a sub-class is derived from only one super class. It inherits the properties and behavior of a single-parent class. Sometimes, it is also known as simple inheritance.

inheritence
Example:




//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
​
// Subclass
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}
​
public class Test {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
    }
}

Output
This is a Vehicle
This Vehicle is Car
2. Multilevel Inheritance
In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also acts as the base class for other classes.
Multilevel-inheritence2

Example:




class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Car obj = new Car(); // Triggers all constructors in order
    }
}

Output
This is a Vehicle
4 Wheeler Vehicles
This 4 Wheeler Vehicle is a Car
3. Hierarchical Inheritance
In hierarchical inheritance, more than one subclass is inherited from a single base class. i.e. more than one derived class is created from a single base class. For example, cars and buses both are vehicle

Hierarchical-inheritance
Example:




class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
​
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}
​
class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}
​
public class Test {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bus obj2 = new Bus();
    }
}

Output
This is a Vehicle
This Vehicle is Car
This is a Vehicle
This Vehicle is Bus
4. Multiple Inheritance (Through Interfaces)
In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.

Note: that Java does not support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through Interfaces.

inheritence3
Example:




interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}
interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}
// Subclass implementing both interfaces
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}
public class Test {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();
    }
}

Output
This is an AmphibiousVehicle
This is a WaterVehicle
This is a LandVehicle
5. Hybrid Inheritance
It is a mix of two or more of the above types of inheritance. In Java, we can achieve hybrid inheritance only through Interfaces if we want to involve multiple inheritance to implement Hybrid inheritance.
hybrid-inheritance

Java IS-A type of Relationship
IS-A represents an inheritance relationship in Java, meaning this object is a type of that object.


public class SolarSystem {
}
public class Earth extends SolarSystem {
}
public class Mars extends SolarSystem {
}
public class Moon extends Earth {
}
Now, based on the above example, in Object-Oriented terms, the following are true:

SolarSystem is the superclass of Earth class.
SolarSystem is the superclass of Mars class.
Earth and Mars are subclasses of SolarSystem class.
Moon is the subclass of both Earth and SolarSystem classes.



class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
public class Moon extends Earth {
    public static void main(String args[])
    {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
​
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}

Output
true
true
true
What Can Be Done in a Subclass?
In sub-classes we can inherit members as is, replace them, hide them or supplement them with new members:

The inherited fields can be used directly, just like any other fields.
We can declare new fields in the subclass that are not in the superclass.
The inherited methods can be used directly as they are.
We can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it (as in the example above, toString() method is overridden).
We can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
We can declare new methods in the subclass that are not in the superclass.
We can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
 Advantages of Inheritance in Java
Code Reusability: Inheritance allows for code reuse and reduces the amount of code that needs to be written. The subclass can reuse the properties and methods of the superclass, reducing duplication of code.
Abstraction: Inheritance allows for the creation of abstract classes that define a common interface for a group of related classes. This promotes abstraction and encapsulation, making the code easier to maintain and extend.
Class Hierarchy: Inheritance allows for the creation of a class hierarchy, which can be used to model real-world objects and their relationships.
Polymorphism: Inheritance allows for polymorphism, which is the ability of an object to take on multiple forms. Subclasses can override the methods of the superclass, which allows them to change their behavior in different ways.
Disadvantages of Inheritance in Java
Complexity: Inheritance can make the code more complex and harder to understand. This is especially true if the inheritance hierarchy is deep or if multiple inheritances is used.
Tight Coupling: Inheritance creates a tight coupling between the superclass and subclass, making it difficult to make changes to the superclass without affecting the subclass.

Inheritance with Java
Visit Course
explore course icon
Discussions
( 28 Threads )

Most Recent
User












Commenting as Vishal Rai

Comment Anonymously
Submit
User
Anonymous_Geek
1 month agoJul 06, 2025 02:41 (GMT +5:30)

The Diagram of the hybrid inheritance is wrong because of the arrows they should be reverse to implement hybrid inheritance otherwise it will create diamond problem


0

Reply
User
Anonymous_Geek
1 month agoJul 04, 2025 10:48 (GMT +5:30)

jamir bayrante was having fun in this subject




0

Reply
User
Harsh
4 months agoApr 09, 2025 22:15 (GMT +5:30)

The code example given in multiple inheritance is wrong because it is showing multilevel inheritance. For multiple inheritance, we should be having multiple interfaces and a class is implementing all those interfaces


0

Reply
(Show 1 Replies)
User
Anonymous_Geek
4 months agoMar 24, 2025 19:57 (GMT +5:30)

very useful for this website for programming language for student




0

Reply
(Show 1 Replies)
User
Sonal Agrawal
7 months agoJan 14, 2025 19:06 (GMT +5:30)

In multiple inheritance block, it is recommended to use @Override annotation when defining any method from parent class. It is missing in "Three" Class which is actually extending both "One" and "Two" class. Though it is internally overrides, mentioning the annotation makes it clear.


0

Reply
(Show 1 Replies)
User
Anonymous_Geek
7 months agoJan 10, 2025 13:58 (GMT +5:30)

sahil sahu sraya m ohlla rajgarh


0

Reply
User
Mahmoud Nabil Mostafa
8 months agoNov 21, 2024 13:22 (GMT +5:30)

2. What are the 3 types of inheritance in Java? There are Single, Multilevel and Hierarchical


0

Reply
(Show 1 Replies)
User
KALAIMAGAL R
11 months agoAug 30, 2024 18:43 (GMT +5:30)

minimize the words for the explanation


0

Reply
(Show 1 Replies)
User
Thum Sneha
12 months agoAug 18, 2024 10:15 (GMT +5:30)

Need some more explanation


0

Reply
(Show 1 Replies)
User
kapil dev patel
1 year agoApr 26, 2024 09:30 (GMT +5:30)

Anyone know inheritance is reusable or not

0

Reply
(Show 2 Replies)
If

 */