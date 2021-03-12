package compulsory;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable{

    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    /**
     * Constructor
     * @param name
     */
    public Museum(String name){
        super(name);
    }

    /**
     * setter for name
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name=name;
    }

    /**
     * setter for openingTime
     * @param openingTime
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * getter for openingTime
     * @return
     */
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * setter for closing time
     * @param closingTime
     */
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * getter for closingTime
     * @return
     */
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * setter for ticketPrice
     * @param ticketPrice
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * getter for ticketPrice
     * @return
     */
    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }
}
