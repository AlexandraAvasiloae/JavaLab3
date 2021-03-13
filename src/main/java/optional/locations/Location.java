package optional.locations;

import optional.interfaces.Visitable;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

abstract public class Location implements Comparable<Location>, Visitable {

    private String name;
    private Map<Location,Integer> distance=new HashMap<>();
    protected LocalTime openingTime;
    protected LocalTime closingTime;


    /**
     * constructor
     * @param name
     */
    public Location(String name) {
        this.name = name;
        this.openingTime=LocalTime.of(23,59,59);
    }

    /**
     * constructor
     * @param name
     * @param distance
     */
    public Location(String name, Map<Location, Integer> distance) {
        this.name = name;
        this.distance = distance;
        this.openingTime=LocalTime.of(23,59,59);
    }


    @Override
    public int compareTo(Location o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {

        return "The Location is called: "+name;
    }


    public void setName(String name) {
        this.name=name;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public String getName(){
        return this.name;
    }

    public void setDist(Location loc,int value)
    {
        distance.put(loc,value);
    }

    public Map<Location, Integer> getDist() {
        return distance;
    }
}