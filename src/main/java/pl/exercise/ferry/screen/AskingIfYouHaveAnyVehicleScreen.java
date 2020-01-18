package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;
import pl.exercise.ferry.vehicle.VehicleType;

import java.util.Scanner;

public class AskingIfYouHaveAnyVehicleScreen implements Screen {

    private final Scanner sc = new Scanner(System.in);

    private void redirectingToTheVehicleSelectionPageOrDisplayingTheTicketPriceWhenTheUserIsNotTakingTheCar(User user) {

        switch ( sc.nextLine().toLowerCase() ) {
            case ("tak") -> {
                System.out.println("Jaki pojazd zabierasz?");
                int i = 1;
                for (VehicleType vehicle : VehicleType.values()) {

                    System.out.println(i + " " + vehicle.name());
                    i++;
                }
                ChoosingVehicleTypeScreen choosingVehicleTypeScreen = new ChoosingVehicleTypeScreen();
                choosingVehicleTypeScreen.display(user);
            }
            case ("nie") -> System.out.println("Cena rejsu to: " + user.getSummaryPriceForThisPersonTickets());
            default -> redirectingToTheVehicleSelectionPageOrDisplayingTheTicketPriceWhenTheUserIsNotTakingTheCar(user);
        }
    }

    @Override
    public void display(User user) {
        System.out.println("Czy bierzesz ze sobą pojazd?");
        redirectingToTheVehicleSelectionPageOrDisplayingTheTicketPriceWhenTheUserIsNotTakingTheCar(user);
    }
}
