package optional.interfaces;

import optional.Duration;
import java.time.LocalTime;

public interface Visitable {


    /**
     * default method for setting opening time
     */
    default void setOpeningTime(){
        LocalTime openingTime= LocalTime.of(9,30);
    }
    /**
     * default method for setting closing time
     */
    default void setClosingTime(){
        LocalTime closingTime= LocalTime.of(20,00);
    }

    /**
     * static method getVisitingDuration,in the interface Visitable, that returns a Duration object, representing how long a location is opened during a day.
     */
    static Duration getVisitingDuration(LocalTime openingTime, LocalTime closingTime) {
        return new optional.Duration(openingTime,closingTime);
    }

    LocalTime getOpeningTime();
    LocalTime getClosingTime();

}