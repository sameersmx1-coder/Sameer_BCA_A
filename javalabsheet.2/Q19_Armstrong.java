public class Q19_Armstrong {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}