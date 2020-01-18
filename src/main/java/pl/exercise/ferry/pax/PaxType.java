package pl.exercise.ferry.pax;

public enum PaxType {
  CHILD(0, 0, 3),
  YOUNG(5, 3, 18),
  ADULT(10, 18, 70),
  SENIOR(5, 70);

  int price;
  int lowerAgeLimitInclusive;
  int upperAgeLimitExclusive;

  PaxType(int price, int lowerAgeLimitInclusive, int upperAgeLimitExclusive) {
    this.price = price;
    this.lowerAgeLimitInclusive = lowerAgeLimitInclusive;
    this.upperAgeLimitExclusive = upperAgeLimitExclusive;
  }

  PaxType(int price, int lowerAgeLimitInclusive) {
    this.price = price;
    this.lowerAgeLimitInclusive = lowerAgeLimitInclusive;
  }

  public int getPrice() {
    return price;
  }

  public int getLowerAgeLimitInclusive() {
    return lowerAgeLimitInclusive;
  }

  public int getUpperAgeLimitExclusive() {
    return upperAgeLimitExclusive;
  }
}
