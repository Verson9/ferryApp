package pl.exercise.ferry.screen.database;

import java.util.LinkedList;
import java.util.List;

public enum DataBase {
    INSTANCE;

    //    private Map<User,> dataBase = new HashMap();
    public static List<User> usersList = new LinkedList<>();
}
