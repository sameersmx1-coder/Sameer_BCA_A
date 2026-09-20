import java.util.Scanner;

public class Q27_GradeMeaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            case 'D' -> System.out.println("Below Average");
            case 'E' -> System.out.println("Poor");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("Invalid grade");
        }

        sc.close();
    }
}