
public class Q8GenericThree {
    static <T> void display(T a, T b, T c) {
        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        display(10, 20, 30);
        display("Red", "Green", "Blue");
        display(1.5, 2.5, 3.5);
    }
}