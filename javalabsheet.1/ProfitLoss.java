import java.util.Scanner;

class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit = " + profit);
        } 
        else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss = " + loss);
        } 
        else {
            System.out.println("No Profit, No Loss");
        }
    }
}