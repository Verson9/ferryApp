package pl.exercise.ferry.ticket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class BikeTicket extends VehicleTicket {
    BikeTicket(String owner) {
        super(VehicleType.BIKE, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(getVehicleType().getPrice());
    }
}
