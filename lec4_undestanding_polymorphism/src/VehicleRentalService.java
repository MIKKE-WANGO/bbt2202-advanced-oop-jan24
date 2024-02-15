public class VehicleRentalService {
    public double rentVehicle(String vehicleType, int rentalDuration, boolean insuranceIncluded) {
        double rentalCost = 0;
        if (vehicleType.equals("car")) {
            rentalCost = rentCar(rentalDuration, insuranceIncluded);
        } else if (vehicleType.equals("bike")) {
            rentalCost = rentBike(rentalDuration, insuranceIncluded);
        } else if (vehicleType.equals("scooter")) {
            rentalCost = rentScooter(rentalDuration, insuranceIncluded);
        } else {
            System.out.println("Invalid vehicle type");
        }
        return rentalCost;
    }

    private double rentCar(int rentalDuration, boolean insuranceIncluded) {
        // Assume rental cost calculation based on duration and insurance
        double rentalCost = 50 * rentalDuration;
        if (insuranceIncluded) {
            rentalCost += 20;
        }
        return rentalCost;
    }

    private double rentBike(int rentalDuration, boolean insuranceIncluded) {
        // Assume rental cost calculation based on duration and insurance
        double rentalCost = 20 * rentalDuration;
        if (insuranceIncluded) {
            rentalCost += 10;
        }
        return rentalCost;
    }

    private double rentScooter(int rentalDuration, boolean insuranceIncluded) {
        // Assume rental cost calculation based on duration and insurance
        double rentalCost = 15 * rentalDuration;
        if (insuranceIncluded) {
            rentalCost += 5;
        }
        return rentalCost;
    }

    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();
        
        double carRentalCost = rentalService.rentVehicle("car", 3, true);
        System.out.println("Car Rental Cost: $" + carRentalCost);
        
        double bikeRentalCost = rentalService.rentVehicle("bike", 2, false);
        System.out.println("Bike Rental Cost: $" + bikeRentalCost);
        
        double scooterRentalCost = rentalService.rentVehicle("scooter", 1, true);
        System.out.println("Scooter Rental Cost: $" + scooterRentalCost);
    }
}
