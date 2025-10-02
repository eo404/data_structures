#include <stdio.h>
#define SIZE 4

int a[SIZE];
int front = -1, rear = -1;


void enqueue();
void dequeue();
void traverse();

int main() {
    int ch;
    do {
        printf("\n1-Enqueue\n2-Dequeue\n3-Traverse\n0-Exit\nEnter your choice: ");
        scanf("%d", &ch);

        switch(ch) {
            case 1: enqueue(); break;
            case 2: dequeue(); break;
            case 3: traverse(); break;
            case 0: printf("Exiting..."); break;
            default: printf("Invalid choice\n");
        }
    } while(ch != 0);

    return 0;
}

void enqueue() {
    int el;
    
    if ((front == 0 && rear == SIZE-1) || (rear + 1) % SIZE == front) {
        printf("Queue is Full\n");
        return;
    }

    printf("Enter element to be inserted: ");
    scanf("%d", &el);

    if (front == -1) { 
        front = 0;
        rear = 0;
    } else {
        rear = (rear + 1) % SIZE; 
    }

    a[rear] = el;
    printf("%d enqueued\n", el);
}

void dequeue() {
    if (front == -1) {
        printf("Queue is Empty\n");
        return;
    }

    int el = a[front];

    if (front == rear) { 
        front = -1;
        rear = -1;
    } else {
        front = (front + 1) % SIZE; 
    }

    printf("Element dequeued is %d\n", el);
}

void traverse() {
    if (front == -1) {
        printf("Queue is Empty\n");
        return;
    }

    printf("Queue elements: ");
    int i = front;
    while (1) {
        printf("%d ", a[i]);
        if (i == rear)
            break;
        i = (i + 1) % SIZE;
    }
    printf("\n");
}
