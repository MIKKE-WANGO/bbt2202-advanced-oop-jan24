public class Boat extends Vehicle1 {

    private int maxSpeedKnots;
    private String propulsionSystem;

    // Constructor
    public Boat(String make, String model, String type, int maxSpeedKnots, String propulsionSystem) {
        super(make, model, type);
        this.maxSpeedKnots = maxSpeedKnots;
        this.propulsionSystem = propulsionSystem;
    }

    // Unique attribute getters and setters
    public int getMaxSpeedKnots() {
        return maxSpeedKnots;
    }

    public void setMaxSpeedKnots(int maxSpeedKnots) {
        this.maxSpeedKnots = maxSpeedKnots;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    // Unique behavior 1
    public void startEngine() {
        System.out.println("Starting the boat's propulsion system.");
    }

    // Unique behavior 2
    public void navigate() {
        System.out.println("Navigating the boat through the water.");
    }

    // Override the displayVehicleInfo method to include boat-specific information
    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Max Speed (Knots): " + maxSpeedKnots + ", Propulsion System: " + propulsionSystem);
    }
}
