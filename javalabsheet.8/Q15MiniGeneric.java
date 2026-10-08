
import java.util.ArrayList;
import java.util.Scanner;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name
                + ", Marks: " + marks);
    }
}

public class Q15MiniGeneric {
    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> students =
                new ArrayList<>();

        students.add(new Student<>(101, "Aman", 85.5));
        students.add(new Student<>(102, "Rahul", 90.0));
        students.add(new Student<>(103, "Neha", 88.5));
        students.add(new Student<>(104, "Priya", 92.0));
        students.add(new Student<>(105, "Sameer", 80.5));

        System.out.println("Student List:");
        for (Student<Integer, String, Double> s : students) {
            s.display();
        }

        System.out.println("\nTotal Students: " + students.size());

        System.out.println("\nFirst Student:");
        students.get(0).display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Student<Integer, String, Double> s : students) {
            if (s.id.equals(searchId)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }

        System.out.println("\nType Safety: Integer ID, "
                + "String Name, Double Marks");

        sc.close();
    }
}