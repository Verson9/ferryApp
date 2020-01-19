package pl.exercise.ferry.ticket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class BusTicket extends VehicleTicket {

    int length;

    BusTicket (String owner, int length) {
        super(VehicleType.BUS, owner);
        if ( length % 1 == 0 ) {
            this.length = length;
        } else {
            this.length = length + 1 - length % 1;
        }
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(getVehicleType().getPrice() * length);
    }
}
