package restartEverythingDSA2026;


    class MyStack {
        int arr[];
        int top;
        int size;

        public MyStack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        // Insert element
        void push(int x) {
            if (top == size - 1) {
                System.out.println("Stack is full");
                return;
            }
            arr[++top] = x;
        }

        // Remove element
        int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if (top == -1) return -1;
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public class Main {
        public static void main(String[] args) {
            MyStack st = new MyStack(5);

            st.push(10);
            st.push(20);
            st.push(30);

            System.out.println(st.pop());
            System.out.println(st.peek());
        }
    }


