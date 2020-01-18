package pl.exercise.ferry.screen;

import pl.exercise.ferry.screen.database.User;
import pl.exercise.ferry.vehicle.VehicleType;

import java.util.Scanner;

public class ChoosingVehicleTypeScreen implements Screen {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display(User user) {
        switch ( sc.nextInt() ) {
            case 1 -> displayCarTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(user);
            case 2 -> displayBikeTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(user);
            case 3 -> displayBusTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(user);
            case 4 -> displayTruckTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(user);
            default -> {
                System.out.println("Błędnie wprowadzony wybór");
                display(user);
            }
        }
    }

    private void displayCarTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(User user) {
        System.out.println("Wybrany pojazd to " + VehicleType.CAR.getPolishName());
        System.out.println(VehicleType.CAR.getPrice());
        user.setVehicleTicketPrice(user.getVehicleTicketPrice() + VehicleType.CAR.getPrice());
        displayFerryCostForThisPerson(user);
    }

    void displayBikeTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(User user) {
        System.out.println("Wybrany pojazd to " + VehicleType.BIKE.getPolishName());
        System.out.println(VehicleType.BIKE.getPrice());
        user.setVehicleTicketPrice(user.getVehicleTicketPrice() + VehicleType.BIKE.getPrice());
        displayFerryCostForThisPerson(user);
    }

    void displayBusTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(User user) {
        System.out.println("Wybrany pojazd to " + VehicleType.BUS.getPolishName());
        int busLength = getBusLength();
        System.out.println("Koszt biletu na autobus to: " + VehicleType.BUS.getPrice() * busLength);
        user.setVehicleTicketPrice(user.getVehicleTicketPrice() + VehicleType.BUS.getPrice() * busLength);
        displayFerryCostForThisPerson(user);
    }

    void displayTruckTicketPriceAddItToUserVehicleTicketPriceAndDisplayFerrySummaryPrice(User user) {
        System.out.println("Wybrany pojazd to " + VehicleType.TRUCK.getPolishName());
        int truckMass = getTruckMass();
        displayTruckTicketPriceByMass(truckMass);
        user.setVehicleTicketPrice(user.getVehicleTicketPrice() + VehicleType.TRUCK.getPrice() * truckMass);
        displayFerryCostForThisPerson(user);
    }

    private int getBusLength() {
        System.out.println("Podaj długość autobusu");
        return sc.nextInt();
    }

    private int getTruckMass() {
        System.out.println("Podaj masę ciężarówki w tonach");
        return sc.nextInt();
    }

    private void displayTruckTicketPriceByMass(int truckMass) {
        System.out.println("Koszt biletu na ciężarówkę to: " + VehicleType.TRUCK.getPrice() * truckMass);
    }

    private void displayFerryCostForThisPerson(User user) {
        System.out.println("Koszt rejsu to: " + user.getSummaryPriceForThisPersonTickets());
    }
}
