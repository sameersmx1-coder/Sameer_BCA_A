import java.util.Random;

public class Q29_RandomBreak {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100) + 1;
            System.out.println("Generated: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found: " + number);
                break;
            }
        }
    }
}