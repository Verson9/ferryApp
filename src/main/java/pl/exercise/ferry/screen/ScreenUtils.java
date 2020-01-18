package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;

public class ScreenUtils {
    public static void displayBalance(User user) {
        System.out.println("Aktualny koszt biletów osobowych: " + user.getPersonTicketPrice());
        if ( user.getVehicleTicketPrice() > 0 ) {
            System.out.println("Aktualny koszt biletów za pojazdy: " + user.getVehicleTicketPrice());
            System.out.println("Łączny koszt biletów: " + user.getSummaryPriceForThisPersonTickets());
        }

    }
}
