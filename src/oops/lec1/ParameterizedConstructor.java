package oops.lec1;

public class ParameterizedConstructor {
    int rollNo;
    String studName;

    // Parameterized Constructor
    ParameterizedConstructor(int no, String name) {
        rollNo = no;
        studName = name;
    }
    void display() {
        System.out.println(rollNo + " " + studName);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1 = new ParameterizedConstructor(101, "Priyanshu");
        ParameterizedConstructor s2 = new ParameterizedConstructor(102, "Ankit");
        s1.display();
        s2.display();
    }
}