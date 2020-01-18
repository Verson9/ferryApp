package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

  private final Scanner sc = new Scanner(System.in);
  private final ScreenMenager screenMenager = new ScreenMenager();


  public void interact() {
    System.out.println("""
            Witamy w systemie twój rejs, wybierz akcję:
            1. Kup bilet
            2. Zaloguj się
            3. Zarejestruj się""");
    switch ( sc.nextInt() ) {
      case 1:
        screenMenager.goToBuyTicketScreen();
      case 2:
        screenMenager.goToLoginScreen();
      case 3:
        screenMenager.goToSignInScreen();
      default:
    }
  }
}
