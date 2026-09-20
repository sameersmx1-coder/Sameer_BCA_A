class StudentMarks {
    int marks1, marks2, marks3;

    static String universityName = "XYZ University";

    StudentMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(80, 75, 90);
        s.calculateAverage();
    }
}