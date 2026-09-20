class Library {
    int booksAvailable;

    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        int available = booksAvailable;

        if (available > 0) {
            available--;
            booksAvailable = available;
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("No Books Available");
        }

        System.out.println("Books Available: " + booksAvailable);
    }

    void returnBook() {
        int available = booksAvailable;

        available++;
        booksAvailable = available;

        System.out.println("Book Returned Successfully");
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library(5);

        System.out.println("Library: " + libraryName);

        l.issueBook();
        l.returnBook();
    }
}