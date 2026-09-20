class StudentGrade {
    String name;
    int marks;

    static int passingMarks = 40;

    StudentGrade(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        String grade;

        if (marks < passingMarks)
            grade = "F";
        else if (marks >= 90)
            grade = "A+";
        else if (marks >= 80)
            grade = "A";
        else if (marks >= 70)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else
            grade = "D";

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade("Sameer", 85);
        s.calculateGrade();
    }
}