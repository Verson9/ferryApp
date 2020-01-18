package pl.exercise.ferry.screen;

public class ScreenMenager {

    void goToLoginScreen() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.interact();
    }

    void goToSignInScreen() {
        SignInScreen signInScreen = new SignInScreen();
        signInScreen.interact();
    }

    void goToBuyTicketScreen() {
        BuyTicketScreen buyTicketScreen = new BuyTicketScreen();
        buyTicketScreen.interact();
    }
}

