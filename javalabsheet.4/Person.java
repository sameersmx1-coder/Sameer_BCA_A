class Person {
    String name;
    int age;

    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkVoting() {
        String personName = name;
        int personAge = age;

        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);

        if (personAge >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

    public static void main(String[] args) {
        Person p = new Person("Sameer", 20);
        p.checkVoting();
    }
}