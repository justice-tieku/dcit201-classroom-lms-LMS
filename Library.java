import java.util.ArrayList;

public class Library {
   public ArrayList<Book> books;
    public ArrayList<Patron> patrons;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron.getName());
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(" - " + book.getTitle());
        }
    }

    // Display all patrons
    public void displayPatrons() {
        System.out.println("Registered Patrons:");
        for (Patron patron : patrons) {
            patron.displayPatronInfo();
        }
    }
}
