SIZE = 4
stack = []

def push():
    if len(stack) == SIZE:
        print("Stack is Full!")
    else:
        el = int(input("Enter element to be inserted: "))
        stack.append(el)
        print(f"{el} pushed into stack.")

def pop():
    if not stack:
        print("Stack is Empty!")
    else:
        el = stack.pop()
        print(f"Element deleted is {el}")

def traverse():
    if not stack:
        print("Stack is Empty!")
    else:
        print("Stack elements are:", " ".join(map(str, reversed(stack))))

def main():
    while True:
        print("\n1 - Push\n2 - Pop\n3 - Traverse\n4 - Exit")
        ch = int(input("Enter your choice: "))
        if ch == 1:
            push()
        elif ch == 2:
            pop()
        elif ch == 3:
            traverse()
        elif ch == 4:
            print("Exiting program.")
            break
        else:
            print("Invalid choice!")

if __name__ == "__main__":
    main()
