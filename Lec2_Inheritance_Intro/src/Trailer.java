public class Trailer extends Vehicle {

    private double cargoCapacityCubicFeet;
    private boolean hasRamp;

    // Constructor
    public Trailer(String make, String model, String type, double cargoCapacityCubicFeet, boolean hasRamp) {
        super(make, model, type);
        this.cargoCapacityCubicFeet = cargoCapacityCubicFeet;
        this.hasRamp = hasRamp;
    }

    // Unique attribute getters and setters
    public double getCargoCapacityCubicFeet() {
        return cargoCapacityCubicFeet;
    }

    public void setCargoCapacityCubicFeet(double cargoCapacityCubicFeet) {
        this.cargoCapacityCubicFeet = cargoCapacityCubicFeet;
    }

    public boolean hasRamp() {
        return hasRamp;
    }

    public void setHasRamp(boolean hasRamp) {
        this.hasRamp = hasRamp;
    }

    // Unique behavior 1
    public void loadCargo() {
        System.out.println("Loading cargo into the trailer.");
    }

    // Unique behavior 2
    public void unloadCargo() {
        System.out.println("Unloading cargo from the trailer.");
    }

    // Override the displayVehicleInfo method to include trailer-specific information
    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Cargo Capacity (Cubic Feet): " + cargoCapacityCubicFeet + ", Has Ramp: " + hasRamp);
    }
}
