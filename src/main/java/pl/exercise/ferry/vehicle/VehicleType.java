package pl.exercise.ferry.vehicle;

public enum VehicleType {
  CAR("Samochód osobowy", 20),
  BIKE("Motor", 10),
  BUS("Autobus", 5),
  TRUCK("Ciężarówka", 10);

  String polishName;
  int price;

  VehicleType(String polishName, int price) {
    this.polishName = polishName;
    this.price = price;
  }

  public String getPolishName() {
    return polishName;
  }

  public int getPrice() {
    return price;
  }
}
