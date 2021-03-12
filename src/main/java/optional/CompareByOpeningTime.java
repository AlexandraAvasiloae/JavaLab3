package optional;
import optional.locations.Location;

import java.util.Comparator;

public class CompareByOpeningTime implements Comparator<Location> {
    @Override
    public int compare(Location o1, Location o2) {
        return o1.getOpeningTime().compareTo(o2.getOpeningTime());
    }
}
