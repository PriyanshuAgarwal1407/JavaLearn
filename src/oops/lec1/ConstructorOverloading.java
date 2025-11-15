package oops.lec1;

class Employee {
    String name;
    int id;
    double salary;

    Employee() {
        name = "Not Assigned";
        id = 0;
        salary = 0.0;
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 20000.0;
    }

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        emp1.display();

        // Using double parameter constructor
        Employee emp2 = new Employee("Ram", 101);
        emp2.display();

        // Using triple parameter constructor
        Employee emp3 = new Employee("Shyam", 102, 50000.0);
        emp3.display();
    }
}

/*
Name: Not Assigned, ID: 0, Salary: 0.0
Name: Ram, ID: 101, Salary: 20000.0
Name: Shyam, ID: 102, Salary: 50000.0
 */
