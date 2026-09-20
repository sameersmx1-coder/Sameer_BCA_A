import java.util.Scanner;

class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        int firstDigit = n / 10000;
        int lastDigit = n % 10;

        if (firstDigit == lastDigit)
            System.out.println("First and last digits are the same");
        else
            System.out.println("First and last digits are different");
    }
}