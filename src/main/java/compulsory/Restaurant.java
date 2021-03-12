package compulsory;

import java.time.LocalTime;

public class Restaurant extends Location implements Visitable {


    private LocalTime openingTime, closingTime;

    /**
     * Constructor
     * @param name
     */
    public Restaurant(String name){
        super(name);
    }

    /**
     * setter for openingTime
     * @param openingTime
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * setter for closingTime
     * @param closingTime
     */
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
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
     * getter for closingTime
     * @return
     */
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * setter for  name
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name=name;
    }

}
