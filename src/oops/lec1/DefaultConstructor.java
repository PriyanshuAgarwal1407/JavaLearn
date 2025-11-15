package oops.lec1;

public class DefaultConstructor {
    String name;
    int rollNo;

    DefaultConstructor() {
        name = "Ram";
        rollNo = 100;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}
