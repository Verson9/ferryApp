package pl.exercise.ferry.screen.database;

import java.util.LinkedList;
import java.util.List;

public class DataBase {

    private static List<User> usersList = new LinkedList<>();

    public void addUserToDataBase() {
        usersList.add(new User());
    }
}
