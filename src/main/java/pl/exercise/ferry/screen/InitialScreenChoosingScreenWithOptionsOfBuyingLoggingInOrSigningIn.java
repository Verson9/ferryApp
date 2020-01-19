package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;
import pl.exercise.ferry.screen.database.UserCreator;

import java.util.Scanner;

public class InitialScreenChoosingScreenWithOptionsOfBuyingLoggingInOrSigningIn {

    private final Scanner sc = new Scanner(System.in);

    private void initialScreen(){
        System.out.println("""
                Witamy w systemie twój rejs, wybierz akcję:
                1. Kup bilet
                2. Zaloguj się
                3. Zarejestruj się""");

    }

    private User chooseOption() {
        User user = null;
        switch ( sc.nextInt() ){
            case 1:
                user = UserCreator.newUserData();
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Błędnie wprowadzone dane.\n" +
                        "Powtórz wprowadzanie.");
                chooseOption();
        }
        return user;
    }

    public User display() {
        initialScreen();
        return chooseOption();
    }
}
