public class Q24_MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 45, 5, 30};

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}