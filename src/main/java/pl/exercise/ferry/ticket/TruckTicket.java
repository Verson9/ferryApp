package pl.exercise.ferry.ticket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class TruckTicket extends VehicleTicket {
    private final int mass;

    TruckTicket(String owner, int mass) {
        super(VehicleType.TRUCK, owner);
        if ( mass % 1 == 0 ) {
            this.mass = mass;
        } else {
            this.mass = mass + 1 - mass % 1;
        }
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(getVehicleType().getPrice() * mass);
    }
}
