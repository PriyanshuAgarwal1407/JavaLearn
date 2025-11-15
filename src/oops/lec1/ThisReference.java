package oops.lec1;

public class ThisReference {
    String name;
    int age;

    ThisReference(String name, int age) {
        this.name = name;  // this.name refers to instance variable
        this.age = age;    // name and age refer to parameters
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ThisReference s = new ThisReference("Ram", 21);
        s.display();
    }
}
