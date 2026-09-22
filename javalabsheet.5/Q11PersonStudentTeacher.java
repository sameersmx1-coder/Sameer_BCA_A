class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println("Student is studying " + course + ".");
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Teacher is teaching " + subject + ".");
    }
}

public class Q11PersonStudentTeacher {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sameer";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Java";

        s.displayName();
        System.out.println("Course: " + s.course);
        s.study();

        System.out.println();

        t.displayName();
        System.out.println("Subject: " + t.subject);
        t.teach();
    }
}