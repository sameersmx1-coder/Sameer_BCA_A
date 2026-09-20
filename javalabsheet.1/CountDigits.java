import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        if (n < 10)
            System.out.println("Number of digits: 1");
        else if (n < 100)
            System.out.println("Number of digits: 2");
        else if (n < 1000)
            System.out.println("Number of digits: 3");
        else if (n < 10000)
            System.out.println("Number of digits: 4");
        else
            System.out.println("Number has 5 or more digits");
    }
}