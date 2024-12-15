public class Patron {
    private String name;
    private int patronID;

    // Constructor
    public Patron(String name, int patronID) {
        this.name = name;
        this.patronID = patronID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for patronID
    public int getPatronID() {
        return patronID;
    }

    // Display patron information
    public void displayPatronInfo() {
        System.out.println("Patron ID: " + patronID + ", Name: " + name);
    }
}