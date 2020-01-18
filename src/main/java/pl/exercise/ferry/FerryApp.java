package pl.exercise.ferry;

import pl.exercise.ferry.screen.ChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn;
import pl.exercise.ferry.screen.database.User;

public class FerryApp {

  public static void main(String[] args) {
    User user = new User();
    ChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn buyingLoggingInOrSigningIn = new ChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn();
    buyingLoggingInOrSigningIn.display(user);
  }
}
