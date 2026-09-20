import java.util.Scanner;

class LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (& or |): ");
        char op = sc.next().charAt(0);

        if (op == '&') {
            System.out.println("Result: " + (a & b));
        } 
        else if (op == '|') {
            System.out.println("Result: " + (a | b));
        } 
        else {
            System.out.println("Invalid operator");
        }
    }
}