class Factorial {
    static int totalCalls = 0;

    void calculate(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++)
            factorial *= i;

        totalCalls++;

        System.out.println("Factorial of " + n + " = " + factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.calculate(5);

        System.out.println("Total Calls: " + totalCalls);
    }
}