// // //Create a singly linked list and print all elements 

// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }

// // class SinglyLinkedList {
// //     Node head;
// //     // Method to insert a new node at the begning of the list
// //     public void insertAtBeginning(int data) {
// //         Node newNode = new Node(data);
// //         newNode.next = head;
// //         head = newNode;
// //     }
// //     // Method to print all elements in the list
// //     public void printList() {
// //         Node current = head;
// //         while (current != null) {
// //             System.out.print(current.data + " ");
// //             current = current.next;
// //         }
// //         System.out.println();
// //     }
// //     public static void main(String[] args) {
// //         SinglyLinkedList list = new SinglyLinkedList();
// //         list.insertAtBeginning(10);
// //         list.insertAtBeginning(20);
// //         list.printList();
// //     }
// // }

// //Insert a node at the end of the list

// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }

// // class SinglyLinkedList {
// //     Node head = null;

// //     // Insert at end
// //     public void insertAtEnd(int data) {
// //         Node newNode = new Node(data);
// //         if (head == null) {
// //             head = newNode;
// //         } else {
// //             Node current = head;
// //             while (current.next != null) {
// //                 current = current.next;
// //             }
// //             current.next = newNode;
// //         }
// //     }

// //     // Display list
// //     public void Display() {
// //         Node current = head;
// //         while (current != null) {
// //             System.out.print(current.data + " ");
// //             current = current.next;
// //         }
// //         System.out.println();
// //     }
// // }

// // public class SinglyLL {
// //     public static void main(String[] args) {
// //         SinglyLinkedList list = new SinglyLinkedList();
// //         list.insertAtEnd(10);
// //         list.insertAtEnd(20);
// //         list.insertAtEnd(30);
// //         list.Display(); // Output: 10 20 30
// //     }
// // }


// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class SinglyLinkedList {
//     Node head = null;

//     // Insert at end
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = newNode;
//         }
//     }

//     // Display list
//     public void Display() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     // 4. Count number of nodes
//     public int countNodes() {
//         int count = 0;
//         Node current = head;
//         while (current != null) {
//             count++;
//             current = current.next;
//         }
//         return count;
//     }
                
//     // 5. Search for an element
//     public boolean searchElement(int value) {
//         Node current = head;
//         while (current != null) {
//             if (current.data == value) {
//                 return true;
//             }
//             current = current.next;
//         }
//         return false;
//     }

//     // 6. Delete a node from the beginning
//     public void deleteFromBeginning() {
//         if (head == null) {
//             System.out.println("List is already empty.");
//         } else {
//             head = head.next;
//         }
//     }

//     // 7. Delete a node from the end
//     public void deleteFromEnd() {
//         if (head == null) {
//             System.out.println("List is already empty.");
//         } else if (head.next == null) {
//             head = null;
//         } else {
//             Node current = head;
//             while (current.next.next != null) {
//                 current = current.next;
//             }
//             current.next = null;
//         }
//     }

//     // 8. Check if the list is empty
//     public boolean isEmpty() {
//         return head == null;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SinglyLinkedList list = new SinglyLinkedList();

//         list.insertAtEnd(10);
//         list.insertAtEnd(20);
//         list.insertAtEnd(30);
//         list.Display();  // 10 20 30

//         System.out.println(list.countNodes());  // 3
//         System.out.println(list.searchElement(20));  // true
//         System.out.println(list.searchElement(40));  // false

//         list.deleteFromBeginning();
//         list.Display();  // 20 30

//         list.deleteFromEnd();
//         list.Display();  // 20

//         System.out.println("List is empty: " + list.isEmpty());  // false

//         list.deleteFromBeginning(); // deletes 20
//         System.out.println("List is empty: " + list.isEmpty());  // true
//     }
// }

