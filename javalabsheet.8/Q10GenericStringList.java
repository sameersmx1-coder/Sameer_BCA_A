
import java.util.ArrayList;

public class Q10GenericStringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Rahul");
        names.add("Sameer");
        names.add("Priya");
        names.add("Neha");

        System.out.println("Names: " + names);
        System.out.println("First Name: " + names.get(0));

        names.set(1, "Rohit");
        System.out.println("After set: " + names);

        names.remove("Priya");
        System.out.println("After remove: " + names);

        System.out.println("Size: " + names.size());
    }
}