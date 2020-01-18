package pl.exercise.ferry.screen.database;

public class User {
    int vehicleTicketPrice = 0;
    int personTicketPrice = 0;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonTicketPrice() {
        return personTicketPrice;
    }

    public void setPersonTicketPrice(int personTicketPrice) {
        this.personTicketPrice = personTicketPrice;
    }

    public int getVehicleTicketPrice() {
        return vehicleTicketPrice;
    }

    public void setVehicleTicketPrice(int vehicleTicketPrice) {
        this.vehicleTicketPrice = vehicleTicketPrice;
    }

    public int getSummaryPriceForThisPersonTickets() {
        return vehicleTicketPrice + personTicketPrice;
    }
}
