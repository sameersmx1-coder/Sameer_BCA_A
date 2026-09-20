public class Q4_Increment {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors = " + visitors);

        System.out.println("Visitor entering (prefix): " + (++visitors));
        System.out.println("Visitors after entry = " + visitors);

        System.out.println("Visitor leaving (postfix): " + (visitors--));
        System.out.println("Visitors after leaving = " + visitors);
    }
}