// class Person {
//     String name;
//     int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// public class Object {
//     public static void main(String[] args) {
//         Person p1 = new Person("luffy", 25);

//         p1.display();
//     }
// }

// class Circle{
//   double radius;

//   Circle(double radius){
//     this.radius=radius;
//   }

//   void display(){
//     radius=Math.PI*radius*radius;
//     System.out.println(radius);
//   }
// }

// public class Object {
//     public static void main(String[] args) {
//         Circle p1 = new Circle(5);

//         p1.display();
//     }
// }

// class Employee{
//     private double Salary;

//     public void setSalary(double s){
//         Salary=s;
//     }
//     public double getSalary(){
//         return Salary;
//     } 
// }
//     public class Object{
//         public static void main(String[] args) {
//             Employee e=new Employee();
//             e.setSalary(20000);
//             System.out.println(e.getSalary());
//         }
//     }


// abstract class Vehicle {
//      abstract void startEngine();
// }

// class Car extends Vehicle {
   
//          void startEngine() {
//         System.out.println("Car engine started.");
//     }

    
// }

// public class Object {
//     public static void main(String[] args) {
//         Car myCar = new Car();

//         myCar.startEngine(); 

      
//     }
// }

        

//INTERFACE

// interface Printable {
//     void print();
// }

// class Document implements Printable {
//     public void print() {
//         System.out.println("Printing document");
//     }
// }

// public class Object {
//     public static void main(String[] args) {
//         Document doc = new Document();
//         doc.print();
//     }
// }



//Threads

// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {
//         MyThread t1 = new MyThread(); 
//         t1.start();                   
//     }
// }

// class EvenRunnable implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("Even: " + i);
//             }
//         }
//     }
// }

// class OddRunnable implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 != 0) {
//                 System.out.println("Odd: " + i);
//             }
//         }
//     }
// }

// public class Object {
//     public static void main(String[] args) {
//         EvenRunnable evenTask = new EvenRunnable();
//         OddRunnable oddTask = new OddRunnable();

//         Thread t1 = new Thread(evenTask);
//         Thread t2 = new Thread(oddTask);

//         t1.start();
//         t2.start();
//     }
// }


// public class Object {

//     public static void main(String[] args) {
//         String str="123";

//         int intval=Integer.parseInt(str);
//         double dval=Double.parseDouble(str);
//         System.out.println(intval);
//         System.out.println(dval);
//     }
// }

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Object {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Thols");
        Employee e2 = new Employee(2, "Kumar");

        e1.display();
        System.out.println();
        e2.display();
    }
}



