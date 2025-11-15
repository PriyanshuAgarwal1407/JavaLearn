package oops.lec1;

// Class definition for Student
class Student {
    String name;
    int rollNo;
    double marks;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // Creating Student object using parameterized constructor
        // Each object holds its own set of data (name, rollNo, marks)
        Student s1 = new Student("Ram", 101, 85.5);

        // Creating Student object using default constructor
        Student s2 = new Student();
        s2.name = "Sita";
        s2.rollNo = 102;
        s2.marks = 90.0;

        // Calling the display() method on each object
        // This prints the details of the respective Student objects
        s1.display();
        s2.display();
    }
}
