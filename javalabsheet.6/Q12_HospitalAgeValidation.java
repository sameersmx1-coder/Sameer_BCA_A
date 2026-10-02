import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Q12_HospitalAgeValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Patient age must be between 0 and 120."
                );
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Registration successful.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be numeric.");

        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

