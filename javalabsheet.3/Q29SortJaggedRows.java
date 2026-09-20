import java.util.Arrays;

public class Q29SortJaggedRows {
    public static void main(String[] args) {

        int[][] arr = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 6, 3}
        };

        System.out.println("Original jagged array:");

        for (int[] row : arr)
            System.out.println(Arrays.toString(row));

        for (int i = 0; i < arr.length; i++)
            Arrays.sort(arr[i]);

        System.out.println("After sorting each row:");

        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
}