class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Q1GenericBox {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(25.5);

        System.out.println("Integer: " + intBox.getValue());
        System.out.println("String: " + stringBox.getValue());
        System.out.println("Double: " + doubleBox.getValue());
    }
}