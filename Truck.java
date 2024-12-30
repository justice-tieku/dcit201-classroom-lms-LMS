public class Truck extends Vehicle {
    private double loadCapacity;  // Load capacity in kg
    private boolean isHeavyDuty;  // If the truck is a heavy-duty truck

    // Constructor for Truck
    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity, boolean isHeavyDuty) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
        this.isHeavyDuty = isHeavyDuty;
    }

    // Implement rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;

        // Add cost based on load capacity
        cost += loadCapacity * 0.1;  // $0.1 per kg of load capacity

        // Additional cost for heavy-duty trucks
        if (isHeavyDuty) {
            cost += 50;  // $50 per day for heavy-duty trucks
        }

        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Getters and Setters for specific truck features
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isHeavyDuty() {
        return isHeavyDuty;
    }

    public void setHeavyDuty(boolean heavyDuty) {
        isHeavyDuty = heavyDuty;
    }

    @Override
    public String toString() {
        return "Truck [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", loadCapacity=" + loadCapacity + ", isHeavyDuty=" + isHeavyDuty + "]";
    }
}