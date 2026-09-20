import java.util.Scanner;

public class Q16_ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int multiplied = n << power;
        int divided = n >> power;

        System.out.println("After multiplication by 2^" + power + " = " + multiplied);
        System.out.println("After division by 2^" + power + " = " + divided);

        sc.close();
    }
}