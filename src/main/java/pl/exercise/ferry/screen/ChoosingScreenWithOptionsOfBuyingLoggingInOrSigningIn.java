package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;

import java.util.Scanner;

public class ChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn implements Screen {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display(User user) {
        System.out.println("""
                Witamy w systemie twój rejs, wybierz akcję:
                1. Kup bilet
                2. Zaloguj się
                3. Zarejestruj się""");
        chooseOption(user);
    }

    void chooseOption(User user) {
        if ( sc.nextInt() == 1 ) {
            DeterminingThePriceOfAPersonsTicketBasedOnAgeScreen determiningThePriceOfAPersonsTicketBasedOnAgeScreen = new DeterminingThePriceOfAPersonsTicketBasedOnAgeScreen();
            determiningThePriceOfAPersonsTicketBasedOnAgeScreen.display(user);
        }
    }
}
