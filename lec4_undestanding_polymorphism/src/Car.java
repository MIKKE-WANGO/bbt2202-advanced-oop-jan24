public class Car extends Vehicle1{
    int seats;

    public Car(String make, String model, int year, int seats) {
        super(make, model, year);
        this.seats = seats;
    }
}
