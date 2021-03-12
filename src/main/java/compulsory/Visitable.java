package compulsory;

import java.time.LocalTime;

public interface Visitable {
    /**
     * getter for openingTime
     * @return
     */

    LocalTime getOpeningTime();

    /**
     * getter for closingTime
     * @return
     */
    LocalTime getClosingTime();
}

