public class Customer {
    private String customerId;
    private String name;
    private double balance;  // Customer balance for rentals

    // Constructor to initialize customer details
    public Customer(String customerId, String name, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
    }

    // Getter and Setter methods for encapsulation
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deduct rental cost from the customer's balance
    public void deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance to rent the vehicle.");
        }
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", balance=" + balance + "]";
    }
}
