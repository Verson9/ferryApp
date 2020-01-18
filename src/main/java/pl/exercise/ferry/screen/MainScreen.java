//package pl.exercise.ferry.screen;
//
//import pl.exercise.ferry.pax.PaxType;
//import pl.exercise.ferry.screen.database.User;
//import pl.exercise.ferry.vehicle.VehicleType;
//
//import java.util.Scanner;
//
//public class MainScreen implements Screen {
//
//    private final Scanner sc = new Scanner(System.in);
//    int sumPrice;
//
//    private void firstInteraction() {
//        System.out.println("""
//                Witamy w systemie twój rejs, wybierz akcję:
//                1. Kup bilet
//                2. Zaloguj się
//                3. Zarejestruj się""");
//        if ( sc.nextInt() == 1 ) {
//            System.out.println("Podaj wiek osoby:");
//            int age = sc.nextInt();
//            if ( age < PaxType.CHILD.getUpperAgeLimitExclusive() ) {
//                System.out.println("Cena twojego biletu to " + PaxType.CHILD.getPrice() + "\nTyp biletu to: " + PaxType.CHILD.name());
//                sumPrice += PaxType.CHILD.getPrice();
//            } else if ( age >= PaxType.YOUNG.getLowerAgeLimitInclusive() && age < PaxType.YOUNG.getUpperAgeLimitExclusive() ) {
//                System.out.println("Cena twojego biletu to " + PaxType.YOUNG.getPrice() + "\nTyp biletu to: " + PaxType.YOUNG.name());
//                sumPrice += PaxType.YOUNG.getPrice();
//            } else if ( age >= PaxType.ADULT.getLowerAgeLimitInclusive() && age < PaxType.ADULT.getUpperAgeLimitExclusive() ) {
//                System.out.println("Cena twojego biletu to " + PaxType.ADULT.getPrice() + "\nTyp biletu to: " + PaxType.ADULT.name());
//                sumPrice += PaxType.ADULT.getPrice();
//            } else if ( age >= PaxType.SENIOR.getLowerAgeLimitInclusive() ) {
//                System.out.println("Cena twojego biletu to " + PaxType.SENIOR.getPrice() + "\nTyp biletu to: " + PaxType.SENIOR.name());
//                sumPrice += PaxType.SENIOR.getPrice();
//            } else {
//                MainScreen mainScreen = new MainScreen();
//                mainScreen.display();
//            }
//        } else {
//            System.out.println("Błąd wprowadzania.");
//            MainScreen mainScreen = new MainScreen();
//            mainScreen.display();
//        }
//    }
//
//    private void doYouTakeVehicle() {
//        System.out.println("Czy bierzesz ze sobą pojazd?");
//        sc.nextLine();
//        switch ( sc.nextLine().toLowerCase() ) {
//            case ("tak") -> {
//                System.out.println("Jaki pojazd zabierasz?");
//                int i = 1;
//                for (VehicleType vehicle : VehicleType.values()) {
//
//                    System.out.println(i + " " + vehicle.name());
//                    i++;
//                }
//                chooseVehicle();
//            }
//            case ("nie") -> {
//                System.out.println("Cena rejsu to: " + sumPrice);
//            }
//            default -> doYouTakeVehicle();
//        }
//    }
//
//    private void chooseVehicle() {
//        switch ( sc.nextInt() ) {
//            case 1 -> {
//                System.out.println("Wybrany pojazd to " + VehicleType.CAR.getPolishName());
//                System.out.println(VehicleType.CAR.getPrice());
//                sumPrice += VehicleType.CAR.getPrice();
//                System.out.println("Koszt rejsu to: " + sumPrice);
//            }
//            case 2 -> {
//                System.out.println("Wybrany pojazd to " + VehicleType.BIKE.getPolishName());
//                System.out.println(VehicleType.BIKE.getPrice());
//                sumPrice += VehicleType.BIKE.getPrice();
//                System.out.println("Koszt rejsu to: " + sumPrice);
//            }
//            case 3 -> {
//                System.out.println("Wybrany pojazd to " + VehicleType.BUS.getPolishName());
//                System.out.println("Podaj długość autobusu");
//                int busLength = sc.nextInt();
//                System.out.println("Koszt biletu na autobus to: " + VehicleType.BUS.getPrice() * busLength);
//                sumPrice += VehicleType.BUS.getPrice() * busLength;
//                System.out.println("Koszt rejsu to: " + sumPrice);
//            }
//            case 4 -> {
//                System.out.println("Wybrany pojazd to " + VehicleType.TRUCK.getPolishName());
//                System.out.println("Podaj masę ciężarówki w tonach");
//                int truckMass = sc.nextInt();
//                System.out.println("Koszt biletu na ciężarówkę to: " + VehicleType.TRUCK.getPrice() * truckMass);
//                sumPrice += VehicleType.TRUCK.getPrice() * truckMass;
//                System.out.println("Koszt rejsu to: " + sumPrice);
//            }
//            default -> chooseVehicle();
//        }
//    }
//
//
//    public void display(User user) {
//        firstInteraction();
//        doYouTakeVehicle();
//    }
//}
