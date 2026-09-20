class Triangle {
    double a, b, c;

    static String type = "Triangle";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void check() {
        boolean valid = (a + b > c) &&
                        (a + c > b) &&
                        (b + c > a);

        if (!valid) {
            System.out.println("Invalid Triangle");
            return;
        }

        String triangleType;

        if (a == b && b == c)
            triangleType = "Equilateral";
        else if (a == b || b == c || a == c)
            triangleType = "Isosceles";
        else
            triangleType = "Scalene";

        System.out.println("Valid Triangle");
        System.out.println("Type: " + triangleType);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(5, 5, 6);
        t.check();
    }
}