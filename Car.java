public class Car extends Vehicle {
    private String carType;  // Example: SUV, Sedan, etc.
    private boolean isLuxury; // Additional feature for luxury cars

    // Constructor for Car
    public Car(String vehicleId, String model, double baseRentalRate, String carType, boolean isLuxury) {
        super(vehicleId, model, baseRentalRate);
        this.carType = carType;
        this.isLuxury = isLuxury;
    }

    // Implement rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        double additionalCost = 0;

        // Add cost based on car type
        if ("SUV".equals(carType)) {
            additionalCost = 15;  // Example: Extra $15 per day for SUV
        } else if ("Sedan".equals(carType)) {
            additionalCost = 5;   // Example: Extra $5 per day for Sedan
        }

        // Additional charge if the car is luxury
        if (isLuxury) {
            additionalCost += 20; // Extra $20 per day for luxury cars
        }

        // Calculate the total rental cost
        return getBaseRentalRate() * days + additionalCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Getters and Setters for specific car features
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    public void setLuxury(boolean luxury) {
        isLuxury = luxury;
    }

    @Override
    public String toString() {
        return "Car [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", carType=" + carType + ", isLuxury=" + isLuxury + "]";
    }
}
