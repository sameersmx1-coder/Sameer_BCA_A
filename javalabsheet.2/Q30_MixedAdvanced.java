
import java.util.Scanner;

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check power of 4 using shifts
        int temp = n;
        int power = 0;

        while (temp > 1 && (temp & 1) == 0) {
            temp >>= 2;
            power++;
        }

        if (temp == 1)
            System.out.println(n + " is a power of 4.");
        else
            System.out.println(n + " is not a power of 4.");

        // Toggle 3rd bit
        int toggled = n ^ (1 << 2);

        System.out.println("Original number = " + n);
        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}