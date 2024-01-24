public class Bus extends Vehicle {

    private int seatingCapacity;
    private boolean doubleDecker;

    // Constructor
    public Bus(String make, String model, String type, int seatingCapacity, boolean doubleDecker) {
        super(make, model, type);
        this.seatingCapacity = seatingCapacity;
        this.doubleDecker = doubleDecker;
    }

    // Unique attribute getters and setters
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isDoubleDecker() {
        return doubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        this.doubleDecker = doubleDecker;
    }

    // Unique behavior 1
    public void openDoors() {
        System.out.println("Opening the bus doors.");
    }

    // Unique behavior 2
    public void announceNextStop() {
        System.out.println("Announcing the next bus stop to passengers.");
    }

    // Override the displayVehicleInfo method to include bus-specific information
    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Double Decker: " + doubleDecker);
    }
}
