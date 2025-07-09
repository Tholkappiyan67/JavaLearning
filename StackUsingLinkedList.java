import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top = null;

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // Pop operation
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }

    // Peek operation
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice, value;

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Is Empty\n6.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
