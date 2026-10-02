import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Q15_PharmacyInventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            String availableInput = sc.nextLine();

            System.out.print("Enter required quantity: ");
            String requiredInput = sc.nextLine();

            int available = Integer.parseInt(availableInput);
            int required = Integer.parseInt(requiredInput);

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Required quantity is greater than available stock."
                );
            }

            System.out.println("Medicine: " + medicineName);
            System.out.println("Transaction successful.");
            System.out.println(
                "Remaining quantity = " + (available - required)
            );

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println(
                "Pharmacy inventory transaction completed."
            );
        }

        sc.close();
    }
}

