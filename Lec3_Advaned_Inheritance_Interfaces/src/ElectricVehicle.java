// ElectricVehicle.java
abstract class ElectricVehicle {
    // Abstract method to be implemented by subclasses
    public abstract String batteryType();

    // Common methods or properties for all electric vehicles can be added here
}


class ElectricBike extends ElectricVehicle {

    @Override
    public String batteryType() {
        return "Nickel Metal Hydride Battery";
    }
}


class ElectricCar extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Lithium-ion Battery";
    }

    // Additional methods and properties specific to ElectricCar
}