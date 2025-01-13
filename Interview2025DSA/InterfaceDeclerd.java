package Interview2025DSA;
//Can a class implement multiple interfaces?
/*
Explanation: Yes, Java allows a class to implement multiple interfaces.
This is one of the key advantages of using interfaces, as
Java does not support multiple inheritance for classes.*/



interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Output: Method A implemented
        obj.methodB(); // Output: Method B implemented
    }
}

