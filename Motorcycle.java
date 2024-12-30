public class Motorcycle extends Vehicle {
    private boolean isSportModel;  // True if it's a sport motorcycle
    private boolean hasSidecar;    // If the motorcycle has a sidecar

    // Constructor for Motorcycle
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isSportModel, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.isSportModel = isSportModel;
        this.hasSidecar = hasSidecar;
    }

    // Implement rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;

        // Additional cost for sport models
        if (isSportModel) {
            cost += 10;
        }

        // Additional cost if the motorcycle has a sidecar
        if (hasSidecar) {
            cost += 15;
        }

        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Getters and Setters for specific motorcycle features
    public boolean isSportModel() {
        return isSportModel;
    }

    public void setSportModel(boolean sportModel) {
        isSportModel = sportModel;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle [vehicleId=" + getVehicleId() + ", model=" + getModel() + ", isSportModel=" + isSportModel + ", hasSidecar=" + hasSidecar + "]";
    }
}
