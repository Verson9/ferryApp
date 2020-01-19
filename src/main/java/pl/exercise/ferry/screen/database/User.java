package pl.exercise.ferry.screen.database;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Ferry> toGoToFerryList = new ArrayList<>();
    List<Ferry> completedReffryList = new ArrayList<>();

    String username;
    Login login;
    Password password;

    public User(String username, String login,  String password) {
        this.username = username;
        this.login = new Login(login);
        this.password = new Password(password);
    }

    int vehicleTicketPrice = 0;
    int personTicketPrice = 0;

    public String getLogin() {
        return login.toString();
    }

    public String getPassword() {
        return password.toString();
    }

    public String getUsername() {
        return username;
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
