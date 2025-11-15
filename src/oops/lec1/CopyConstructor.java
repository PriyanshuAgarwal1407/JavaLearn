package oops.lec1;

public class CopyConstructor {
    int id;
    String name;

    // Parameterized Constructor
    CopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor(1, "Raman");
        s1.display();

        // Using copy constructor to create s2 as a copy of s1
        CopyConstructor s2 = new CopyConstructor(s1);  // This copies all values from `s1` to `s2`.
        s2.display();
    }
}
