package pl.exercise.ferry.vehicle;

public class Truck extends Vehicle {
    int mass;

    Truck( String owner, int mass) {
        super(VehicleType.TRUCK, owner);
        this.mass = mass;
    }
}
