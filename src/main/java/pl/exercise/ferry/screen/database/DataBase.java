package pl.exercise.ferry.screen.database;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DataBase {
    private static final Scanner sc = new Scanner(System.in);
    private static Map<String[], User> usersList = new HashMap<>();

    public static User addUserToDataBase(User newUser) {
        String[] loginAndPassword = {newUser.getLogin(), newUser.getPassword()};
        usersList.put(loginAndPassword, newUser);
        return newUser;
    }

    public static boolean checkIfLoginIsTaken(String login) {
        if ( usersList.entrySet()
                .stream()
                .anyMatch(userEntry -> Objects.equals(userEntry.getKey()[0], login)) ) {
            return true;
        }
        return false;
    }

    public static User logIn() {
        String login = getLogin();
        String password = getPassword();
        String[] logNPass = {login, password};
        boolean goodLogin = false;
        do {
            if ( usersList.containsKey(logNPass) ) {
                goodLogin = true;
                return usersList.get(logNPass);
            } else {
                System.out.println("Błędny login lub hasło");
            }

        } while (!goodLogin);
        return null;
    }

    private static String getLogin() {
        System.out.println("Wpisz login");
        return sc.nextLine();
    }

    private static String getPassword() {
        System.out.println("Wpisz hasło");
        return sc.nextLine();
    }
}
