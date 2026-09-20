import java.util.Scanner;

public class Q15_SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;
            temp >>>= 1;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}
