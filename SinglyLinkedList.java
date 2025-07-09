import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
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
            temp.next = newNode;}}
    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value not found");
        } else {
            current.next = current.next.next;}}
    // Traverse (print the list)
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Main method to test
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        while (true) {
            System.out.println("Enter options:\n 1.Insert at beginning\n 2.Insert at end \n3.Delete \n4.Display");
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.print("Enter value to insert at beginning: ");
                int value = s.nextInt();
                list.insertAtBeginning(value);
            } else if (choice == 2) {
                System.out.print("Enter value to insert at end: ");
                int value = s.nextInt();
                list.insertAtEnd(value);
            } else if (choice == 3) {
                System.out.print("Enter value to delete: ");
                int value = s.nextInt();
                list.delete(value);
            } else if (choice == 4) {
                list.display();
            }
            else{
                System.out.println("exit");
                break;
            }
        }
    }
}