public class Bike extends Vehicle1 {
    String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }
}
