import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles = new ArrayList<>();

    // Add vehicle to the fleet
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Rent a vehicle to a customer
    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            double cost = vehicle.calculateRentalCost(days);

            // Check if the customer has sufficient balance
            if (customer.getBalance() >= cost) {
                customer.deductBalance(cost);  // Deduct rental cost from customer's balance
                vehicle.setAvailable(false);   // Mark vehicle as rented
                System.out.println("Vehicle rented successfully for " + days + " days. Total cost: $" + cost);
            } else {
                System.out.println("Insufficient balance. Rental cannot be processed.");
            }
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    // Return a rented vehicle
    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);  // Mark vehicle as available
        System.out.println("Vehicle returned successfully.");
    }

    // Display the list of vehicles in the fleet
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
