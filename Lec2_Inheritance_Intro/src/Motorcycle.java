public class Motorcycle extends Vehicle {

    private int numWheels;
    private boolean hasWindshield;

    // Constructor
    public Motorcycle(String make, String model, String type, int numWheels, boolean hasWindshield) {
        super(make, model, type);
        this.numWheels = numWheels;
        this.hasWindshield = hasWindshield;
    }

    // Unique attribute getters and setters
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public boolean hasWindshield() {
        return hasWindshield;
    }

    public void setHasWindshield(boolean hasWindshield) {
        this.hasWindshield = hasWindshield;
    }

    // Unique behavior 1
    public void wheelie() {
        System.out.println("Performing a wheelie on the motorcycle!");
    }

    // Unique behavior 2
    public void toggleWindshield() {
        if (hasWindshield) {
            System.out.println("Removing the windshield from the motorcycle.");
            hasWindshield = false;
        } else {
            System.out.println("Adding a windshield to the motorcycle.");
            hasWindshield = true;
        }
    }

    // Override the displayVehicleInfo method to include motorcycle-specific information
    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Wheels: " + numWheels + ", Has Windshield: " + hasWindshield);
    }
}
