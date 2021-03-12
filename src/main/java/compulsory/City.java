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

    /**
     * getter for locations nodes like in a graph
     * @return
     */
    public List<Location> getNodes() {
        return nodes;
    }

    /**
     * setter for location nodes like in a graph
     * @param modes
     */
    public void setNodes(List<Location> modes) {
        this.nodes = modes;
    }

    /**
     * getter for name
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * add locations to visit in the city
     * @param node
     */

    public void addLocation(Location node){
        nodes.add(node);
    }
}
