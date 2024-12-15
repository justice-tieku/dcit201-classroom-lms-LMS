public class App {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create and add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);

        // Create and add patrons
        Patron patron1 = new Patron("Alice", 101);
        Patron patron2 = new Patron("Bob", 102);
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Display books and patrons
        library.displayBooks();
        library.displayPatrons();
    }
}