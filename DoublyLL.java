import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL {
    Node head = null;

    // Insert at end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        // Deleting head node
        if (current.data == value) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found");
        } else {
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DoublyLL list = new DoublyLL();

        while (true) {
            System.out.println("Enter options:\n1. Insert at beginning\n2. Insert at end\n3. Delete\n4. Display\nAny other key to Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    int valBeg = s.nextInt();
                    list.insertAtBeginning(valBeg);
                    break;
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    int valEnd = s.nextInt();
                    list.insertAtEnd(valEnd);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int delVal = s.nextInt();
                    list.delete(delVal);
                    break;
                case 4:
                    list.display();
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
