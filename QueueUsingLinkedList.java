import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null, rear = null;

    // Enqueue - insert at the rear
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // Queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue - remove from front
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Dequeued: " + front.data);
            front = front.next;
            if (front == null) rear = null; // Queue became empty
        }
    }

    // Peek - front element
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front: " + front.data);
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Peek  4.Display  5.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
