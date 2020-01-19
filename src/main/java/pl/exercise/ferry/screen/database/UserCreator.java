package pl.exercise.ferry.screen.database;

import java.util.Scanner;

public class UserCreator {

    private static final Scanner sc = new Scanner(System.in);

    public static User newUserData(){
        User newUser = new User(setUserName(), setUserLogin(), setUserPassword() );
        DataBase.addUserToDataBase(newUser);
        return newUser;
    }

    private static String setUserName(){
        System.out.println("Wprowadź nazwę użytkownika");
        return sc.nextLine();
    }

    private static String setUserLogin(){
        System.out.println("Wprowadź login");
        String login = sc.nextLine();
        if ( DataBase.checkIfLoginIsTaken(login) ) {
            System.out.println("Ten login jest zajęty.");
            return setUserLogin();
        }
        return login;
    }

    private static String setUserPassword(){
        System.out.println("Wprowadź hasło\n" +
                "Hasło musi mieć conajmniej 6 znaków.");
        String password = sc.nextLine();
        if ( checkPassword(password) ){
            return setUserPassword();
        }
        return password;
    }

    private static boolean checkPassword(String password){
        if ( password.length() <6 ){ return true;}
        return false;
    }

}
