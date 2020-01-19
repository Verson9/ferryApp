package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;

public class ScreensManager {
    User user;

    InitialScreenChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn initialScreenChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn = new InitialScreenChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn();
    UserWelcomeScreen userWelcomeScreen = new UserWelcomeScreen();
    DeterminingThePriceOfAPersonsTicketBasedOnAgeScreen determiningThePriceOfAPersonsTicketBasedOnAgeScreen = new DeterminingThePriceOfAPersonsTicketBasedOnAgeScreen();


    private void displayInitialScreenToGetUserType() {
        this.user = initialScreenChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn.display();
    }

    private void displayWelcome(){
        userWelcomeScreen.display(user);
    }

    private void displayPersonAddingScreen(){
        determiningThePriceOfAPersonsTicketBasedOnAgeScreen.display(user);
    }

    public void start() {
        displayInitialScreenToGetUserType();
        displayWelcome();
        displayPersonAddingScreen();
    }

}
