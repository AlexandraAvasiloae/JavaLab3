package compulsory;

import java.time.LocalTime;

public class Hotel extends Location implements Visitable, Classifiable, Payable {

    private LocalTime openingTime, closingTime;
    private double ticketPrice;
    private String rank;

    /**
     * Constructor
     * @param name
     */
    public Hotel (String name){
        super(name);
    }

    /**
     * Setter for name
     * @param name
     */
    @Override
    public void setName(String name) {
            this.name=name;
    }

    /**
     * Setter for openingTime
     * @param openingTime
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Getter for opening time
     * @return
     */
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * setter for closingTime
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

    /**
     * setter for rank
     * @param rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * getter for rank
     * @return
     */
    @Override
    public String getRank() {
        return rank;
    }
}
