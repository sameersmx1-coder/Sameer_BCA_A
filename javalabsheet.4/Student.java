class Student {
    String name;
    int age;

    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sameer", 20);
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}