public class Q3_NumberFormatException {
    public static void main(String[] args) {

        String number = "123";

        try {
            int value = Integer.parseInt(number);
            System.out.println("Integer value = " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer format.");
        }
    }
}
