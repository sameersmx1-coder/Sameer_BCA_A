
import java.util.ArrayList;

public class Q9GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}