package pl.exercise.ferry.ticket;

import java.math.BigDecimal;
import pl.exercise.ferry.vehicle.VehicleType;

public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

  VehicleType getVehicleType(){
    return this.vehicleType;
  }

  String getOwner(){
    return  this.owner;
  }

  @Override
  public BigDecimal getPrice() {
    return BigDecimal.ZERO;
  }

}
