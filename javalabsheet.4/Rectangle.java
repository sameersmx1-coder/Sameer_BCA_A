class Rectangle {
    double length;
    double breadth;

    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;

        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.calculateArea();
    }
}