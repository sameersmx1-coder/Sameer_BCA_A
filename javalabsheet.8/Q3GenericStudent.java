
class Student<T> {
    T id;

    Student(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class Q3GenericStudent {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<>(101);
        s1.display();
    }
}