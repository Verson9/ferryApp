package pl.exercise.ferry.screen;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.screen.database.User;

import java.util.Scanner;

public class DeterminingThePriceOfAPersonsTicketBasedOnAgeScreen implements Screen {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display(User user) {
        System.out.println("Podaj wiek osoby:");
        int age = sc.nextInt();
        takeTicketPriceFromPaxTypeByAge(user, age);

    }

    private void takeTicketPriceFromPaxTypeByAge(User user, int age) {
        if ( age < PaxType.CHILD.getUpperAgeLimitExclusive() ) {
            displayPriceForChild(user);
        } else if ( age >= PaxType.YOUNG.getLowerAgeLimitInclusive() && age < PaxType.YOUNG.getUpperAgeLimitExclusive() ) {
            displayPriceForYoung(user);
        } else if ( age >= PaxType.ADULT.getLowerAgeLimitInclusive() && age < PaxType.ADULT.getUpperAgeLimitExclusive() ) {
            displayPriceForAdult(user);
        } else if ( age >= PaxType.SENIOR.getLowerAgeLimitInclusive() ) {
            displayPriceForSenior(user);
        } else {
            display(user);
        }
    }

    private void displayPriceForChild(User user) {
        System.out.println("Cena twojego biletu to " + PaxType.CHILD.getPrice() + "\nTyp biletu to: " + PaxType.CHILD.name());
        user.setPersonTicketPrice(PaxType.CHILD.getPrice() + user.getPersonTicketPrice());
        AskingIfYouHaveAnyVehicleScreen askingIfYouHaveAnyVehicleScreen = new AskingIfYouHaveAnyVehicleScreen();
        askingIfYouHaveAnyVehicleScreen.display(user);
    }

    private void displayPriceForYoung(User user) {
        System.out.println("Cena twojego biletu to " + PaxType.YOUNG.getPrice() + "\nTyp biletu to: " + PaxType.YOUNG.name());
        user.setPersonTicketPrice(PaxType.YOUNG.getPrice() + user.getPersonTicketPrice());
        AskingIfYouHaveAnyVehicleScreen askingIfYouHaveAnyVehicleScreen = new AskingIfYouHaveAnyVehicleScreen();
        askingIfYouHaveAnyVehicleScreen.display(user);
    }

    private void displayPriceForAdult(User user) {
        System.out.println("Cena twojego biletu to " + PaxType.ADULT.getPrice() + "\nTyp biletu to: " + PaxType.ADULT.name());
        user.setPersonTicketPrice(PaxType.ADULT.getPrice() + user.getPersonTicketPrice());
        AskingIfYouHaveAnyVehicleScreen askingIfYouHaveAnyVehicleScreen = new AskingIfYouHaveAnyVehicleScreen();
        askingIfYouHaveAnyVehicleScreen.display(user);
    }

    private void displayPriceForSenior(User user) {
        System.out.println("Cena twojego biletu to " + PaxType.SENIOR.getPrice() + "\nTyp biletu to: " + PaxType.SENIOR.name());
        user.setPersonTicketPrice(PaxType.SENIOR.getPrice() + user.getPersonTicketPrice());
        AskingIfYouHaveAnyVehicleScreen askingIfYouHaveAnyVehicleScreen = new AskingIfYouHaveAnyVehicleScreen();
        askingIfYouHaveAnyVehicleScreen.display(user);
    }
}
