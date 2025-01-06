package Interview2025DSA;


    class Example {
        int x; // Instance variable
        int y;
        Example(int x, int y) { // Constructor with local variable x
            this.x = x; // `this.x` refers to the instance variable
            this.y=y;
        }

        void display() {
            System.out.println("Value of x: " + x);
            System.out.println(" value of y :"+y);
        }
    }

    public class ThisKeywords {
        public static void main(String[] args) {
            Example obj = new Example(20, 66);
            obj.display(); // Output: Value of x: 20

        }
    }


