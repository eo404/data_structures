#include <stdio.h>
#define SIZE 4

int a[SIZE], top = -1;

void push();
void pop();
void traverse();

int main() {
    int ch;
    do {
        printf("\n\n1 - Push\n2 - Pop\n3 - Traverse\n4 - Exit\nEnter your choice: ");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                traverse();
                break;
            case 4:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    } while (ch != 4);
    return 0;
}

void push() {
    int el;
    if (top == SIZE - 1) {
        printf("Stack is Full!\n");
    } else {
        printf("Enter element to be inserted: ");
        scanf("%d", &el);
        a[++top] = el;
        printf("%d pushed into stack.\n", el);
    }
}

void pop() {
    if (top == -1) {
        printf("Stack is Empty!\n");
    } else {
        printf("Element deleted is %d\n", a[top--]);
    }
}

void traverse() {
    if (top == -1) {
        printf("Stack is Empty!\n");
    } else {
        printf("Stack elements are: ");
        for (int i = top; i >= 0; i--) {
            printf("%d ", a[i]);
        }
        printf("\n");
    }
}
