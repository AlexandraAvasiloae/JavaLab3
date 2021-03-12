package compulsory;

import java.util.*;

abstract public class Location implements Comparable<Location> {


    protected String name;
    private Map<Location, Integer> cost= new HashMap<>();

    /**
     * Constructor
     * @param name
     */
    public Location(String name) {
        this.name = name;
    }

    /**
     * implementation of compareTo from Comparable
     * @param o
     * @return 0 if the current location name is equal to the other location name.
     *         < 0 if the current location name is lexicographically less than the other location name
     *         > 0 if the current location name is lexicographically greater than the other location name
     */
    @Override
    public int compareTo(Location o) {
        return this.name.compareTo(o.name);
    }

    /**
     *
     * @return the name of current location
     */
    @Override
    public String toString() {

        return "Location{" +
                "name=" + name  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) && Objects.equals(cost, location.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) ;
    }

    /**
     * abstract method which set the location name
     * @param name
     */
    abstract public void setName(String name);

    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter for cost
     * @param node
     * @param value
     */
    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    /**
     * getter for cost
     * @return
     */
    public Map<Location, Integer> getCost() {
        return cost;
    }

}
