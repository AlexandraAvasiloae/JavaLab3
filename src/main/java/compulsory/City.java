package compulsory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    private List<Location> nodes = new ArrayList<>();
    private String name;

    public City(String name, List<Location> locationList){
        this.name=name;
        this.nodes=locationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(nodes, city.nodes) && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, name);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\n' +
                "nodes=" + nodes +
                '}';
    }

    public List<Location> getModes() {
        return nodes;
    }

    public void setModes(List<Location> modes) {
        this.nodes = modes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLocation(Location node){
        nodes.add(node);
    }
}
