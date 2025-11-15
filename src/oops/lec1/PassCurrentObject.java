package oops.lec1;

class Students {
    private String name;
    private int rollNumber;

    public Students(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber; // Using this to refer to the instance variables
    }

    // The method enrolls the student into a course by passing itself (this) to another class.
    // This pattern is called self-reference or object collaboration.
    public void enrollInCourse(Course course) {
        course.addStudent(this);  // Passes the current Students object to Course
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // addStudent method is called when a student enrolls;
    // it receives the Students object and prints enrollment info.
    public void addStudent(Students student) {
        System.out.println(student.getName() + " enrolled in " + courseName);
    }
}

public class PassCurrentObject {
    public static void main(String[] args) {
        Students student = new Students("Priyanshu", 156);
        Course course = new Course("Java Programming");
        student.enrollInCourse(course);
    }
}
