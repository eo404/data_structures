import java.util.Scanner;

class CircularQueue {
    static final int SIZE = 4;
    int[] queue = new int[SIZE];
    int front = -1, rear = -1;

    void enqueue(int el) {
        if ((front == 0 && rear == SIZE - 1) || (rear + 1) % SIZE == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) { 
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % SIZE;
        }

        queue[rear] = el;
        System.out.println(el + " enqueued");
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int el = queue[front];

        if (front == rear) { 
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % SIZE;
        }

        System.out.println("Element dequeued is " + el);
    }

    void traverse() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % SIZE;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue cq = new CircularQueue();
        int ch;

        do {
            System.out.print("\n1-Enqueue\n2-Dequeue\n3-Traverse\n0-Exit\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int el = sc.nextInt();
                    cq.enqueue(el);
                    break;
                case 2: cq.dequeue(); break;
                case 3: cq.traverse(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }

        } while (ch != 0);

        sc.close();
    }
}
