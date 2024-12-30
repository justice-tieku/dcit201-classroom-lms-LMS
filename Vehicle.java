// Abstract class Vehicle with required abstract methods for rental system
public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean availableForRental;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.availableForRental = true; // Assume all vehicles are available at the start
    }

    // Getter and Setter methods with validation for each field
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate cannot be negative.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return availableForRental;
    }

    public void setAvailable(boolean available) {
        this.availableForRental = available;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}
