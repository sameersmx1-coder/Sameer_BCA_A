import java.util.Scanner;

public class Q13_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String type = Character.isDigit(ch) ? "Digit"
                : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                ? ("aeiouAEIOU".indexOf(ch) >= 0 ? "Vowel" : "Consonant")
                : "Special Symbol";

        System.out.println("Character is a " + type + ".");

        sc.close();
    }
}