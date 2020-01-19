package pl.exercise.ferry.vehicle;

public class Bus extends Vehicle {
    int length;

    Bus( String owner, int length) {
        super(VehicleType.BUS, owner);
        this.length = length;
    }
}
