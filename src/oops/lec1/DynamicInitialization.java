package oops.lec1;

public class DynamicInitialization {
    String name;
    int rollNo;

    // Parameterized Constructor for dynamic initialization
    DynamicInitialization(String n, int r) {
        name = n;
        rollNo = r;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

    }

    public static void main(String[] args) {
        int id = 201;
        String studentName = "Ramesh";

        // Dynamic initialization using constructor at runtime
        DynamicInitialization s1 = new DynamicInitialization(studentName, id);
        s1.show();
    }
}

/*
Name: Ramesh
Roll No: 201
 */
