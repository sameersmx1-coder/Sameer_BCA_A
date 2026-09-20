import java.util.Scanner;

public class Q26_DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 ->
                System.out.println("Weekday");
            case 6, 7 ->
                System.out.println("Weekend");
            default ->
                System.out.println("Invalid day number");
        }

        sc.close();
    }
}