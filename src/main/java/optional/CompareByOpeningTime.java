package optional;
import optional.locations.Location;

import java.util.Comparator;

public class CompareByOpeningTime implements Comparator<Location> {
    /**
     * sort the locations by their opening time
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Location o1, Location o2) {
        return o1.getOpeningTime().compareTo(o2.getOpeningTime());
    }
}
