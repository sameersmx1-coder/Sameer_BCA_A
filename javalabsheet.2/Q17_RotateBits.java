import java.util.Scanner;

public class Q17_RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int rotated = Integer.rotateLeft(n, 2);

        System.out.println("Original binary: " + Integer.toBinaryString(n));
        System.out.println("Rotated binary: " + Integer.toBinaryString(rotated));
        System.out.println("Rotated value: " + rotated);

        sc.close();
    }
}