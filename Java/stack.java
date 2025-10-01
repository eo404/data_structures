import java.util.Scanner;

public class StackExample {
    static int SIZE = 4;
    static int[] stack = new int[SIZE];
    static int top = -1;

    static void push(Scanner sc) {
        if (top == SIZE - 1) {
            System.out.println("Stack is Full!");
        } else {
            System.out.print("Enter element to be inserted: ");
            int el = sc.nextInt();
            stack[++top] = el;
            System.out.println(el + " pushed into stack.");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Element deleted is " + stack[top--]);
        }
    }

    static void traverse() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.print("Stack elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1 - Push\n2 - Pop\n3 - Traverse\n4 - Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    push(sc);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    traverse();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 4);
        sc.close();
    }
}
