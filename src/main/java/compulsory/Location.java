package compulsory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

abstract public class Location implements Comparable<Location> {

    protected String name;
    private Map<Location, Integer> cost = new HashMap<>();

    public Location(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Location o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {

        return "Location{" +
                "name=" + name  +
                '}';
    }

    abstract public void setName(String name);

    public String getName() {
        return name;
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

}
