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

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Thols");
        Employee e2 = new Employee(2, "Kumar");

        e1.display();
        System.out.println();
        e2.display();
    }
}
