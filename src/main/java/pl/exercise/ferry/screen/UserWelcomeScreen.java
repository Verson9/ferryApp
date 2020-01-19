package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;

public class UserWelcomeScreen implements Screen{
    private void sayHello(User user){
        System.out.println("Witaj " + user.getUsername() + '!');
        System.out.println("Właśnie zalogowałeś się do systemu BajkowePodroze.pl");
        System.out.println("Aby się wylogować, wpisz w dowolnym momencie LOGOUT");
    }

    @Override
    public void display(User user) {
        sayHello(user);
    }
}
