import java.util.Scanner;

public class Q24RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int[] unique = new int[7];
        int count = 0;

        System.out.println("Enter 7 elements:");
        for (int i = 0; i < 7; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < 7; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
    }
}