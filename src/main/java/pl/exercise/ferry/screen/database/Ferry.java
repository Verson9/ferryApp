package pl.exercise.ferry.screen.database;

import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.VehicleTicket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ferry {
    private class FerryNumber{
        BigDecimal ferryNumber = BigDecimal.valueOf(1000000);

        private FerryNumber() {
            this.ferryNumber = BigDecimal.valueOf(ferryNumber.intValue()+1);
        }
        private BigDecimal getFerryNumber(){
            return ferryNumber;
        }
    }
    BigDecimal ferryNumber;
    List<Ticket> ticketList = new ArrayList<>();

    public Ferry() {
        this.ferryNumber = new FerryNumber().getFerryNumber();
    }

}
