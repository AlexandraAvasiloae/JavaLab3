package compulsory;

import java.time.LocalTime;

public class Church extends Location implements Visitable{

    private LocalTime openingTime, closingTime;

    /**
     * Constructor
     * @param name
     */
    public Church(String name){
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
}
