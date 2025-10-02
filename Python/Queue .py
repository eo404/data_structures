SIZE = 4
queue = [0] * SIZE
front = -1
rear = -1

def enqueue(el):
    global front, rear
    if (front == 0 and rear == SIZE - 1) or (rear + 1) % SIZE == front:
        print("Queue is Full")
        return

    if front == -1:  # First element
        front = 0
        rear = 0
    else:
        rear = (rear + 1) % SIZE

    queue[rear] = el
    print(f"{el} enqueued")

def dequeue():
    global front, rear
    if front == -1:
        print("Queue is Empty")
        return

    el = queue[front]
    if front == rear:
        front = -1
        rear = -1
    else:
        front = (front + 1) % SIZE

    print(f"Element dequeued is {el}")

def traverse():
    if front == -1:
        print("Queue is Empty")
        return

    print("Queue elements:", end=" ")
    i = front
    while True:
        print(queue[i], end=" ")
        if i == rear:
            break
        i = (i + 1) % SIZE
    print()

# Main program
while True:
    print("\n1-Enqueue\n2-Dequeue\n3-Traverse\n0-Exit")
    ch = int(input("Enter your choice: "))

    if ch == 1:
        el = int(input("Enter element to enqueue: "))
        enqueue(el)
    elif ch == 2:
        dequeue()
    elif ch == 3:
        traverse()
    elif ch == 0:
        print("Exiting...")
        break
    else:
        print("Invalid choice")
