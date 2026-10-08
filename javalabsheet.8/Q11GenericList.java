
import java.util.ArrayList;
import java.util.Scanner;

public class Q11GenericList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 5);
        }

        System.out.println("Numbers: " + numbers);
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        if (numbers.contains(num)) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number not found.");
        }

        sc.close();
    }
}