package compulsory;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable{

    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Museum(String name){
        super(name);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }
}
